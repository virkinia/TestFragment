package com.example.testfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HeaderFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_header, container, false);

        TextView etHeader = view.findViewById(R.id.etHeader);
        etHeader.setText("HOLINCHI");
        etHeader.setTextSize(40);

        // Inflate the layout for this fragment
        return view;


    }




}
