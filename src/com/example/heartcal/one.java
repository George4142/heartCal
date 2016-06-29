package com.example.heartcal;



import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class one extends Activity {
	RandomSHU randomSHU=new RandomSHU();
	int  shu1=randomSHU.getSHU();
	int  shu2=randomSHU.getSHU(); 
	TextView  textView;
	int sum=0;
	String  flag="0";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one);
		TextView t1=(TextView)this.findViewById(R.id.shu1);
		TextView t2=(TextView)this.findViewById(R.id.shu2);
		sum=shu1+shu2;
		t1.setText(String.valueOf(shu1));
		t2.setText(String.valueOf(shu2));
		textView=(TextView)this.findViewById(R.id.result);
		Button button1=(Button)this.findViewById(R.id.queding);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                int result= Integer.parseInt(textView.getText().toString());
               
                if(sum==result)
                {
                	flag="1";
                }
                
                Intent intent1=new Intent(one.this,two.class);
                intent1.putExtra("flag", flag);
                intent1.setClass(one.this, two.class);
                startActivity(intent1);
			}
		});
		
	}
	
	

}
