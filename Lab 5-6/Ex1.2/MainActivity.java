package com.example.lab5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.google.com");

                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try{
                 Intent intent = new Intent();
                 intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                 startActivity(intent);
             }catch (Exception e)
                 {
                    e.printStackTrace();
                 }
             }
         });

         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent();
                 intent.setAction(Intent.ACTION_DIAL);
                 intent.setData(Uri.parse("tel:0749131918"));
                 startActivity(intent);
             }
         });

    }
}
