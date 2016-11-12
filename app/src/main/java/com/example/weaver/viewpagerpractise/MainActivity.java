package com.example.weaver.viewpagerpractise;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting view pager

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new NumberPagerAdapter(getSupportFragmentManager()));

        //setting tab below

        TabLayout tabLayout = (TabLayout) findViewById(R.id.view_pager_tab);
        tabLayout.setupWithViewPager(viewPager);
        //why do we cancel this line? and why do we keep it in this version?
        //Ok this line will make the appbar in different color with pager
        //tabLayout.setBackgroundResource(R.color.tab_bg);

        //This is to remove the shadow
        //But now we don't need it anymore? why？


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_favorite_white_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_white_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_phone_white_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_mail_white_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_settings_white_24dp);
        getSupportActionBar().setElevation(0);
    }

    private  class NumberPagerAdapter extends FragmentPagerAdapter {
        public NumberPagerAdapter(FragmentManager fragmentManager) {

            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {

            return PageFragment.newInstance(position);
        }

        @Override
        public int getCount() {

            return 5;
        }
        /* don't need it any more, cause we got icons
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
        */
    }
}
