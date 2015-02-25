package com.example.quizgame;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class QuestionPage extends ActionBarActivity {

	TextView question_text;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_page);
		question_text = (TextView) this.findViewById(R.id.question_text);
		Bundle bundle = this.getIntent().getExtras();
		String catagory = bundle.getString("catagory");
		question_text.setText(catagory);

		Button answer1btn = (Button) findViewById(R.id.answer1_btn);
		Button answer2btn = (Button) findViewById(R.id.answer2_btn);
		Button answer3btn = (Button) findViewById(R.id.answer3_btn);
		Button answer4btn = (Button) findViewById(R.id.answer4_btn);

		
		answer1btn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(QuestionPage.this, AnswerPage.class);
				
				Bundle bundle = new Bundle();	
				bundle.putString("answer", "right");					
				intent.putExtras(bundle);
				
				startActivity(intent);
			}});
		
		answer2btn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(QuestionPage.this, AnswerPage.class);
				
				Bundle bundle = new Bundle();	
				bundle.putString("answer", "wrong");					
				intent.putExtras(bundle);
				
				startActivity(intent);
			}});
		answer3btn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(QuestionPage.this, AnswerPage.class);
				
				Bundle bundle = new Bundle();	
				bundle.putString("answer", "wrong");					
				intent.putExtras(bundle);
				
				startActivity(intent);
			}});
		answer4btn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{				
				Intent intent = new Intent();
				intent.setClass(QuestionPage.this, AnswerPage.class);
				
				Bundle bundle = new Bundle();	
				bundle.putString("answer", "wrong");					
				intent.putExtras(bundle);
				
				startActivity(intent);
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question_page, menu);
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
