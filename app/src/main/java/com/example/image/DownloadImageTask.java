package com.example.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.example.image.model.Image;
import com.example.image.model.Singleton;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImageTask extends AsyncTask <String, Integer, Bitmap> {
    private WeakReference<ImageView> mIconDownload;
    private Image imageInfo;

    DownloadImageTask(ImageView icon, String imageId) {
        mIconDownload = new WeakReference<>(icon);
        imageInfo = Singleton.get().imageHashtable.get(imageId);
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        InputStream inputStream = null;
        try {
            URL url = new URL(strings[0]);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            inputStream = httpURLConnection.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        Image image = imageInfo;
        image.setImage(bitmap);
        String imageId = image.getId();
        Singleton.get().imageHashtable.put(imageId, image);
        Log.d("TASK", "Image Downloaded");
    }
}
