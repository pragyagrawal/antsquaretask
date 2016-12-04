package com.example.pragyaagrawal.antsquaretask.activities;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

import com.example.pragyaagrawal.antsquaretask.R;
import com.example.pragyaagrawal.antsquaretask.adapters.PagerAdapter;
import com.example.pragyaagrawal.antsquaretask.fragments.FacebookFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.PhotosFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.TwitterFragment;
import com.example.pragyaagrawal.antsquaretask.fragments.YelpFragment;
import com.example.pragyaagrawal.antsquaretask.models.UserDataModel;
import com.example.pragyaagrawal.antsquaretask.network.AntsquareAPI;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import io.fabric.sdk.android.Fabric;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements PhotosFragment.OnFragmentInteractionListener, FacebookFragment.OnFragmentInteractionListener, TwitterFragment.OnFragmentInteractionListener, YelpFragment.OnFragmentInteractionListener {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "9WL0NMomUS900hS8ix2KorwnX";
    private static final String TWITTER_SECRET = "wkV74wpwkJJ6dKuGOSLAdThnyEiHTlrPM49h8DqYCCabwSjgru";


    private PagerAdapter pagerAdapter;
    private UserDataModel userDataModel;

    @BindView(R.id.ivUserImage) CircleImageView ivUserImage;
    @BindView(R.id.tvUserName) TextView tvUserName;
    @BindView(R.id.tvUserId) TextView tvUserId;
    @BindView(R.id.tvLikes) TextView tvLikes;
    @BindView(R.id.tvFollowers) TextView tvFollowers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        fetchUserProfileFromServer();
    }
    private int[] tabImages = {R.drawable.photos_icon,R.drawable.yelp_icon,R.drawable.facebook_icon, R.drawable.twitter_icon};

    private void setViewPager() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.vpPager);

        if (!TextUtils.isEmpty(userDataModel.getFacebook())) {
            pagerAdapter = new PagerAdapter(getSupportFragmentManager(), MainActivity.this,
                    userDataModel.getFacebook(), userDataModel.getTwitter(), userDataModel.getExternal_url());
            viewPager.setAdapter(pagerAdapter);
        }
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(R.layout.view_home_tab);

            Drawable icon = getResources().getDrawable(tabImages[i]);
            changeDrawableTint(icon,R.color.primaryBlack);
            tab.setIcon(icon);
        }

        changeDrawableTint(tabLayout.getTabAt(0).getIcon(),R.color.colorPrimaryDark);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                changeDrawableTint(tab.getIcon(),R.color.colorPrimaryDark);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                changeDrawableTint(tab.getIcon(),R.color.primaryBlack);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void changeDrawableTint(Drawable icon, int color){
        icon = DrawableCompat.wrap(icon);
        DrawableCompat.setTint(icon,getResources().getColor(color));
    }

    private void fetchUserProfileFromServer(){
        AntsquareAPI.getUserInfo(new Callback<UserDataModel>() {
            @Override
            public void onResponse(Call<UserDataModel> call, Response<UserDataModel> response) {
                if (response.isSuccessful()){
                    userDataModel = response.body();
                    tvUserName.setText(userDataModel.getUser_info().getName());
                    tvUserId.setText(userDataModel.getUser_info().getUsername());
                    tvLikes.setText(userDataModel.getUser_info().getTotal_moment_likes());
                    tvFollowers.setText(userDataModel.getUser_info().getTotal_followers());
                    Picasso.with(MainActivity.this).load(userDataModel.getLogo()).into(ivUserImage);
                    setViewPager();
                }
            }

            @Override
            public void onFailure(Call<UserDataModel> call, Throwable t) {

            }
        });
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
