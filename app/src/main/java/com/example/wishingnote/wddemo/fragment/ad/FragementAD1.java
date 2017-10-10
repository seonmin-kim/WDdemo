package com.example.wishingnote.wddemo.fragment.ad;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;

public class FragementAD1 extends Fragment {
    public FragementAD1() {
    }
    public static FragementAD1 newInstance() {
        FragementAD1 fragment = new FragementAD1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ad1, container, false);
    }

}
