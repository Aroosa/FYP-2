package com.example.assign1;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import com.example.assign1.MyDataClass;


public class Page3 extends Activity{

	MyDataClass[] obj2 = new MyDataClass[50];
	//ArrayList<MyDataClass> obj2 = new ArrayList<MyDataClass>();
	MyDataAdapter adapter1;
	int counter=0;

	//@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        
        adapter1= new MyDataAdapter(this,R.layout.list_view_row,obj2); 
        
        ListView listView1 = (ListView)findViewById(R.id.myListView);
        listView1.setAdapter(adapter1);
        
       ImageView btn = (ImageView) findViewById(R.id.plus);
        
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
            	MyDataClass temp= new MyDataClass();
            	
                EditText edit = (EditText) findViewById(R.id.editText1);
                CheckBox checkbx=(CheckBox) findViewById(R.id.checkBox1);
                temp.setTitle(edit.getText().toString());
                temp.setCheckbox(checkbx.isChecked());
                edit.setText("");
               
              obj2[counter]=temp;
              counter++;
                adapter1.notifyDataSetChanged();
            }
        };
 
        btn.setOnClickListener(listener);
 
        
       
		listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,int position, long id) {
				
				ListView listView1 = (ListView)findViewById(R.id.myListView);
				
				
				if(listView1.isItemChecked(position)){
					obj2[position].setCheckbox(true);
                    Toast.makeText(getBaseContext(), "You checked " + obj2[position], Toast.LENGTH_SHORT).show();
                }else{
                	obj2[position].setCheckbox(false);
                    Toast.makeText(getBaseContext(), "You unchecked " + obj2[position], Toast.LENGTH_SHORT).show();
                }
				
				
			}
		});
        
    }
    
}

