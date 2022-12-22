package com.example.travelersdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopicPage extends AppCompatActivity {

    Button saveTopicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_page);

        saveTopicButton=findViewById(R.id.btn_save_topic);
        saveTopicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TopicPage.this,CreatEventPage.class));


            }
        });
    }
}