package com.database;

import android.provider.BaseColumns;

/**
 * Created by User on 15-May-17.
 */

public final class UserContract {

    private UserContract() {}

    public static class UserEntry implements BaseColumns {
        public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";
        public static final String COLUMN_NAME_MIDDLE_NAME = "last_name";
    }

}
