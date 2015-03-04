package com.example.assign1;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MyDataAdapter extends ArrayAdapter<MyDataClass>{

	Context context;
	int layoutId;
	MyDataClass[] obj3=null;
	//private List<MyDataClass> obj2 = new ArrayList<MyDataClass>();
	
	/*
	public MyDataAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}
*/
	public MyDataAdapter(Context context, int resourceId, MyDataClass[] obj2)
	{
		super(context, R.layout.list_view_row, obj2);
		//super(context, resourceId, obj2);
		this.context = context;
		this.obj3=obj2;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	
		View row = convertView;
		if(row == null)
		{
			//row = getLayoutInflater().inflate(R.layout.list_view_row, parent, false);
			LayoutInflater inflater = ((Page3)context).getLayoutInflater();
           	row = inflater.inflate(R.layout.list_view_row, parent, false);
           	
           	TextView name = (TextView) convertView.findViewById(R.id.row_title_text);
           	name.setText(obj3[position].getNote());
           	
	        CheckBox checkbox1 = (CheckBox) convertView.findViewById(R.id.checkBox1);
	        
	       
	        if(obj3[position].isCheckbox() == true)
	        { 
	        	checkbox1.setChecked(true);
	        }
	        else
	        {
	       	 	checkbox1.setChecked(false);
	        }
	        
	       // return convertView;
	     }
	           	
		else
		{
			row = (View) convertView;
		}
		
		return row;
	}

	
	
}
