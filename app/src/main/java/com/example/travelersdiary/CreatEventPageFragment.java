package com.example.travelersdiary;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CreatEventPageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_creat_event_page,container,false);

        Button btnChooseTopic = (Button)view.findViewById(R.id.btn_topic);
        btnChooseTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.fragmentContainerViewCreatEventPage, new TopicPageFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });


        Button btnChooseDate = (Button)view.findViewById(R.id.btn_date);
        btnChooseDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.fragmentContainerViewCreatEventPage, new DatePageFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        Button btnChooseCity = (Button)view.findViewById(R.id.btn_city);
        btnChooseCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.fragmentContainerViewCreatEventPage, new LocationPageFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        Button btnChooseTime = (Button)view.findViewById(R.id.btn_time);
        btnChooseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getParentFragmentManager().beginTransaction();
                fr.replace(R.id.fragmentContainerViewCreatEventPage, new TimePageFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });
        return view;

    }
}