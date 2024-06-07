package com.cookandroid.dcu_image_viwer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> imagePaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        imagePaths = getImagePaths();

        ImageAdapter adapter = new ImageAdapter(this, imagePaths);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("image_path", imagePaths.get(position));
                intent.putStringArrayListExtra("all_images", imagePaths);
                startActivity(intent);
            }
        });
    }

    private ArrayList<String> getImagePaths() {
        ArrayList<String> paths = new ArrayList<>();
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image1);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image2);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image3);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image4);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image5);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image6);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image7);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image8);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image9);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image10);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image11);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image12);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image13);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image14);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image15);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image16);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image17);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image18);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image19);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image20);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image21);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image22);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image23);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image24);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image25);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image26);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image27);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image28);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image29);
        paths.add("android.resource://" + getPackageName() + "/" + R.drawable.image30);


        // 필요에 따라 더 많은 이미지를 추가합니다.
        return paths;
    }
}
