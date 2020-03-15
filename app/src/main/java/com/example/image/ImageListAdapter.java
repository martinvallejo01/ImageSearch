package com.example.image;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.image.model.Image;
import com.example.image.model.Singleton;

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ImageViewHolder> {
    private LayoutInflater mInflater;

    public ImageListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemInflater = mInflater.inflate(R.layout.image_listitem, parent, false);
        return new ImageViewHolder(itemInflater, this);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        Image current = Singleton.get().mImages[position];
        String title = current.getTitle();
        if (title.length() > 37) {
            title = title.substring(0, 38);
            title += "...";
        }
        String dimensions = "H: " + current.getHeight().toString() + " W: " + current.getWidth();
        //String photoUrl = current.getUrl().substring(0, 30) + "...";
        holder.mPhotoTitle.setText(title);
        holder.mPhotoDimensions.setText(dimensions);
        holder.mPhotoUrl.setText(current.getUrl());
    }

    @Override
    public int getItemCount() {
        return Singleton.get().mImages.length - 1; //TODO Solve this
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {
        public final TextView mPhotoTitle, mPhotoUrl, mPhotoDimensions;
        public final ImageView mFavIcon;
        private final ImageListAdapter mAdapter;
        public ImageViewHolder(View itemView, ImageListAdapter adapter) {
            super(itemView);
            mPhotoTitle = itemView.findViewById(R.id.photoTitle_textView);
            mPhotoUrl = itemView.findViewById(R.id.photoUrl_textView);
            mPhotoDimensions = itemView.findViewById(R.id.photoDimensions_textView);
            mFavIcon = itemView.findViewById(R.id.loveIcon_imageView);
            mAdapter = adapter;

        }
    }
}
