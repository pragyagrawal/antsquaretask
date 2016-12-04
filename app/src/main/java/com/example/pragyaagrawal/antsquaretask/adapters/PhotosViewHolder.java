package com.example.pragyaagrawal.antsquaretask.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.pragyaagrawal.antsquaretask.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Pragya Agrawal on 12/3/2016.
 */

public class PhotosViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.ivPhoto)
    ImageView ivPhotos;

    public PhotosViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public ImageView getIvPhotos() {
        return ivPhotos;
    }
}
