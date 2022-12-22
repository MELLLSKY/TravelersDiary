package com.example.travelersdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    Button newEventButton;
    Button editEventButton;
    ImageView profilePhoto;
    EditText goalsText;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        profilePhoto=findViewById(R.id.img_profile);
        goalsText=findViewById(R.id.txt_goalsview);

        newEventButton=findViewById(R.id.btn_new_event);
        newEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CreatEventPage.class));
            }
        });

        editEventButton=findViewById(R.id.btn_edit);
        editEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CreatEventPage.class));
            }
        });
    }








}