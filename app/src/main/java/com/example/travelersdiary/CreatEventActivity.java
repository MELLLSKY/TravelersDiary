package com.example.travelersdiary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class CreatEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_event);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainerViewCreatEventPage, new CreatEventPageFragment());
        fragmentTransaction.add(R.id.fragmentContainerViewDatePage, new DatePageFragment());
        fragmentTransaction.add(R.id.fragmentContainerViewLocationPage, new LocationPageFragment());
        fragmentTransaction.add(R.id.fragmentContainerViewTimePage, new TimePageFragment());
        fragmentTransaction.add(R.id.fragmentContainerViewTopicPage, new TopicPageFragment());
        fragmentTransaction.commit();
    }

}