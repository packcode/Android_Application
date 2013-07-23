package com.aniket.mlive;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	//	button=(Button)findViewById(R.id.button1);
		//button.setOnClickListener(this);
		
	}
	//@Override
	public void onClick1(View arg0) {
				final Context context = this;
		  Intent intent = new Intent(context, WebActivity.class);
          startActivity(intent);  
          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick2(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick3(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick4(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick5(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick6(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick7(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		public void onClick8(View v)
		{
			
				final Context context1 = this;
				  Intent intent = new Intent(context1, WebActivity2.class);
		          startActivity(intent); 
		          Log.d("AISI","SECOND BUTTON WAS CLIKED");
		}
		}
		
		
	
		

	


