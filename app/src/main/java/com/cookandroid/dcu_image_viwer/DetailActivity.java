package com.cookandroid.dcu_image_viwer;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private ImageView mainImageView;
    private ArrayList<String> imagePaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mainImageView = findViewById(R.id.mainImageView);
        ListView listView = findViewById(R.id.listView);

        String imagePath = getIntent().getStringExtra("image_path");
        imagePaths = getIntent().getStringArrayListExtra("all_images");

        mainImageView.setImageURI(Uri.parse(imagePath));

        ImageListAdapter adapter = new ImageListAdapter(this, imagePaths);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mainImageView.setImageURI(Uri.parse(imagePaths.get(position)));
            }
        });
    }
}
