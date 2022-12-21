package com.example.travelersdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatEventPage extends AppCompatActivity {

    Button createEventButton;

    Button chooseTopicButton;
    Button chooseCityButton;
    Button chooseDateButton;
    Button chooseTimeButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_event_page);

        createEventButton=findViewById(R.id.btn_create);
        createEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreatEventPage.this,MainActivity.class));


            }
        });

        chooseTopicButton=findViewById(R.id.btn_topic);
        chooseTopicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreatEventPage.this,TopicPage.class));


            }
        });

        chooseCityButton=findViewById(R.id.btn_city);
        chooseCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreatEventPage.this,LocationPage.class));


            }
        });

        chooseDateButton=findViewById(R.id.btn_date);
        chooseDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreatEventPage.this,DatePage.class));


            }
        });

        chooseTimeButton=findViewById(R.id.btn_time);
        chooseTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreatEventPage.this,TimePage.class));


            }
        });


    }
}