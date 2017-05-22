package com.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fragments.LoginFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

//BaseActivity is a class that standarizes actions for all the activities
public class MainActivity extends BaseActivity {
    //Bind is used from Butterknife to easily import he xml resources
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        //Show LoginFragment
        replaceFragment(LoginFragment.getInstance(),false,true);
    }

    @Override
    public void initComponents() {

    }

    @Override
    public void setListeners() {

    }

    @Override
    public void onClick(View v) {

    }

    /**
     * @param fragment
     * @param needToAddBackStack
     * @param clearStack
     */
    public void replaceFragment(final Fragment fragment, final boolean needToAddBackStack, boolean clearStack) {
        final FragmentManager fm = getSupportFragmentManager();
        final FragmentTransaction ft = fm.beginTransaction();
        if (needToAddBackStack && !clearStack) {
            //ft.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
            ft.replace(R.id.frame_layout_container, fragment).addToBackStack(fragment.getClass().getSimpleName()).commit();
        } else {
            ft.replace(R.id.frame_layout_container, fragment).commitAllowingStateLoss();
        }
    }

    public void setFabVisibility(int visibility){
        fab.setVisibility(visibility);
    }

    public void setToolbarVisibility(int visibility){
        fab.setVisibility(visibility);
    }
}
