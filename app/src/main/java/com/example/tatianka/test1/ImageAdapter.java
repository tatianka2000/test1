package com.example.tatianka.test1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.content.Context;

import com.squareup.picasso.Picasso;


public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private String[] mDataset;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView)v.findViewById(R.id.imageView);
        }
    }

    public ImageAdapter(String[] dataset, Context context) {
        mContext = context;
        mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(mContext).load(mDataset[position]).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
