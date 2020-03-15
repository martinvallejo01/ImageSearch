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

import java.util.ArrayList;

public class FavoriteListAdapter extends RecyclerView.Adapter<FavoriteListAdapter.FavoriteViewHolder> {
    private ArrayList<Image> mImages;
    private LayoutInflater mInflater;

    public FavoriteListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        mImages = new ArrayList<>();
        for (String id: Singleton.get().imageHashtable.keySet()) {
            if (!Singleton.get().imageHashtable.get(id).isImageNull()) {
                mImages.add(Singleton.get().imageHashtable.get(id));
            }
        }
    }

    @Override
    public FavoriteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FavoriteViewHolder(
                mInflater.inflate(R.layout.favorite_listitem, parent, false), this);
    }

    @Override
    public void onBindViewHolder(FavoriteViewHolder holder, int position) {
        Image image = mImages.get(position);
        holder.mImage.setImageBitmap(image.getImage());
        holder.mPhotoTitle.setText(image.getTitle());
        holder.mPhotoCount.setText("Number of Views: " + image.getNumberOfViews().toString());
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    class FavoriteViewHolder extends RecyclerView.ViewHolder {
        public final TextView mPhotoTitle, mPhotoCount;
        public final ImageView mImage;
        public FavoriteListAdapter mAdapter;
        public FavoriteViewHolder(View itemView, FavoriteListAdapter adapter) {
            super(itemView);
            mPhotoTitle = itemView.findViewById(R.id.title_textView);
            mPhotoCount = itemView.findViewById(R.id.count_textView);
            mImage = itemView.findViewById(R.id.image_imageView);
            mAdapter = adapter;
        }
    }
}
