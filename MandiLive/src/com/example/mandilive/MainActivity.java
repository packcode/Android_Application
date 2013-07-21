package com.example.mandilive;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
public class MainActivity extends Activity {

	Button cereals;
	Button drugs;
	Button Oilseeds;
	Button Pulses;
	Button fruit;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cereals.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Uri uri = Uri.parse("http://www..com");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            	 
                


            }
        });
		drugs.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Uri uri = Uri.parse("http://www..com");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            	 
                


            }
        });
		Oilseeds.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Uri uri = Uri.parse("http://www..com");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            	 
                


            }
        });
		Pulses.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Uri uri = Uri.parse("http://www..com");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            	 
                


            }
        });
		fruit.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Uri uri = Uri.parse("http://www..com");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
            }
            });
		Vegetables.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Uri uri = Uri.parse("http://www..com");
            	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            	 startActivity(intent);
	
	}
}
