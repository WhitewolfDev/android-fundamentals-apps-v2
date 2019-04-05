package com.whitewolf.mybills;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import com.whitewolf.mybills.BillsContract.*;
import com.whitewolf.mybills.model.Payee;
import com.whitewolf.mybills.model.Payment;

public class BillsDbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "MyBills.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase mDb;

    public BillsDbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
    }

    // called the first time the code accesses this class. For it to run normally again, would have
    // to delete the app and re-install it.
    @Override
    public void onCreate(SQLiteDatabase db) {
        this.mDb = db;

        final String SQL_CREATE_PAYEE_TABLE = "CREATE TABLE " +
                PayeeTable.TABLE_NAME + " ( " +
                PayeeTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PayeeTable.COLUMN_NAME + " TEXT, " +
                PayeeTable.COLUMN_DESC + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_TYPE + " INTEGER, " +
                PayeeTable.COLUMN_PAYEE_ADDRESS1 + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_ADDRESS2 + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_ADDRESS3 + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_CITY + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_STATE + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_ZIPCODE + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_PHONE + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_FAX + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_TTY + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_WEBPAGE + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_CONTACT_NAME + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_CONTACT_PHONE + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_CONTACT_FAX + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_CONTACT_EMAIL + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_USERNAME + " TEXT, " +
                PayeeTable.COLUMN_PAYEE_PASSWORD + " TEXT " +
                ")";

        db.execSQL(SQL_CREATE_PAYEE_TABLE);

        final String SQL_CREATE_PAYMENTS_TABLE = "CREATE TABLE " +
                PaymentTable.TABLE_NAME + " ( " +
                PaymentTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PaymentTable.COLUMN_PAYEE_ID + " INTEGER, " +
                PaymentTable.COLUMN_PAYMENT_DESC + " TEXT, " +
                PaymentTable.COLUMN_PAYMENT_METHOD + " INTEGER, " +
                PaymentTable.COLUMN_PAYMENT_FREQUENCY + " INTEGER, " +
                PaymentTable.COLUMN_PAYMENT_DUE_DATE + " TEXT, " +
                PaymentTable.COLUMN_PAYMENT_DUE_AMOUNT + " CURRENCY, " +
                PaymentTable.COLUMN_PAYMENT_DURATION + " INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_PAYMENTS_TABLE);

        // to pre-fill with information
        fillBillInfo(db);

    }

    // This will run when the version number is incremented.  To make this work...
    // delete the old table and call onCreate() again (artificially)

    // this is mainly used if the app is already in production.  However, what to do if it is a table
    // that would house user data.  Would you really want to delete the user data?
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // delete table
        db.execSQL("DROP TABLE IF EXISTS " + PayeeTable.TABLE_NAME);

        // re-run the table creation process
        onCreate(db);
    }

    private void fillBillInfo(SQLiteDatabase db) {
        Payee payee1 = new Payee("Faith Baptist Church", "Do we really need this field?",
                2, "5714 29th Street Northeast", "", "",
                "Tacoma", "WA", "98422",
                "2539277673", "", "",
                "www.foundedonfaith.com", "", "",
                "", "", "scottmartens43@gmail.com",
                "R4XX8FXS" );
        addPayee(payee1);
        Payee payee2 = new Payee("KeyBank", "Do we really need this field?",
                1, "1918 SW Campus Dr", "", "",
                "Federal Way", "WA", "98023",
                "2538388550", "", "",
                "www.key.com", "Sarah Whitaker",
                "2068702541", "2538741453",
                "Sarah_E_Whitaker@keybank.com",
                "wolfpackwhitefang", "!Starcraft4");
        addPayee(payee2);

        Payee payee3 = new Payee("CitiBank/BestBuy", "In store bank card",
                1, "P.O. Box 790441", "", "",
                "St. Louis", "MO", "631790441",
                "18885741301", "", "",
                "https://citiretailservices.citibankonline.com/RSnextgen/svc/launch/index.action?siteId=PLCN_BESTBUY#signon",
                "", "", "", "", "Wolfpack777", "!Starcraft33");
        addPayee(payee3);

        Payee payee4 = new Payee("fedloan Servicing", "Federal Student Loans",
                1, "Department of Education", "FedLoan Servicing", "P.O. Box 530210",
                "Atlanta", "GA", "303530210",
                "18006992908", "", "711",
                "www.myfedloan.org",
                "", "", "", "",
                "Wolfpack1970", "StarCraft2");
        addPayee(payee4);

        Payee payee5 = new Payee("Amazon", "Amazon Store Card", 1,
                "", "", "",
                "", "", "",
                "", "", "", "www.amazon.com", "",
                "", "", "", "", "");
        Payee payee6 = new Payee("", "", 1, "", "", "",
                "", "", "",
                "", "", "", "", "",
                "", "", "", "", "");
        Payee payee7 = new Payee("", "", 1, "", "", "",
                "", "", "",
                "", "", "", "", "",
                "", "", "", "", "");
        Payee payee8 = new Payee("", "", 1, "", "", "",
                "", "", "",
                "", "", "", "", "",
                "", "", "", "", "");

        Payment payment1 = new Payment(1, "Tithe", 1,
                4,"04/07/2019",250.00f,0);

        Payment payment2 = new Payment(1, "Missions", 1,
                4,"04/07/2019",60.00f,0);

        Payment payment3 = new Payment(1, "Bible Paper Roll", 1,
                4,"04/07/2019",25.00f,0);

        Payment payment4 = new Payment(2, "Heloc", 1,
                4,"04/11/2019",206.35f,0);
    }

    private void addPayee(Payee payee) {
        ContentValues cv = new ContentValues();

        cv.put(PayeeTable.COLUMN_NAME, payee.getPayee_name());
        cv.put(PayeeTable.COLUMN_DESC, payee.getPayee_description());
        cv.put(PayeeTable.COLUMN_PAYEE_TYPE, payee.getPayee_type());
        cv.put(PayeeTable.COLUMN_PAYEE_ADDRESS1, payee.getPayee_addressLine1());
        cv.put(PayeeTable.COLUMN_PAYEE_ADDRESS2, payee.getPayee_addressLine2());
        cv.put(PayeeTable.COLUMN_PAYEE_ADDRESS3, payee.getPayee_addressLine3());
        cv.put(PayeeTable.COLUMN_PAYEE_CITY, payee.getPayee_city());
        cv.put(PayeeTable.COLUMN_PAYEE_STATE, payee.getPayee_state());
        cv.put(PayeeTable.COLUMN_PAYEE_ZIPCODE, payee.getPayee_zipcode());
        cv.put(PayeeTable.COLUMN_PAYEE_PHONE, payee.getPayee_main_phone());
        cv.put(PayeeTable.COLUMN_PAYEE_FAX, payee.getPayee_contact_fax());
        cv.put(PayeeTable.COLUMN_PAYEE_TTY, payee.getPayee_main_tty());
        cv.put(PayeeTable.COLUMN_PAYEE_WEBPAGE, payee.getPayee_main_webpage());
        cv.put(PayeeTable.COLUMN_PAYEE_CONTACT_NAME, payee.getPayee_contact_name());
        cv.put(PayeeTable.COLUMN_PAYEE_CONTACT_PHONE, payee.getPayee_contact_phone());
        cv.put(PayeeTable.COLUMN_PAYEE_CONTACT_FAX, payee.getPayee_contact_fax());
        cv.put(PayeeTable.COLUMN_PAYEE_CONTACT_EMAIL, payee.getPayee_contact_email());
        cv.put(PayeeTable.COLUMN_PAYEE_USERNAME, payee.getPayee_username());
        cv.put(PayeeTable.COLUMN_PAYEE_PASSWORD, payee.getPayee_password());

        mDb.insert(PayeeTable.TABLE_NAME, null, cv);
    }
}
