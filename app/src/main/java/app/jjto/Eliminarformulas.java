package app.jjto;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Eliminarformulas extends AppCompatActivity {

	TextView tvnombre;
	EditText etbusqueda;
	EditText etcontenido;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eliminarformulas);
		
		tvnombre = (TextView)findViewById(R.id.tvnombre);
		etbusqueda = (EditText)findViewById(R.id.etbusqueda);
		etcontenido = (EditText)findViewById(R.id.etcontenido);

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
	    
		TextView text = null;
		
		Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("text/plain");
	    intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
        intent.putExtra(Intent.EXTRA_TEXT, "Formula"+ " " +text);
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

	public void eliminar(View view){
	
		try{
		String elFila = etbusqueda.getText().toString();
		long elFilal = Long.parseLong(elFila);
		
		Formulas borrar = new Formulas(this);
		borrar.abrir();
		borrar.borrar(elFilal);
		borrar.cerrar();
		}catch(Exception e){
			String error = e.toString();
			Dialog d = new Dialog(this);
			d.setTitle("Intente de nuevo");
			TextView tv = new TextView(this);
			tv.setText(error);
			d.setContentView(tv);
			d.show();
		}
		
		}
	
	public void buscar(View view){
		
		String datos = etbusqueda.getText().toString();//info.recibir();
		if(datos != null && datos.trim().length() == 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
		Long lb = Long.parseLong(datos);
		Formulas formulas = new Formulas(this);
		try {
			formulas.abrir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Toast.makeText(getApplicationContext(),
			        "Error al cargar registro", Toast.LENGTH_SHORT)
			        .show();
			e.printStackTrace();
		}
		
		String bN = formulas.getN(lb);
		String bT = formulas.getT(lb);
		
		formulas.cerrar();
		
		//info.cerrar();
		etcontenido.setText("Nombre :"+bN+" ->"+bT);
		}
	}
	
}
