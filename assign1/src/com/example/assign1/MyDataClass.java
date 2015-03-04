package com.example.assign1;

public class MyDataClass {

	int id;
	String title;
	String note;
	String date;
	String time;
	boolean checkbox;

	
	public MyDataClass() {
		super();
		this.id=0;
		this.title = "";
		this.note = "";
		this.date = "";
		this.time = "";
		this.checkbox = false;
	}
	
	public MyDataClass(int id, String title, String note, String date,
			String time, boolean checkbox) {
		super();
		this.id=id;
		this.title = title;
		this.note = note;
		this.date = date;
		this.time = time;
		this.checkbox = checkbox;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTitle() {
		return title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCheckbox() {
		return checkbox;
	}

	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}
	public int get_id() {
		return id;
	}

	public void set_id(int id) {
		this.id = id;
	}

}
