package com.example.pragyaagrawal.antsquaretask.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pragyaagrawal.antsquaretask.R;
import com.example.pragyaagrawal.antsquaretask.models.Resources;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Pragya Agrawal on 12/3/2016.
 */

public class PhotosRecyclerViewAdapter extends RecyclerView.Adapter<PhotosViewHolder> {
    private List<Resources> usersResourcesMediaList;
    private Context context;

    public PhotosRecyclerViewAdapter(List<Resources> usersResourcesMediaList, Context context) {
        this.usersResourcesMediaList = usersResourcesMediaList;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public PhotosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View photoView = inflater.inflate(R.layout.photo_item, parent, false);

        //Return the a new Holder instance
        PhotosViewHolder viewHolder = new PhotosViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PhotosViewHolder holder, int position) {

        if(!usersResourcesMediaList.get(position).getImages().isEmpty()) {
            String photoURL = usersResourcesMediaList.get(position).getImages().get(0);
            if (!TextUtils.isEmpty(photoURL)) {
                Picasso.with(context).load(photoURL).placeholder(R.mipmap.ic_launcher).error(R.drawable.photos_icon).into(holder.ivPhotos);
            }
        }
    }


    @Override
    public int getItemCount() {
        if (usersResourcesMediaList != null) {
            return usersResourcesMediaList.size();
        }
        return 0;
    }

    public void setUsersResourcesMediaList(List<Resources> usersResourcesMediaList) {
        this.usersResourcesMediaList = usersResourcesMediaList;
    }
}
