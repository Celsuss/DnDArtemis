package com.example.artemis.dndartemis;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 *  FragmentPagerAdapter:
 *  This is best when navigating between sibling screens representing a fixed, small number of pages.
 *
 *  FragmentStatePagerAdapter:
 *  This is best for paging across a collection of objects for which the number of pages is undetermined.
 *  It destroys fragments as the user navigates to other pages, minimizing memory usage.
 */

//public class SwipeAdapter extends FragmentStatePagerAdapter {
public class SwipeAdapter extends FragmentPagerAdapter {
    public SwipeAdapter(FragmentManager fm) { super(fm); }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new StatsFragment();
            case 1:
                return new CombatFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
