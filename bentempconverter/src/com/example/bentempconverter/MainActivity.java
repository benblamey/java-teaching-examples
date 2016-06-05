package com.example.bentempconverter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	
	// ctor.
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View textView = findViewById(R.id.textView1);
		textView.setBackgroundColor(Color.CYAN);
		
	}
	
	
	
	public void onBtnClicked(View v){
	    if(v.getId() == R.id.button1){
	    	
	    	
	    	Intent intent = new Intent(this, OtherActivity.class);
	    	intent.putExtra("some_key", "some value parameter");
	    	startActivity(intent);
	    	
	    	
	    }
	}

	
	
}
