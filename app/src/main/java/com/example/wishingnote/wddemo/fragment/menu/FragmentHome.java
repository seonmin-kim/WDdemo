package com.example.wishingnote.wddemo.fragment.menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;
import com.example.wishingnote.wddemo.fragment.BaseFragment;
import com.example.wishingnote.wddemo.fragment.pager.FragementAD1;
import com.example.wishingnote.wddemo.fragment.pager.FragementAD2;
import com.example.wishingnote.wddemo.fragment.pager.FragementAD3;
import com.example.wishingnote.wddemo.fragment.pager.FragementCol1;
import com.example.wishingnote.wddemo.fragment.pager.FragementCol2;
import com.example.wishingnote.wddemo.fragment.pager.FragementCol3;
import com.example.wishingnote.wddemo.fragment.pager.FragementCol4;

import me.relex.circleindicator.CircleIndicator;

public class FragmentHome extends BaseFragment {
    private ViewPager viewPager, colViewPager;
    private MyFragmentAdapter fragmentAdapter;
    private ColFragmentAdapter colFragmentAdapter;
    private FragementAD1 ad1 = FragementAD1.newInstance();
    private FragementAD2 ad2 = FragementAD2.newInstance();
    private FragementAD3 ad3 = FragementAD3.newInstance();
    private FragementCol1 col1 = FragementCol1.newInstance();
    private FragementCol2 col2 = FragementCol2.newInstance();
    private FragementCol3 col3 = FragementCol3.newInstance();
    private FragementCol4 col4 = FragementCol4.newInstance();
    private static int pos;

    public static FragmentHome newInstance() {
        FragmentHome fragment = new FragmentHome();
        return fragment;
    }
    @Override
    protected void init(View view) {
        viewPager = (ViewPager)view.findViewById(R.id.pager);
        CircleIndicator circleIndicator = (CircleIndicator)view.findViewById(R.id.indicator);
        fragmentAdapter = new MyFragmentAdapter(((AppCompatActivity) getActivity()).getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);
        circleIndicator.setViewPager(viewPager);
        // 요아래가안대 -> 아래건 indicator 를 viewpager 하는건데 영상을 보기에는 점이 잘 움직여요
        colViewPager = view.findViewById(R.id.columnPager);
        CircleIndicator indicator = (CircleIndicator)view.findViewById(R.id.columnIndicator);
        colFragmentAdapter = new ColFragmentAdapter(((AppCompatActivity)getActivity()).getSupportFragmentManager());
        colViewPager.setAdapter(colFragmentAdapter);
        indicator.setViewPager(colViewPager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    class MyFragmentAdapter extends FragmentStatePagerAdapter{
        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return ad1;
                case 1:
                    return ad2;
                case 2:
                    return ad3;
                default:
                    return ad1;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
    class ColFragmentAdapter extends FragmentStatePagerAdapter{
        public ColFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            switch (i){
                case 0:
                    return col1;
                case 1:
                    return col2;
                case 2:
                    return col3;
                case 3:
                    return col4;
                default:
                    return col1;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

}
