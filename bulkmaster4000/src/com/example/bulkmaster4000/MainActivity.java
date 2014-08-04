package com.example.bulkmaster4000;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView currentDate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		currentDate = (TextView)findViewById(R.id.todayDate);
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		currentDate.setText(date);
	}

}
