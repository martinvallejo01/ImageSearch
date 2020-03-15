package com.example.image;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.image.model.Image;
import com.example.image.model.Singleton;

public class imageActivity extends AppCompatActivity {
    Image mImage;
    Intent mIntent;
    TextView dimensions, title;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         mIntent = getIntent();
         String id = mIntent.getStringExtra("ID");
         mImage = Singleton.get().imageHashtable.get(id);
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_image);
         dimensions = findViewById(R.id.dimensions_textView);
         title = findViewById(R.id.title_textView);
         image = findViewById(R.id.image_imageView);
         title.setText(mImage.getTitle());
         String dim = mImage.getHeight().toString() + " x " + mImage.getWidth().toString();
         dimensions.setText(dim);
         image.setImageBitmap(mImage.getImage());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void close(View view) {
        onBackPressed();
    }

}
