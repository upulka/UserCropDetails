package com.example.agroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class CropDetails extends AppCompatActivity {

    ImageView myImageDragon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_details);

        myImageDragon = findViewById(R.id.imgDragon);

        myImageDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropDetails.this , DragonFruit.class);
                startActivity(intent);
            }
        });

    }
}