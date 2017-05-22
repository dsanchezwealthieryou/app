package com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;

import com.activities.MainActivity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BaseFragment extends Fragment implements View.OnClickListener {

    public MainActivity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getActivity() instanceof MainActivity) {
            activity = ((MainActivity) getActivity());
        }

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread paramThread, Throwable paramThrowable) {
                paramThrowable.printStackTrace(System.out);

                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm");
                //Tracker tracker = AppPreference.getInstance(activity).getDefaultTracker();
                //tracker.send(new HitBuilders.ExceptionBuilder()
                //        .setDescription(sdf.format(new Date()) + "- " + paramThrowable.getMessage() + ": " + Arrays.asList(paramThrowable.getStackTrace()).toString())
                //        .build());
                //GoogleAnalytics.getInstance(getActivity().getApplicationContext()).dispatchLocalHits();

                //Intent intent = new Intent(activity, SplashActivity.class);
                //intent.putExtra("RecoveringFromUncaughtException", true);
                //activity.startActivity(intent);

                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(10);

            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    /**
     * This sets button back press listener
     */
    public void setOnBackPressedListener() {
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    return true;
                }
                return false;

            }
        });
    }

    public void finish() {
        activity.getSupportFragmentManager().beginTransaction().detach(this).commit();
    }
}
