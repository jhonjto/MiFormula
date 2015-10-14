package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exponentes2 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exponentes2);

		findViewById(R.id.etley4_1);
		findViewById(R.id.etley4_2);
		findViewById(R.id.etley4_3);
		findViewById(R.id.tvresul4_1);

		findViewById(R.id.etley5_1);
		findViewById(R.id.etley5_2);
		findViewById(R.id.etley5_3);
		findViewById(R.id.tvresul5_1);
		
		findViewById(R.id.etley6_1);
		findViewById(R.id.etley6_2);
		findViewById(R.id.tvresul6_1);

		getSupportActionBar().setHomeAsUpIndicator(R.drawable.miformula);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowTitleEnabled(false);

	}
	
	//private ShareActionProvider mShareActionProvider;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getMenuInflater().inflate(R.menu.menu_main, menu);
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

		TextView text = (TextView)findViewById(R.id.tvley4);
		TextView text1 = (TextView)findViewById(R.id.tvley5);
		TextView text2 = (TextView)findViewById(R.id.tvley6);
		
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

	public void ley4(View view) {

		EditText num1 = (EditText) findViewById(R.id.etley4_1);
		EditText num2 = (EditText) findViewById(R.id.etley4_2);
		EditText num3 = (EditText) findViewById(R.id.etley4_3);
		TextView total = (TextView) findViewById(R.id.tvresul4_1);
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
		double totalfinal;
		
		totalley1 =dbnum1;
		totalley2 =dbnum2;
		totalfinal = dbnum3;
		String resultado = String.valueOf(totalley1);
		String resultado1 = String.valueOf(totalley2);
		String resultado2 = String.valueOf(totalfinal);
		total.setText(resultado + "^" + resultado2 + resultado1 + "^" + resultado2); 
	}
	}

	public void ley5(View view) {

		EditText num1 = (EditText) findViewById(R.id.etley5_1);
		EditText num2 = (EditText) findViewById(R.id.etley5_2);
		EditText num3 = (EditText) findViewById(R.id.etley5_3);
		TextView total = (TextView) findViewById(R.id.tvresul5_1);
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
		double totalfinal;

		totalley1 =dbnum1;
		totalley2 =dbnum2;
		totalfinal = dbnum3;
		String resultado = String.valueOf(totalley1);
		String resultado1 = String.valueOf(totalley2);
		String resultado2 = String.valueOf(totalfinal);
		total.setText(resultado + "^" + resultado2 + "/" + resultado1 + "^" + resultado2);
	}
	}

	public void ley6(View view) {

		EditText num1 = (EditText) findViewById(R.id.etley6_1);
		EditText num2 = (EditText) findViewById(R.id.etley6_2);
		TextView total = (TextView) findViewById(R.id.tvresul6_1);
		if(num1.length() <= 0 || num2.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double totalley2;
		double totalley1;
		double totalfinal;

			if(dbnum2 > 0){
				Toast toast1 =
			            Toast.makeText(getApplicationContext(),
			                    "Solo numeros negativos", Toast.LENGTH_SHORT);
			        toast1.show();
			}else
				if(dbnum2 < 0){
			totalley1 = ((-1)*dbnum2);
			totalley2 = dbnum1;
			totalfinal = 1;
			String resultado = String.valueOf(totalley1);
			String resultado1 = String.valueOf(totalley2);
			String resultado2 = String.valueOf(totalfinal);
			total.setText(resultado2 + "/" + resultado1 + "^" + resultado);
				}
	}
}
}
