package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exponentes extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exponentes);

		findViewById(R.id.etley1);
		findViewById(R.id.etley2);
		findViewById(R.id.etley3);
		findViewById(R.id.etley4);
		findViewById(R.id.tvresul1);

		findViewById(R.id.etley2_1);
		findViewById(R.id.etley2_2);
		findViewById(R.id.etley2_3);
		findViewById(R.id.etley2_4);
		findViewById(R.id.tvresul2_1);
		
		findViewById(R.id.etley3_1);
		findViewById(R.id.etley3_2);
		findViewById(R.id.etley3_3);
		findViewById(R.id.tvresul3_1);

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
	    
		TextView text = (TextView)findViewById(R.id.tvley1);
		TextView text1 = (TextView)findViewById(R.id.tvley2);
		TextView text2 = (TextView)findViewById(R.id.tvley3);
		
		Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("text/plain");
	    intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        intent.putExtra(Intent.EXTRA_TEXT, "Formula"+ " " +text.getText()+ " "+text1.getText()+ " "+text2.getText());
	    return intent;
		
	}*/
	
/*	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
		//return super.onOptionsItemSelected(item);
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

	public void ley1(View view) {

		EditText num1 = (EditText) findViewById(R.id.etley1);
		EditText num2 = (EditText) findViewById(R.id.etley2);
		EditText num3 = (EditText) findViewById(R.id.etley3);
		EditText num4 = (EditText) findViewById(R.id.etley4);
		TextView total = (TextView) findViewById(R.id.tvresul1);
		if(num1.length() <= 0 || num2.length() <= 0 || num3.length() <= 0 || num4.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double dbnum4 = Double.parseDouble(num4.getText().toString());
		double totalley2;
		double totalley1;
		double totalfinal;

		if (dbnum1 == dbnum3) {
			totalley1 = dbnum2 + dbnum4;
			totalley2 = dbnum1;
			String resultado = String.valueOf(totalley1);
			String resultado1 = String.valueOf(totalley2);
			total.setText(resultado1 + "^" + resultado);
		} else if (dbnum1 != dbnum3) {
			totalley1 = Math.pow(dbnum1, dbnum2);
			totalley2 = Math.pow(dbnum3, dbnum4);
			totalfinal = totalley1 * totalley2;
			String resultado = String.valueOf(totalley1);
			String resultado1 = String.valueOf(totalley2);
			String resultado2 = String.valueOf(totalfinal);
			total.setText(resultado + "x" + resultado1 + "  " + "totalfinal :"
					+ resultado2);
		}
	}
	}

	public void ley2(View view) {

		EditText num1 = (EditText) findViewById(R.id.etley2_1);
		EditText num2 = (EditText) findViewById(R.id.etley2_2);
		EditText num3 = (EditText) findViewById(R.id.etley2_3);
		EditText num4 = (EditText) findViewById(R.id.etley2_4);
		TextView total = (TextView) findViewById(R.id.tvresul2_1);
		if(num1.length() <= 0 || num2.length() <= 0 || num3.length() <= 0 || num4.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double dbnum4 = Double.parseDouble(num4.getText().toString());
		double totalley2;
		double totalley1;
		double totalfinal;

		if (dbnum1 == dbnum3) {
			totalley1 = dbnum2 - dbnum4;
			totalley2 = dbnum1;
			String resultado = String.valueOf(totalley1);
			String resultado1 = String.valueOf(totalley2);
			total.setText(resultado1 + "^" + resultado);
		} else if (dbnum1 != dbnum3) {
			totalley1 = Math.pow(dbnum1, dbnum2);
			totalley2 = Math.pow(dbnum3, dbnum4);
			totalfinal = totalley1 / totalley2;
			String resultado = String.valueOf(totalley1);
			String resultado1 = String.valueOf(totalley2);
			String resultado2 = String.valueOf(totalfinal);
			total.setText(resultado + "/" + resultado1 + "  " + "totalfinal :"
					+ resultado2);
		}
	}
	}

	public void ley3(View view) {

		EditText num1 = (EditText) findViewById(R.id.etley3_1);
		EditText num2 = (EditText) findViewById(R.id.etley3_2);
		EditText num3 = (EditText) findViewById(R.id.etley3_3);
		TextView total = (TextView) findViewById(R.id.tvresul3_1);
		if(num1.length() <= 0 || num2.length() <= 0 || num3.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double totalley2;
		double totalley1;

			totalley1 = dbnum2 * dbnum3;
			totalley2 = dbnum1;
			String resultado = String.valueOf(totalley1);
			String resultado1 = String.valueOf(totalley2);
			total.setText(resultado1 + "^" + resultado);
	}
}
}
