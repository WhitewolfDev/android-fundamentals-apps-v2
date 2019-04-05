package com.whitewolf.mybills;

import android.provider.BaseColumns;

public class BillsContract {

    // keeps anyone from instantiating this class
    private BillsContract() {}

    // static means no instance of the class needs to be created to use
    // the public methods or properties.
    // final means that the values will not change.
    public static class PayeeTable implements BaseColumns {
        public static final String TABLE_NAME = "payees";
        public static final String COLUMN_NAME = "payee";
        public static final String COLUMN_DESC = "description";
        public static final String COLUMN_PAYEE_TYPE = "payee_type_id";
        public static final String COLUMN_PAYEE_ADDRESS1 = "payee_address1";
        public static final String COLUMN_PAYEE_ADDRESS2 = "payee_address2";
        public static final String COLUMN_PAYEE_ADDRESS3 = "payee_address3";
        public static final String COLUMN_PAYEE_CITY = "payee_city";
        public static final String COLUMN_PAYEE_STATE = "payee_state";
        public static final String COLUMN_PAYEE_ZIPCODE = "payee_zipcode";
        public static final String COLUMN_PAYEE_PHONE = "payee_main_phone";
        public static final String COLUMN_PAYEE_FAX = "payee_main_fax";
        public static final String COLUMN_PAYEE_TTY = "payee_main_tty";
        public static final String COLUMN_PAYEE_WEBPAGE = "payee_main_webpage";
        public static final String COLUMN_PAYEE_CONTACT_NAME = "payee_contact_name";
        public static final String COLUMN_PAYEE_CONTACT_PHONE = "payee_contact_phone";
        public static final String COLUMN_PAYEE_CONTACT_FAX = "payee_contact_fax";
        public static final String COLUMN_PAYEE_CONTACT_EMAIL = "payee_contact_email";
        public static final String COLUMN_PAYEE_USERNAME = "username";
        public static final String COLUMN_PAYEE_PASSWORD = "password";
    }

    public static class PaymentTable implements BaseColumns {
        public static final String TABLE_NAME = "payments";
        public static final String COLUMN_PAYEE_ID = "payee_id";
        public static final String COLUMN_PAYMENT_DESC = "payment_description";
        public static final String COLUMN_PAYMENT_METHOD = "payment_method";
        public static final String COLUMN_PAYMENT_FREQUENCY = "payment_frequency";
        public static final String COLUMN_PAYMENT_DURATION = "payment_duration";
        public static final String COLUMN_PAYMENT_DUE_DATE = "payemnt_due_date";
        public static final String COLUMN_PAYMENT_DUE_AMOUNT = "payment_due_amount";


    }
}
