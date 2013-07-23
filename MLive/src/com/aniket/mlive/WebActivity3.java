package com.aniket.mlive;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class WebActivity3 extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        
 
          
                           
              Uri uri = Uri.parse("http://jwww.agmarknet.nic.in");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

}
}

