package com.example.jhon.miformula;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acercade);
		
		TextView siontweb  = (TextView) findViewById(R.id.tvWeb);
		siontweb.setMovementMethod(LinkMovementMethod.getInstance());
		Linkify.addLinks(siontweb, Linkify.WEB_URLS);
		
		//ActionBar actionBar = getSupportActionBar();
		//actionBar.setTitle("");
		getSupportActionBar().setIcon(R.drawable.miformula);
		
	}

}
