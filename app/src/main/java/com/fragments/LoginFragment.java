package com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.activities.R;

import butterknife.ButterKnife;

import static android.view.View.GONE;

/**
 * Created by User on 10-May-17.
 */

public class LoginFragment extends BaseFragment{

    private View rootView;

    public static LoginFragment getInstance() {
        return new LoginFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_login, container, false);
        }
        initComponents();
        setListeners();
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    public void initComponents(){
        //Hide fab in this fragment
        activity.setFabVisibility(GONE);
        //Hide toolbar in this fragment
        activity.setToolbarVisibility(GONE);
    }

    public void setListeners(){

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }

}
