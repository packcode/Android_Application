package com.aniket.mlive;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
 
public class WebActivity extends Activity {
 
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	 
	        
	 
	          
	                           
	                Uri uri = Uri.parse("http://www.agmarknet.nic.in");
	                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	                startActivity(intent);
	          

}
	 
	  
	 
	}