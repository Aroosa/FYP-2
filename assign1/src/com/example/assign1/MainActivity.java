package com.example.assign1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        ImageButton a = (ImageButton) findViewById(R.id.imgBtn1);
        a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("android.intent.action.page2");
				startActivity (i);
			}
		});
        
        ImageButton b = (ImageButton) findViewById(R.id.imgBtn2);
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("android.intent.action.page3");
				startActivity (i);
			}
		});
        
        
    }
    
}
