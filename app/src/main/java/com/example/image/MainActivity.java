package com.example.image;

import android.content.Context;
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
        }
        Log.d(LOG_TAG, "Item Selected");
        return super.onOptionsItemSelected(item);
    }

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

}
