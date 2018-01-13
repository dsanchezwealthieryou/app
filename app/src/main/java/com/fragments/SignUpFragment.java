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
import com.database.DBSqlHelper;
import com.database.UserContract;
import com.models.User;

import java.util.Date;
import java.util.UUID;

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
        Date dateAdded = new Date();
        User user = new User("dsanchez",
                "12345",
                dateAdded,
                dateAdded,
                "David",
                "Sanchez",
                null,
                null);
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

    //FIXME This has to be in some other class
    public void addUser(User user) {
        DBSqlHelper mDbHelper = new DBSqlHelper(getContext());
        SQLiteDatabase db = mDbHelper.getWritableDatabase(); //FIXME this has to be executed as a AsyncTask
        ContentValues values = new ContentValues();
        values.put(UserContract.UserEntry.COLUMN_NAME_FIRST_NAME, user.getFirstName());
        values.put(UserContract.UserEntry.COLUMN_NAME_LAST_NAME, user.getLastName());
        // Inserting Row
        db.insert(UserContract.UserEntry.TABLE_NAME, null, values);
        db.close(); // Closing database connection
    }
}
