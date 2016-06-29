package com.example.heartcal;
import java.util.Random;

import android.R.integer;
public class RandomSHU {
	
	public int getSHU()
	{
	        int max=100;
	        int min=0;
	        Random random = new Random();
	        int s = random.nextInt(max)%(max-min+1) + min;
	        return  s;
	}  
	    
	

}
