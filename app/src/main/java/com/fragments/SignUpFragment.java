package com.fragments;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.activities.R;
import com.models.User;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.view.View.GONE;

/**
 * Created by User on 10-May-17.
 */

public class SignUpFragment extends BaseFragment{

    @BindView(R.id.edit_text_username)
    EditText etUserName;
    @BindView(R.id.edit_text_password)
    EditText etPassword;

    private View rootView;

    public static SignUpFragment getInstance() {
        return new SignUpFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_sign_up, container, false);
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
        switch (v.getId()){
            case R.id.button_sign_up:
                signUp();
        }
    }

    /**
     *
     */
    public void signUp(){
        //FIXME add real data from user input
        User user = new User(null,null,null,null,null,null,null);
        addUser(user);
    }

    /**
     * Method to validate fields in Sign Up
     * @return
     */
    public boolean validateFields(){
        boolean areFieldsValid;
        //Validate username

        //Validate password

        return true;
    }


    public void addUser(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, shop.getName()); // Shop Name
        values.put(KEY_SH_ADDR, shop.getAddress()); // Shop Phone Number
        // Inserting Row
        db.insert(TABLE_SHOPS, null, values);
        db.close(); // Closing database connection
    }
}
