package com.example.user.test1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.user.test1.db.BirdsDb;
import com.example.user.test1.model.Bird;

import java.util.ArrayList;

public class FormActivity extends AppCompatActivity {

    public static ArrayList<Bird> birdsList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button backButton = findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });


        Button nextButton = findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(getApplicationContext(), FormActivity.class);
                //startActivity(i);
                RadioGroup sizeRg = findViewById(R.id.size_rg);
                int id = sizeRg.getCheckedRadioButtonId();
                RadioButton selectedSizeRb = findViewById(id);
                String selectedSize = selectedSizeRb.getText().toString();

                RadioGroup placeRg = findViewById(R.id.place_rg);
                id = placeRg.getCheckedRadioButtonId();
                RadioButton selectedPlaceRb = findViewById(id);
                String selectedPlace = selectedPlaceRb.getText().toString();

                ArrayList<String> colourlist = new ArrayList<>();

                CheckBox greenCb = findViewById(R.id.cb_green);
                CheckBox blueCb = findViewById(R.id.cb_blue);
                CheckBox brownCb = findViewById(R.id.cb_brown);
                CheckBox blackCb = findViewById(R.id.cb_black);
                CheckBox redCb = findViewById(R.id.cb_red);
                CheckBox whiteCb = findViewById(R.id.cb_white);
                CheckBox yellowCb = findViewById(R.id.cb_yellow);
                CheckBox orangeCb = findViewById(R.id.cb_orange);

                if (greenCb.isChecked()) {
                    colourlist.add("green");
                }
                if (blueCb.isChecked()) {
                    colourlist.add("blue");
                }
                if (blackCb.isChecked()) {
                    colourlist.add("black");
                }
                if (brownCb.isChecked()) {
                    colourlist.add("brown");
                }
                if (redCb.isChecked()) {
                    colourlist.add("red");
                }
                if (whiteCb.isChecked()) {
                    colourlist.add("white");
                }
                if (yellowCb.isChecked()) {
                    colourlist.add("yellow");
                }
                if (orangeCb.isChecked()) {
                    colourlist.add("orange");
                }

                ArrayList<String> featureList = new ArrayList<>();
                CheckBox onTreeCb = findViewById(R.id.cb_on_tree);
                CheckBox onGroundCb = findViewById(R.id.cb_on_ground);
                CheckBox onFlyCb = findViewById(R.id.cb_on_fly);
                CheckBox onWaterCb = findViewById(R.id.cb_on_water);

                if (onTreeCb.isChecked()) {
                    featureList.add("on_tree");
                }
                if (onGroundCb.isChecked()) {
                    featureList.add("on_ground");
                }
                if (onWaterCb.isChecked()) {
                    featureList.add("on_water");
                }
                if (onFlyCb.isChecked()) {
                    featureList.add("on_fly");
                }

                BirdsDb birdsDb = new BirdsDb(FormActivity.this);
                SQLiteDatabase db = birdsDb.getWritableDatabase();

                Cursor cursor = db.query(
                        BirdsDb.TABLE_NAME,
                        null,
                        BirdsDb.COL_SIZE + "=?",
                        new String[]{selectedSize},
                        null,
                        null,
                        null

                );
                int birdCount = cursor.getCount();
                Toast.makeText(getApplicationContext(), String.valueOf(birdCount), Toast.LENGTH_SHORT).show();

                birdsList.clear();
                while (cursor.moveToNext()) {
                    long birdId = cursor.getLong( cursor.getColumnIndex(BirdsDb.COL_ID));
                    String name = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_BIRD_NAME));
                    String size = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_SIZE));
                    String colour1 = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_COLOUR_1));
                    String colour2 = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_COLOUR_2));
                    String place1 = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_PLACE_1));
                    String place2 = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_PLACE_2));
                    String feature = cursor.getString( cursor.getColumnIndex(BirdsDb.COL_FEATURE));

                    Bird b= new Bird(
                            birdId,
                            name,
                            colour1,
                            colour2,
                            size,
                            place1,
                            place2,
                            feature
                    );

                    birdsList.add(b);
                }   //ปิดwhile

                Intent i = new Intent(getApplicationContext(), BirdListActivity.class);
                startActivity(i);

            }
        });
    }
}
