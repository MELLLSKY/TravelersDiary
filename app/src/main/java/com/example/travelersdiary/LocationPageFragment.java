package com.example.travelersdiary;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class LocationPageFragment extends Fragment {
   /* Spinner spinner_city;
    ArrayList<Cities> city_list =new ArrayList<>();
    ArrayAdapter<String> CityArrayAdapter;*/


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_location_page, container, false);


       /* fillData();
        spinner_city =(Spinner) view.findViewById(R.id.spn_city);
        CityArrayAdapter =new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,city_list);
        CityArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_city.setAdapter(CityArrayAdapter);
        spinner_city.setOnItemSelectedListener(this);*/


        return view;
    }

    /*private void fillData() {
        city_list.add(new Cities("muğla, izmir"));
    }

    @Override
    public void onItemSelected (CityArrayAdapter<?> parent, View view, int position, long id){}*/
}