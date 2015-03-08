package com.example.mynewapp6;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Employee e1 = new Employee();
		e1.setName("Ahmed");
		Drawable photo1 = this.getResources().getDrawable(R.drawable.face1);
		e1.setPhoto(photo1);

		Employee e2 = new Employee();
		e2.setName("Ali");
		Drawable photo2 = this.getResources().getDrawable(R.drawable.face2);
		e2.setPhoto(photo2);
		
		Employee e3 = new Employee();
		e3.setName("Abbas");
		Drawable photo3 = this.getResources().getDrawable(R.drawable.face3);
		e3.setPhoto(photo3);
		
		Employee e4 = new Employee();
		e4.setName("Amal");
		Drawable photo4 = this.getResources().getDrawable(R.drawable.face4);
		e4.setPhoto(photo4);


		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		EmployeeAdapter adapter = new EmployeeAdapter(this, R.layout.my_listview_layout, employees);
		ListView listView = (ListView) this.findViewById(R.id.listView1);
		listView.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
