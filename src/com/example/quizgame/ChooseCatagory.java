package com.example.quizgame;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class ChooseCatagory extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_catagory);
		Button englishbtn = (Button) findViewById(R.id.english_btn);
		Button historybtn = (Button) findViewById(R.id.history_btn);
		Button mathbtn = (Button) findViewById(R.id.math_btn);
		Button sciencebtn = (Button) findViewById(R.id.science_btn);

		
		englishbtn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(ChooseCatagory.this, QuestionPage.class);
				
				Bundle bundle = new Bundle();
				bundle.putString("catagory", "English");				
				
				intent.putExtras(bundle);
				startActivity(intent);
			}});
		historybtn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(ChooseCatagory.this, QuestionPage.class);
				
				Bundle bundle = new Bundle();
				bundle.putString("catagory", "History");				
				
				intent.putExtras(bundle);
				startActivity(intent);
			}});
		mathbtn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(ChooseCatagory.this, QuestionPage.class);
				
				Bundle bundle = new Bundle();
				bundle.putString("catagory", "Math");				
				
				intent.putExtras(bundle);
				startActivity(intent);
			}});
		sciencebtn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(ChooseCatagory.this, QuestionPage.class);
				
				Bundle bundle = new Bundle();
				bundle.putString("catagory", "Science");				
				
				intent.putExtras(bundle);
				startActivity(intent);
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choose_catagory, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
