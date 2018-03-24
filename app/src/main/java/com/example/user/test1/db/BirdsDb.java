package com.example.user.test1.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 19/3/2561.
 */

public class BirdsDb extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="bird.db";
    private static final int DATABASE_version=1;
    public static final String TABLE_NAME="birds";
    public static final String COL_ID="_id";
    public static final String COL_BIRD_NAME="bird_name";
    public static final String COL_COLOUR_1="colour1";
    public static final String COL_COLOUR_2="colour2";
    public static final String COL_SIZE="size";
    public static final String COL_PLACE_1="place1";
    public static final String COL_PLACE_2="place2";

    private static final String SQL_CREATE_TABLE= "CREATE TABLE " +TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_BIRD_NAME + " TEXT,"
            + COL_COLOUR_1 + " TEXT,"
            + COL_COLOUR_2 + " TEXT,"
            + COL_SIZE + " TEXT,"
            + COL_PLACE_1 + " TEXT,"
            + COL_PLACE_2 + " TEXT"
            +")";

    public BirdsDb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);

        insertInitialData(sqLiteDatabase);
    }

    private void insertInitialData(SQLiteDatabase sqLiteDatabase) {
        ContentValues cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกพิราบป่า");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

         cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเขาชวา");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกระจอกบ้าน");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกตีทอง");
        cv.put(COL_COLOUR_1, "green");
        cv.put(COL_COLOUR_2, "yellow");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกตะขาบทุ่ง");
        cv.put(COL_COLOUR_1, "blue");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกะเต็นน้อยธรรมดา");
        cv.put(COL_COLOUR_1, "blue");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกะเต็นอกขาว");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "blue");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกะเต็นอกดำ");
        cv.put(COL_COLOUR_1, "blue");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกจาบคาหัวเขียว ");
        cv.put(COL_COLOUR_1, "green");
        cv.put(COL_COLOUR_2, "blue");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกอีวาบตั๊กแตน");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "yellow");
        cv.put(COL_SIZE, "21-30");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกบั้งรอกใหญ่");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "51-60cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกะปูดใหญ่");
        cv.put(COL_COLOUR_1, "red");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "51-60cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกแอ่น");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกแสก");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเค้าจุด");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเค้าโมง");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเขาใหญ่");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเขาไฟ");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกฮูก");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเขาเปล้าธรรมดา");
        cv.put(COL_COLOUR_1, "green");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "city");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกวัก");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกพริก");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "brown");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกตีนเทียน");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกระแตแต้แว้ด");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);


        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "เหยี่ยวแดง");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "เหยี่ยวนกเขาชิครา");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "31-40cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกาน้ำเล็ก");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "51-60cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางเปีย");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "51-60cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางโทนใหญ่");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "91-100cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางโทนน้อย");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "61-70cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางควาย");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "orange");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางกรอก(นอกฤดูผสมพันธ์ุ)");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "brown");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางกรอกพันธุ์ชวา(ในฤดูผสมพันธ์ุ)");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "brown");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกยางกรอกพันธุ์จีน(ในฤดูผสมพันธ์ุ)");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "brown");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกปากห่าง");
        cv.put(COL_COLOUR_1, "white");
        cv.put(COL_COLOUR_2, "black");
        cv.put(COL_SIZE, "71-80cm");
        cv.put(COL_PLACE_1, "field");
        cv.put(COL_PLACE_2, "wetland");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกอีกา");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "field");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกาเหว่า");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "41-50cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกขมิ้นท้ายทอยดำ");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "yellow");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกพญาไฟเล็ก");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกอีแพรดแถบอกดำ");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกแซงแซวหางปลา");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกแซงแซวสีเทา");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกขมิ้นน้อยธรรมดา");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "yellow");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกจับแมลงคอแดง");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "8-10cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกจับแมลงสีน้ำตาล");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "8-10cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกางเขนบ้าน");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเอี้ยงด่าง");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "wetland");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเอี้ยงสาริกา");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "brown");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกเอี้ยงหงอน");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกิ้งโครงคอดำ");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "21-30cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกปรอดหัวสีเขม่า");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกปรอดสวน");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกปรอดหน้านวล");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "white");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกสีชมพูสวน");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "red");
        cv.put(COL_SIZE, "8-10cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกินปลีอกเหลือง");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "yellow");
        cv.put(COL_SIZE, "8-10cm");
        cv.put(COL_PLACE_1, "garden");
        cv.put(COL_PLACE_2, "");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกระจอกใหญ่");
        cv.put(COL_COLOUR_1, "black");
        cv.put(COL_COLOUR_2, "brown");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกระจอกตาล");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "field");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกระติ๊ดขี้หมู");
        cv.put(COL_COLOUR_1, "brown");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

        cv = new ContentValues();
        cv.put(COL_BIRD_NAME, "นกกระจอกชวา");
        cv.put(COL_COLOUR_1, "grey");
        cv.put(COL_COLOUR_2, "");
        cv.put(COL_SIZE, "11-20cm");
        cv.put(COL_PLACE_1, "city");
        cv.put(COL_PLACE_2, "garden");
        sqLiteDatabase.insert(TABLE_NAME,null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
