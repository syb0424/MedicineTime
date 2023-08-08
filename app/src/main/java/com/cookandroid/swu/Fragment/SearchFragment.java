package com.cookandroid.swu.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cookandroid.swu.DsSearch;
import com.cookandroid.swu.PillSearch;
import com.cookandroid.swu.R;
import com.cookandroid.swu.RecomMainActivity;

public class SearchFragment extends Fragment {

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("검색");
    }

    TextView pill,drugstore, recom_pill;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        pill = (TextView)v.findViewById(R.id.search_pill);
        pill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getActivity(), PillSearch.class);
                startActivity(intent);
            }
        });
        drugstore = (TextView) v.findViewById(R.id.search_drugstore);
        drugstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DsSearch.class);
                startActivity(intent);
            }
        });

        recom_pill = (TextView)v.findViewById(R.id.search_recompill);
        recom_pill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecomMainActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}