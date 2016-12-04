package com.example.pragyaagrawal.antsquaretask.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.example.pragyaagrawal.antsquaretask.R;
import com.example.pragyaagrawal.antsquaretask.fragments.FacebookFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.PhotosFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.TwitterFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.YelpFragment;

/**
 * Created by Pragya Agrawal on 12/2/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_ITEMS = 4;
    private int[] tabImages = {R.drawable.photos_icon,R.drawable.yelp_icon,R.drawable.facebook_icon, R.drawable.twitter_icon};

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
        Drawable image = ContextCompat.getDrawable(context, tabImages[position]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        // Replace blank spaces with image icon
        SpannableString sb = new SpannableString(" ");
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }
}
