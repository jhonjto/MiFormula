package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Monomios extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.monomios);
		
		findViewById(R.id.et1);
		findViewById(R.id.et2);
		findViewById(R.id.et3);
		findViewById(R.id.et4);
		findViewById(R.id.et5);
		findViewById(R.id.et6);
		findViewById(R.id.tvresulmonomiosuma);

		findViewById(R.id.et2_1);
		findViewById(R.id.et2_2);
		findViewById(R.id.et2_3);
		findViewById(R.id.et2_4);
		findViewById(R.id.et2_5);
		findViewById(R.id.et2_6);
		findViewById(R.id.tvresulmonomioresta);

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
	    
		TextView text = (TextView)findViewById(R.id.tvsumamonomio);
		TextView text1 = (TextView)findViewById(R.id.tvrestamonomio);
		
		Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("text/plain");
	    intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        intent.putExtra(Intent.EXTRA_TEXT, "Formula"+ " " +text.getText()+ " "+text1.getText());
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
	
	public void sumamonomio(View view) {

		EditText num1 = (EditText) findViewById(R.id.et1);
		EditText num2 = (EditText) findViewById(R.id.et2);
		EditText num3 = (EditText) findViewById(R.id.et3);
		EditText num4 = (EditText) findViewById(R.id.et4);
		EditText num5 = (EditText) findViewById(R.id.et5);
		EditText num6 = (EditText) findViewById(R.id.et6);
		TextView total = (TextView) findViewById(R.id.tvresulmonomiosuma);
		if(num1.length() <= 0 || num2.length() <= 0 || num3.length() <= 0 || num4.length() <= 0
				|| num5.length() <= 0 || num6.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double dbnum4 = Double.parseDouble(num4.getText().toString());
		double dbnum5 = Double.parseDouble(num5.getText().toString());
		double dbnum6 = Double.parseDouble(num6.getText().toString());
		double x;
		double y;
		double a;
		double b;
		double suma;
		
		if(dbnum2 != dbnum5 || dbnum3 != dbnum6){
			Toast toast1 =
		            Toast.makeText(getApplicationContext(),
		                    "x o y no son iguales", Toast.LENGTH_SHORT);
		        toast1.show();
		}else
			if(dbnum2 == dbnum5 && dbnum3 == dbnum6){
				x = dbnum2;
				y = dbnum3;
				a = dbnum1;
				b = dbnum4;
				suma = dbnum1+dbnum4;
				String resultado = String.valueOf(x);
				String resultado1 = String.valueOf(y);
				String resultado2 = String.valueOf(a);
				String resultado3 = String.valueOf(b);
				String resultado4 = String.valueOf(suma);
				total.setText("="+"("+resultado2+"+"+resultado3+")"+"x^"+resultado+"y^"+resultado1+ "  " +"final = "+resultado4+"x^"+resultado+"y^"+resultado1);
			}
	}
	}
	
	public void restamonomio(View view) {

		EditText num1 = (EditText) findViewById(R.id.et2_1);
		EditText num2 = (EditText) findViewById(R.id.et2_2);
		EditText num3 = (EditText) findViewById(R.id.et2_3);
		EditText num4 = (EditText) findViewById(R.id.et2_4);
		EditText num5 = (EditText) findViewById(R.id.et2_5);
		EditText num6 = (EditText) findViewById(R.id.et2_6);
		TextView total = (TextView) findViewById(R.id.tvresulmonomioresta);
		if(num1.length() <= 0 || num2.length() <= 0 || num3.length() <= 0 || num4.length() <= 0
				|| num5.length() <= 0 || num6.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double dbnum4 = Double.parseDouble(num4.getText().toString());
		double dbnum5 = Double.parseDouble(num5.getText().toString());
		double dbnum6 = Double.parseDouble(num6.getText().toString());
		double x;
		double y;
		double a;
		double b;
		double resta;
		
		if(dbnum2 != dbnum5 || dbnum3 != dbnum6){
			Toast toast1 =
		            Toast.makeText(getApplicationContext(),
		                    "x o y no son iguales", Toast.LENGTH_SHORT);
		        toast1.show();
		}else
			if(dbnum2 == dbnum5 && dbnum3 == dbnum6){
				x = dbnum2;
				y = dbnum3;
				a = dbnum1;
				b = dbnum4;
				resta = dbnum1-dbnum4;
				String resultado = String.valueOf(x);
				String resultado1 = String.valueOf(y);
				String resultado2 = String.valueOf(a);
				String resultado3 = String.valueOf(b);
				String resultado4 = String.valueOf(resta);
				total.setText("="+"("+resultado2+"-"+resultado3+")"+"x^"+resultado+"y^"+resultado1+ "  " +"final = "+resultado4+"x^"+resultado+"y^"+resultado1);
			}
	}
	}
	
}
