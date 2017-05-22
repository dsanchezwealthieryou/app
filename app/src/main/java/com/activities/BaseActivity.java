package com.activities;

import android.app.Dialog;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private Dialog loadingDialog;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    public abstract void initComponents();

    public abstract void setListeners();

    public void showLoadingDialog(String title, final boolean isCancelable) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (loadingDialog != null){
                        loadingDialog.dismiss();
                    }
                    if (loadingDialog == null || !loadingDialog.isShowing()) {
                        //loadingDialog = new Dialog(BaseActivity.this , R.style.LoadingTheme);
                        loadingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        //loadingDialog.setContentView(R.layout.loading_dialog);
                        loadingDialog.setCancelable(isCancelable);
                        loadingDialog.show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hideLoadingDialog() {
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
    }

    @Override
    protected void onResume() {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onResume();
    }

}
