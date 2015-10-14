package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
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

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.miformula);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
	}

}
