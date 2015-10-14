package app.jjto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ecuaciondelarecta extends AppCompatActivity {

	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ecuaciondelarecta);
		
		findViewById(R.id.etecsimple1);
		findViewById(R.id.etecsimple2);
		findViewById(R.id.etecsimple3);
		findViewById(R.id.etecsimple4);
		findViewById(R.id.tvresultado);
		findViewById(R.id.etecsimple5);

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
	    
		TextView text = (TextView)findViewById(R.id.tvecuacion);
		
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
	
	public void calcularecuacionrecta(View view){

		EditText num2 = (EditText)findViewById(R.id.etecsimple2);
		EditText num4 = (EditText)findViewById(R.id.etecsimple4);
		EditText num3 = (EditText)findViewById(R.id.etecsimple3);
		//EditText signo = (EditText)findViewById(R.id.etecsimple5);
		TextView totalecuacion = (TextView)findViewById(R.id.tvresultado);

		if(num2.length() <= 0 || num4.length() <= 0 || num3.length() <= 0){
			Toast toast =
		            Toast.makeText(getApplicationContext(),
		                    "Introduce un valor", Toast.LENGTH_SHORT);
		 
		        toast.show();
		}else{
			double dbnum2 = Double.parseDouble(num2.getText().toString());
			double dbnum4 = Double.parseDouble(num4.getText().toString());
			double dbnum3 = Double.parseDouble(num3.getText().toString());
			double ecuacionfinal;
			double x;
		
			x = (dbnum2*dbnum3)+dbnum4;
			ecuacionfinal = x;
			String resultado = String.valueOf(ecuacionfinal);
			totalecuacion.setText("y ="+resultado);
				
		}
	}
	
	/*class Lienzo extends View {

		public Lienzo(Context context) {
			super(context);
		}
		
		@SuppressLint("DrawAllocation")
		protected void onDraw(Canvas canvas) {
			canvas.drawRGB(255, 255, 255);
			int ancho = canvas.getWidth();
			int alto = canvas.getHeight();
			int lineax = canvas.getWidth();
			int lineay = canvas.getHeight();
			double x0 = 0,y0 = 0;
			//Point x0, y0;
			x0 = dbnum3;
			y0 = ecuacionfinal;

			Paint pincel1 = new Paint();
			pincel1.setARGB(255, 0, 0, 0);
			canvas.drawLine(0, 390, alto, 390, pincel1);
			canvas.drawLine(390, 0, 390, ancho, pincel1);
			canvas.drawLine(370, 20, lineax-410, 20, pincel1);
			canvas.drawLine(20, 390, 20, lineay-810, pincel1);
			canvas.drawLine(36, 390, 36, lineay-810, pincel1);
			canvas.drawLine(52, 390, 52, lineay-810, pincel1);
			canvas.drawLine(68, 390, 68, lineay-810, pincel1);
			canvas.drawLine(84, 390, 84, lineay-810, pincel1);
			canvas.drawLine(100, 390, 100, lineay-810, pincel1);
			canvas.drawLine(116, 390, 116, lineay-810, pincel1);
			canvas.drawLine(132, 390, 132, lineay-810, pincel1);
			canvas.drawLine(148, 390, 148, lineay-810, pincel1);
			canvas.drawLine(164, 390, 164, lineay-810, pincel1);
			canvas.drawLine(180, 390, 180, lineay-810, pincel1);
			canvas.drawLine(196, 390, 196, lineay-810, pincel1);
			canvas.drawLine(212, 390, 212, lineay-810, pincel1);
			canvas.drawLine(228, 390, 228, lineay-810, pincel1);
			canvas.drawLine(244, 390, 244, lineay-810, pincel1);
			canvas.drawLine(260, 390, 260, lineay-810, pincel1);
			canvas.drawLine(276, 390, 276, lineay-810, pincel1);
			canvas.drawLine(292, 390, 292, lineay-810, pincel1);
			canvas.drawLine(308, 390, 308, lineay-810, pincel1);
			canvas.drawLine(324, 390, 324, lineay-810, pincel1);
			canvas.drawLine(340, 390, 340, lineay-810, pincel1);
			canvas.drawLine(356, 390, 356, lineay-810, pincel1);
			canvas.drawLine(372, 390, 372, lineay-810, pincel1);
			canvas.drawLine(388, 390, 388, lineay-810, pincel1);
			canvas.drawLine(404, 390, 404, lineay-810, pincel1);
			canvas.drawLine(420, 390, 420, lineay-810, pincel1);
			canvas.drawLine(436, 390, 436, lineay-810, pincel1);
			canvas.drawLine(452, 390, 452, lineay-810, pincel1);
			canvas.drawLine(468, 390, 468, lineay-810, pincel1);
			canvas.drawLine(484, 390, 484, lineay-810, pincel1);
			canvas.drawLine(500, 390, 500, lineay-810, pincel1);
			canvas.drawLine(516, 390, 516, lineay-810, pincel1);
			canvas.drawLine(532, 390, 532, lineay-810, pincel1);
			canvas.drawLine(548, 390, 548, lineay-810, pincel1);
			canvas.drawLine(564, 390, 564, lineay-810, pincel1);
			canvas.drawLine(580, 390, 580, lineay-810, pincel1);
			canvas.drawLine(596, 390, 596, lineay-810, pincel1);
			canvas.drawLine(612, 390, 612, lineay-810, pincel1);
			canvas.drawLine(628, 390, 628, lineay-810, pincel1);
			canvas.drawLine(644, 390, 644, lineay-810, pincel1);
			canvas.drawLine(660, 390, 660, lineay-810, pincel1);
			canvas.drawLine(676, 390, 676, lineay-810, pincel1);
			canvas.drawLine(792, 390, 792, lineay-810, pincel1);
			pincel1.setARGB(255, 0, 0, 0);
			
			canvas.drawLine((float)x0, (float)y0, (float)x0,(float)y0, pincel1);
			//canvas.drawLine((float)ecuacionfinal,getHeight() / 2, getWidth() - 40, getHeight() / 2, pincel1);
			
			int cantLineas = lineax / 10 - 2;
			//int cantLineasy = lineay / 10 - 2;
			for (int fila = 0; fila < cantLineas; fila++) {
				canvas.drawLine(370, fila * 20 + 10, lineax-410, fila * 20 + 10,
						pincel1);
			}
		}*/


}

