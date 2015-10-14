package app.jjto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity {

	private Spinner spmenu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iniciosesion);
	
	spmenu = (Spinner) findViewById(R.id.spmenu);
	String []opciones = {"Ver Formulas","Crear Formulas","Cargar Formulas","Modificar Formulas","Eliminar Formulas"};
	ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
	spmenu.setAdapter(adapter);

		getSupportActionBar().setHomeAsUpIndicator(R.drawable.miformula);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowTitleEnabled(false);

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
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
	
	public void operar(View view){
		
		String seleccion = spmenu.getSelectedItem().toString();
		if (seleccion.equals("Ver Formulas")){
			Intent i = new Intent(this, VerFormulas.class);
			startActivity(i);
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Has seleccionado Ver Formulas", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else
			if(seleccion.equals("Crear Formulas")){
				Intent i = new Intent(this, CrearFormulas.class);
				startActivity(i);
				Toast toast =
			            Toast.makeText(getApplicationContext(),
			                    "Has seleccionado Crear Formulas", Toast.LENGTH_SHORT);
			 
			        toast.show();
			}else
				if(seleccion.equals("Cargar Formulas")){
					Intent i = new Intent(this, CargarFormulas.class);
					startActivity(i);
					Toast toast =
				            Toast.makeText(getApplicationContext(),
				                    "Has seleccionado Cargar Formulas", Toast.LENGTH_SHORT);
				 
				        toast.show();
				}else
					if(seleccion.equals("Modificar Formulas")){
						Intent i = new Intent(this, EditarFormulas.class);
						startActivity(i);
						Toast toast =
					            Toast.makeText(getApplicationContext(),
					                    "Has seleccionado Editar Formulas", Toast.LENGTH_SHORT);
					 
					        toast.show();
					}else
						if(seleccion.equals("Eliminar Formulas")){
							Intent i = new Intent(this, Eliminarformulas.class);
							startActivity(i);
							Toast toast =
						            Toast.makeText(getApplicationContext(),
						                    "Has seleccionado Eliminar Formulas", Toast.LENGTH_SHORT);
						 
						        toast.show();
						}
						
	}
	
}
