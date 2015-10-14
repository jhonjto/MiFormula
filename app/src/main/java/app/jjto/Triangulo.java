package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Triangulo extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.triangulo);
		
		findViewById(R.id.et1);
		findViewById(R.id.et2);
		findViewById(R.id.tvresultri);
		
		findViewById(R.id.et2_1);
		findViewById(R.id.et2_2);
		findViewById(R.id.et2_3);
		findViewById(R.id.tvresul2);

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
	    
		TextView text = (TextView)findViewById(R.id.tvtriangulo);
		TextView texl = (TextView)findViewById(R.id.tvtri2);
		
		Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("text/plain");
	    intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        intent.putExtra(Intent.EXTRA_TEXT, "Formula"+ " " +text.getText()+ " "+texl.getText());
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

	public void triangulos(View view){
		
		EditText num1 = (EditText)findViewById(R.id.et1);
		EditText num2 = (EditText)findViewById(R.id.et2);
		TextView resultadofinal = (TextView)findViewById(R.id.tvresultri);
		
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double resultado;
		if(num1.length() <= 0 || num2.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		resultado = (dbnum1*dbnum2)/2;
		String rfinal= String.valueOf(resultado);
		resultadofinal.setText(" Area ="+rfinal);
	}
	}
	
public void triangulos2(View view){
		
		EditText num1 = (EditText)findViewById(R.id.et2_1);
		EditText num2 = (EditText)findViewById(R.id.et2_2);
		EditText num3 = (EditText)findViewById(R.id.et2_3);
		TextView resultadofinal = (TextView)findViewById(R.id.tvresul2);
		if(num1.length() <= 0 || num2.length() <= 0 || num3.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		double dbnum1 = Double.parseDouble(num1.getText().toString());
		double dbnum2 = Double.parseDouble(num2.getText().toString());
		double dbnum3 = Double.parseDouble(num3.getText().toString());
		double resultado;
		double area;
		
		resultado = (dbnum1+dbnum2+dbnum3)/2;
		area = Math.sqrt(resultado*(resultado-dbnum1)*(resultado-dbnum2)*(resultado-dbnum3));
		String rfinal= String.valueOf(area);
		resultadofinal.setText(" Area ="+rfinal);
		
	}
}
}