package app.jjto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SQLVista extends Activity{
	
	TextView tvnombre;
	EditText etbusqueda;
	EditText etcontenido;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cargarformulas);
		
		tvnombre = (TextView)findViewById(R.id.tvnombre);
		etbusqueda = (EditText)findViewById(R.id.etbusqueda);
		etcontenido = (EditText)findViewById(R.id.etcontenido);
		
		Formulas info = new Formulas(this);
		try {
			info.abrir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String datos = info.recibir();
		info.cerrar();
		etcontenido.setText(datos);
	}
}
