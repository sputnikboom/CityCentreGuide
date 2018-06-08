package com.example.rachael.citycentreguide;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.os.Bundle;

/**
 * Displays a {@link ViewPager} tab
 * where each page is a different location category
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finds the ViewPager that can swipe between pages
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Adapter to know which page should be shown
        CategoryFragmentAdapter adapter = new CategoryFragmentAdapter(this, getSupportFragmentManager());

        // Links adapter to the ViewPager
        viewPager.setAdapter(adapter);

        // tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
