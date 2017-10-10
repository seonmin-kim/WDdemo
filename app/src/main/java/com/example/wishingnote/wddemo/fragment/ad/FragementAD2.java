package com.example.wishingnote.wddemo.fragment.ad;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;

public class FragementAD2 extends Fragment {
    public FragementAD2() {
    }
    public static FragementAD2 newInstance() {
        FragementAD2 fragment = new FragementAD2();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ad2, container, false);
    }

}
