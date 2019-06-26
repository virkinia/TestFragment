package com.example.testfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class FooterFragment extends Fragment {

    private EditText editText;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_footer, container, false);

        TextView etFooter = view.findViewById(R.id.etFooter);
        etFooter.setText("HOLINCHI");
        etFooter.setTextSize(40);

        // Inflate the layout for this fragment
        return view;


    }

}
