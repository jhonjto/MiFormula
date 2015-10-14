package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ecuaciondelarecta2 extends AppCompatActivity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ecuaciondelarecta2);
		
		findViewById(R.id.etecsimple1);
		findViewById(R.id.etecsimple2);
		findViewById(R.id.etecsimple3);
		findViewById(R.id.etecsimple4);
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
	    
		TextView text = (TextView)findViewById(R.id.tvpendiente);
		
		Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("text/plain");
	    intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        intent.putExtra(Intent.EXTRA_TEXT, "Formula"+ " " +text.getText());
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
	
	public void calcularpendiente(View view){
		
		EditText num1 = (EditText)findViewById(R.id.etecsimple1);
		EditText num2 = (EditText)findViewById(R.id.etecsimple2);
		EditText num4 = (EditText)findViewById(R.id.etecsimple4);
		EditText num3 = (EditText)findViewById(R.id.etecsimple3);
		TextView totalecuacion = (TextView)findViewById(R.id.tvresultado);
		if(num2.length() <= 0 || num4.length() <= 0 || num3.length() <= 0 || num3.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
			double dbnum1 = Double.parseDouble(num1.getText().toString());
			double dbnum2 = Double.parseDouble(num2.getText().toString());
			double dbnum4 = Double.parseDouble(num4.getText().toString());
			double dbnum3 = Double.parseDouble(num3.getText().toString());
			double ecuacionfinal;
			double dx;
			double dy;
			double x=0;
			
			dx = dbnum3 - dbnum4;
			dy = dbnum1 - dbnum2;
			if(dx != 0){
			x = dy / dx;	
			
			ecuacionfinal = x;
			String resultado = String.valueOf(ecuacionfinal);
			totalecuacion.setText("y ="+resultado);
				
		}
		}
}
}
