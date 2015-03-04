package com.example.assign1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.example.assign1.MyDataClass;
import com.example.assign1.MyDataAdapter;


public class Page2 extends Activity {

	//MyDataClass * obj1=new MyDataClass();
	MyDataClass[] obj1 = new MyDataClass[50];
	int counter=0;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
      
    }

    public void makePopup(View v){
        //Button btn = (Button) findViewById(R.id.img1);

    	/** Instantiating PopupMenu class */
        PopupMenu popup = new PopupMenu(Page2.this, v);

        /** Adding menu items to the popupmenu */
        MenuInflater inflater = popup.getMenuInflater();
        //popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
        inflater.inflate(R.menu.popup_menu, popup.getMenu());
        
        popup.show();
        
        /** Defining menu item click listener for the popup menu */
        popup.setOnMenuItemClickListener(new android.support.v7.widget.PopupMenu.OnMenuItemClickListener() {
        	@Override
            public boolean onMenuItemClick(MenuItem item) {
                //Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
              
        		switch (item.getItemId()) {

        		case R.id.time_reminder:
        			Toast.makeText(Page2.this, "Time reminder Clicked", Toast.LENGTH_LONG).show();
        			return true;
        		case R.id.location_reminder:
        			Toast.makeText(Page2.this, "Location reminder Clicked", Toast.LENGTH_LONG).show();
        			return true;
        		default:
        			return false;
        		}
            }
        });
        popup.show();
    }
	
	
    public void makePopup2(View v){
        //Button btn = (Button) findViewById(R.id.img1);

    	/** Instantiating PopupMenu class */
        PopupMenu popup2 = new PopupMenu(Page2.this, v);

        /** Adding menu items to the popupmenu */
        MenuInflater inflater = popup2.getMenuInflater();
        //popup2.getMenuInflater().inflate(R.menu.popup_menu2, popup2.getMenu());
        inflater.inflate(R.menu.popup_menu2, popup2.getMenu());
       
        
        popup2.show();
        
        /** Defining menu item click listener for the popup menu */
        popup2.setOnMenuItemClickListener(new android.support.v7.widget.PopupMenu.OnMenuItemClickListener() {
        	@Override
            public boolean onMenuItemClick(MenuItem item) {
                //Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
              //counter++;
        		Button btn=(Button)findViewById(R.id.img2);
        		switch (item.getItemId()) {

        		case R.id.today:
        			Toast.makeText(Page2.this, "Today Clicked", Toast.LENGTH_LONG).show();
        			btn.setText("Today");
        			//obj1[counter].setDate("Today");
        			return true;
        		case R.id.tomorrow:
        			btn.setText("Tomorrow");
        			Toast.makeText(Page2.this, "Tomorrow Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setDate("Tomorrow");
        			return true;
        		case R.id.next_thursday:
        			btn.setText("Next Thursday");
        			Toast.makeText(Page2.this, "Next thursday Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setDate("Next Thursday");
        			return true;
        		case R.id.select_date:
        			btn.setText("Select a date");
        			Toast.makeText(Page2.this, "Select a date Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setDate("Select a date");
        			return true;
        		default:
        			return false;
        		}
            }
        });
        popup2.show();
    }

    public void makePopup3(View v){

    	PopupMenu popup3 = new PopupMenu(Page2.this, v);
        MenuInflater inflater = popup3.getMenuInflater();
        //popup3.getMenuInflater().inflate(R.menu.popup_menu3, popup3.getMenu());
        inflater.inflate(R.menu.popup_menu3, popup3.getMenu());
        
        popup3.show();

        popup3.setOnMenuItemClickListener(new android.support.v7.widget.PopupMenu.OnMenuItemClickListener() {
        	@Override
            public boolean onMenuItemClick(MenuItem item) {
        		Button btn=(Button)findViewById(R.id.img3);
        		switch (item.getItemId()) {

        		case R.id.morning:
        			Toast.makeText(Page2.this, "Morning Clicked", Toast.LENGTH_LONG).show();
        			btn.setText("Morning");
        			//obj1[counter].setTime("Morning");
        			return true;
        		case R.id.afternoon:
        			btn.setText("Afternoon");
        			Toast.makeText(Page2.this, "Afternoon Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setTime("Afternoon");
        			return true;
        		case R.id.evening:
        			btn.setText("Evening");
        			Toast.makeText(Page2.this, "Evening Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setTime("Evening");
        			return true;
        		case R.id.night:
        			btn.setText("Night");
        			Toast.makeText(Page2.this, "Night Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setTime("Night");
        			return true;
        		case R.id.select_atime:
        			btn.setText("Select a time");
        			Toast.makeText(Page2.this, "Select a Time Clicked", Toast.LENGTH_LONG).show();
        			//obj1[counter].setTime("Select a time");
        			return true;
        		default:
        			return false;
        		}
            }
        });
        popup3.show();
    }

}
