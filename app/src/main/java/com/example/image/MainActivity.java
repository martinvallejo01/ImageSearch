package com.example.image;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.image.model.Image;
import com.example.image.model.Singleton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    ImageListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mRecyclerView = findViewById(R.id.images_recyclerView);
        mAdapter = new ImageListAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.favorite:
                // TODO
            case R.id.reload:
                // TODO
                mAdapter.notifyDataSetChanged();
        }
        Log.d(LOG_TAG, "Item Selected");
        return super.onOptionsItemSelected(item);
    }

    public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ImageViewHolder> {
        private LayoutInflater mInflater;
        private ArrayList<Image> mData;

        public ImageListAdapter(Context context) {
            mInflater = LayoutInflater.from(context);
            mData = Singleton.get().images();
        }

        @Override
        public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemInflater = mInflater.inflate(R.layout.image_listitem, parent, false);
            return new ImageViewHolder(itemInflater, this);
        }

        @Override
        public void onBindViewHolder(ImageViewHolder holder, int position) {
            Image current = mData.get(position);
            String title = current.getTitle();
            if (title.length() > 37) {
                title = title.substring(0, 38);
                title += "...";
            }
            String dimensions = "H: " + current.getHeight().toString() + " W: " + current.getWidth();
            holder.mPhotoTitle.setText(title);
            holder.mPhotoDimensions.setText(dimensions);
            holder.mPhotoUrl.setText(current.getUrl());
            if (!current.isImageNull())
            holder.mFavIcon.setImageResource(R.drawable.ic_favorite_red_24dp);
        }

        @Override
        public int getItemCount() {
            return Singleton.get().size();
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
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = getLayoutPosition();
                        String id = mData.get(position).getId();
                        Intent intent = new Intent(v.getContext(), imageActivity.class);
                        intent.putExtra("ID", id);
                        startActivity(intent);

                    }
                });
                mFavIcon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = getLayoutPosition();
                        String url = mData.get(position).getSrc();
                        new DownloadImageTask(mFavIcon, mData.get(position).getId()).execute(url);
                    }
                });
            }
        }

    }

}
