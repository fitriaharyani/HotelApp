package com.fitriaharyani.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{

    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrls = "https://s3.bukalapak.com/uploads/content_attachment/d020552830e8d762c41284c5/w-740/shutterstock_546118867-2.jpg";
        Picasso.with(this).load(imageUrls).into(_imageView1);
    }
}