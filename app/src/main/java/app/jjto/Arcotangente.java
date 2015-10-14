package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Arcotangente extends AppCompatActivity{

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.arcotangente);
		
		findViewById(R.id.etarcotangente);
		findViewById(R.id.tvarcotangentex);
		findViewById(R.id.tvarcotangentey);
		findViewById(R.id.tvresultado);

		getSupportActionBar().setHomeAsUpIndicator(R.drawable.miformula);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		
	}
	
//private ShareActionProvider mShareActionProvider;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getMenuInflater().inflate(R.menu.menu_main, menu);
//		return true;
		
//		MenuInflater inflater = getMenuInflater();
//		inflater.inflate(R.menu.main_activity_actions, menu);
		
		// Set up ShareActionProvider's default share intent
	    //MenuItem shareItem =
	    menu.findItem(R.id.action_search);
	    /*mShareActionProvider = (ShareActionProvider)
	            MenuItemCompat.getActionProvider(shareItem);
	    mShareActionProvider.setShareIntent(sIntent());*/
		
		return super.onCreateOptionsMenu(menu);
		
	}
	
	/** Defines a default (dummy) share intent to initialize the action provider.
	  * However, as soon as the actual content to be used in the intent
	  * is known or changes, you must update the share intent by again calling
	  * mShareActionProvider.setShareIntent()
	  */

/*	private Intent sIntent() {

		TextView text = (TextView)findViewById(R.id.tvarcotangente);
		
		Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("text/plain");
	    intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        intent.putExtra(Intent.EXTRA_TEXT, "Formula"+ " " +text.getText());
	    return intent;
		
	}*/
	
/*	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
		switch (item.getItemId()) 
        {
            case R.id.action_settings:
                return true;
            case R.id.action_divi:
            	Intent intentdivi = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.siont.divi"));
            	startActivity(intentdivi);
                return true;
            case R.id.action_compartelo:
            	Intent intentcompartelo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.doapps.me.shareit"));
            	startActivity(intentcompartelo);
                return true;
                
            default:
                return super.onOptionsItemSelected(item);
        }
	}*/
	
	public void arcotangente(View view){
		
		EditText num1 = (EditText)findViewById(R.id.etarcotangente);
		TextView totalarcotangente = (TextView)findViewById(R.id.tvresultado);
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double arco = Math.atan(dbnum1);
		double ang = Math.toDegrees(arco);
		String resultado = String.valueOf(ang);
		totalarcotangente.setText(resultado+"�");
		
	}
	
	public void arcotangentexy(View view){
		
		EditText num2 = (EditText)findViewById(R.id.tvarcotangentex);
		EditText num3 = (EditText)findViewById(R.id.tvarcotangentey);
		TextView totalarcotangente = (TextView)findViewById(R.id.tvresultado);
		if(num2.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}if(num2.length() <= 0 || num3.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double arco2 = Math.atan2(dbnum2, dbnum3);
		double ang2 = Math.toDegrees(arco2);
		String resultado2 = String.valueOf(ang2);
		totalarcotangente.setText(resultado2+"�");
		}
	}
	
}
