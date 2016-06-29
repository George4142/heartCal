package com.example.heartcal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class two extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		Intent intent=getIntent();
		int flag=Integer.parseInt(intent.getStringExtra("flag"));
		TextView text2=(TextView)findViewById(R.id.result);
		if(flag==1){
			
			text2.setText("恭喜你  回答正确！");
		}
		else {
			
			text2.setText("sorry,回答错误");
		}
		     
        Button  next=(Button)this.findViewById(R.id.next);
        Button  end=(Button)this.findViewById(R.id.end);
        next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(two.this,one.class);
				startActivity(intent);
			}
		});
        end.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(two.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}

}
