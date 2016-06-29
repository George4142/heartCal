package com.example.heartcal;

import android.app.Application;

public class app extends Application {
	
	int  flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		setFlag(0);
	}
	

}
