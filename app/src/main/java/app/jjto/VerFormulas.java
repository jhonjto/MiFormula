package app.jjto;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

public class VerFormulas extends AppCompatActivity {
	
	ExpandableListView exv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.verformulas);

		getSupportActionBar().setHomeAsUpIndicator(R.drawable.miformula);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		
		exv = (ExpandableListView) findViewById(R.id.exLista);
		exv.setAdapter(new MiAdaptador(this));
		exv.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				//String grupo = MiAdaptador.hijos[groupPosition][childPosition];
				//Toast.makeText(getBaseContext(), "seleccionaste a: "+grupo, Toast.LENGTH_LONG).show();
				if(groupPosition == 0 && childPosition == 0){
					Intent a = new Intent(getBaseContext(), Suma.class);
					startActivity(a);
				}
				if(groupPosition == 0 && childPosition == 1){
					Intent b = new Intent(getBaseContext(), Resta.class);
					startActivity(b);
				}
				if(groupPosition == 0 && childPosition == 2){
					Intent c = new Intent(getBaseContext(), Multiplicacion.class);
					startActivity(c);
				}
				if(groupPosition == 0 && childPosition == 3){
					Intent d = new Intent(getBaseContext(), Division.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 4){
					Intent d = new Intent(getBaseContext(), Conversiones.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 5){
					Intent d = new Intent(getBaseContext(), Conversionpeso.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 6){
					Intent d = new Intent(getBaseContext(), Conversionlongitud.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 7){
					Intent d = new Intent(getBaseContext(), Conversionarea.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 8){
					Intent d = new Intent(getBaseContext(), Conversionvolumen.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 9){
					Intent d = new Intent(getBaseContext(), Calcularporcentaje.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 10){
					Intent d = new Intent(getBaseContext(), NumerosNaturales.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 11){
					Intent d = new Intent(getBaseContext(), MaximoComunDivisor.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 12){
					Intent d = new Intent(getBaseContext(), MinimoComunMultiplo.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 13){
					Intent d = new Intent(getBaseContext(), NumerosEnteros.class);
					startActivity(d);
				}
				if(groupPosition == 0 && childPosition == 14){
					Intent l = new Intent(getBaseContext(), ValorAbsoluto.class);
					startActivity(l);
				}
				if(groupPosition == 0 && childPosition == 15){
					Intent h = new Intent(getBaseContext(), Potencias.class);
					startActivity(h);
				}
				if(groupPosition == 0 && childPosition == 16){
					Intent h = new Intent(getBaseContext(), Fracciones.class);
					startActivity(h);
				}
				if(groupPosition == 1 && childPosition == 0){
					Intent e = new Intent(getBaseContext(), Ecuaciones.class);
					startActivity(e);
				}
				if(groupPosition == 1 && childPosition == 1){
					Intent f = new Intent(getBaseContext(), EcuacionesSegundoGrado.class);
					startActivity(f);
				}
				if(groupPosition == 1 && childPosition == 2){
					Intent i = new Intent(getBaseContext(), Exponentes.class);
					startActivity(i);
				}
				if(groupPosition == 1 && childPosition == 3){
					Intent j = new Intent(getBaseContext(), Exponentes2.class);
					startActivity(j);
				}
				if(groupPosition == 1 && childPosition == 4){
					Intent k = new Intent(getBaseContext(), Monomios.class);
					startActivity(k);
				}
				if(groupPosition == 1 && childPosition == 5){
					Intent l = new Intent(getBaseContext(), Monomios2.class);
					startActivity(l);
				}
				if(groupPosition == 1 && childPosition == 6){
					Intent l = new Intent(getBaseContext(), Ecuaciondelarecta.class);
					startActivity(l);
				}
				if(groupPosition == 1 && childPosition == 7){
					Intent l = new Intent(getBaseContext(), Ecuaciondelarecta2.class);
					startActivity(l);
				}
				if(groupPosition == 1 && childPosition == 8){
					Intent l = new Intent(getBaseContext(), Logaritmos.class);
					startActivity(l);
				}
				if(groupPosition == 1 && childPosition == 9){
					Intent l = new Intent(getBaseContext(), Logaritmonumero.class);
					startActivity(l);
				}
				if(groupPosition == 1 && childPosition == 10){
					Intent l = new Intent(getBaseContext(), Logaritmonatural.class);
					startActivity(l);
				}
				if(groupPosition == 2 && childPosition == 0){
					Intent l = new Intent(getBaseContext(), Arcocoseno.class);
					startActivity(l);
				}
				if(groupPosition == 2 && childPosition == 1){
					Intent l = new Intent(getBaseContext(), Arcoseno.class);
					startActivity(l);
				}
				if(groupPosition == 2 && childPosition == 2){
					Intent l = new Intent(getBaseContext(), Arcotangente.class);
					startActivity(l);
				}
				if(groupPosition == 2 && childPosition == 3){
					Intent l = new Intent(getBaseContext(), Coseno.class);
					startActivity(l);
				}
				if(groupPosition == 2 && childPosition == 4){
					Intent l = new Intent(getBaseContext(), Seno.class);
					startActivity(l);
				}
				if(groupPosition == 3 && childPosition == 0){
					Intent m = new Intent(getBaseContext(), Triangulo.class);
					startActivity(m);
				}
				if(groupPosition == 3 && childPosition == 1){
					Intent n = new Intent(getBaseContext(), Cuadrado.class);
					startActivity(n);
				}
				if(groupPosition == 3 && childPosition == 2){
					Intent o = new Intent(getBaseContext(), Rectangulo.class);
					startActivity(o);
				}
				if(groupPosition == 3 && childPosition == 3){
					Intent p = new Intent(getBaseContext(), Rombo.class);
					startActivity(p);
				}
				if(groupPosition == 3 && childPosition == 4){
					Intent q = new Intent(getBaseContext(), Trapecio.class);
					startActivity(q);
				}
				if(groupPosition == 3 && childPosition == 5){
					Intent r = new Intent(getBaseContext(), Poligonor.class);
					startActivity(r);
				}
				if(groupPosition == 3 && childPosition == 6){
					Intent s = new Intent(getBaseContext(), Circulo.class);
					startActivity(s);
				}
				if(groupPosition == 4 && childPosition == 0){
					Intent s = new Intent(getBaseContext(), Moda.class);
					startActivity(s);
				}
				return false;
			}
		});
		
	}
	
}