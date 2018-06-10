package com.example.rachael.citycentreguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Returns the appropriate {@link Fragment} for a given view page tab
 */

public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    // identifies which fragment should be shown on which tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodDrinkFragment();
        } else if (position == 1) {
            return new TheatreFragment();
        } else if (position == 2) {
            return new ArtsFragment();
        } else {
            return new TravelFragment();
        }
    }

    // assigns title to each tab for easier navigation
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.food_drink);
        } else if (position == 1) {
            return mContext.getString(R.string.theatre);
        } else if (position == 2) {
            return mContext.getString(R.string.arts);
        } else {
            return mContext.getString(R.string.travel);
        }
    }
}
