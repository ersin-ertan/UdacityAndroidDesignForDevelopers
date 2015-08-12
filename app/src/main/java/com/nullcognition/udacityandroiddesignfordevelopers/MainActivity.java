package com.nullcognition.udacityandroiddesignfordevelopers;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addFrameLayout();
	}

	private void addFrameLayout(){

		for(int i = 0; i < 100; i++){

			LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout);

			FrameLayout fl = new FrameLayout(this);
			fl.setElevation(i*3);
			fl.setBackgroundColor(Color.argb(255, 255,255,255));
			LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1+i);

			ll.addView(fl, param);
		}
	}
}
