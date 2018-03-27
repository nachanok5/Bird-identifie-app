package com.example.user.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChooseInputTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_input_type);

        Button formButton = findViewById(R.id.form_input_button);
        Button imageButton = findViewById(R.id.image_button);


        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FormActivity.class);
                startActivity(i);
            }
        });
    }
}
