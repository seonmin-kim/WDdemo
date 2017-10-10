package com.example.wishingnote.wddemo.fragment.menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;
import com.example.wishingnote.wddemo.fragment.BaseFragment;
import com.example.wishingnote.wddemo.fragment.ad.FragementAD1;
import com.example.wishingnote.wddemo.fragment.ad.FragementAD2;
import com.example.wishingnote.wddemo.fragment.ad.FragementAD3;

public class FragmentHome extends BaseFragment {
    private ViewPager viewPager;
    private FragmentAdapter fragmentAdapter;
    private FragementAD1 ad1 = FragementAD1.newInstance();
    private FragementAD2 ad2 = FragementAD2.newInstance();
    private FragementAD3 ad3 = FragementAD3.newInstance();

    public static FragmentHome newInstance(int position) {
        FragmentHome fragment = new FragmentHome();
        Bundle bundle = new Bundle();
        bundle.putInt("pos", position);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    protected void init(View view) {
        viewPager = (ViewPager)view.findViewById(R.id.pager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    class FragmentAdapter extends FragmentStatePagerAdapter{
        public FragmentAdapter(FragmentManager fm) {
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

}
