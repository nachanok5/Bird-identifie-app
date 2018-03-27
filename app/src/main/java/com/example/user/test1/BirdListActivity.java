package com.example.user.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.user.test1.adapter.BirdListAdapter;

import static com.example.user.test1.FormActivity.birdsList;

public class BirdListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_list);

        ListView birdsListBView = findViewById(R.id.birds_list_view);

        //ArrayAdapter adapter = new ArrayAdapter<>(
           //     this,
            //    android.R.layout.simple_list_item_1,
            //    birdsList
       // );
        BirdListAdapter adapter = new BirdListAdapter(
                this,
                R.layout.item,
                birdsList
        );

        birdsListBView.setAdapter(adapter);
    }
}
