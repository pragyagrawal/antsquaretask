package com.example.pragyaagrawal.antsquaretask.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pragyaagrawal.antsquaretask.fragments.FacebookFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.PhotosFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.TwitterFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.YelpFragment;

/**
 * Created by Pragya Agrawal on 12/2/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_ITEMS = 4;
    private Context context;
    private String facebook, twitter, yelp;

    public PagerAdapter(FragmentManager manager, Context context, String facebook, String twitter, String yelp) {
        super(manager);
        this.context = context;
        this.facebook = facebook;
        this.twitter = twitter;
        this.yelp = yelp;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return PhotosFragment.newInstance();
            case 1:
                return YelpFragment.newInstance(yelp);
            case 2:
                return FacebookFragment.newInstance(facebook);
            case 3:
                return TwitterFragment.newInstance(twitter);

            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return "";
    }
}
