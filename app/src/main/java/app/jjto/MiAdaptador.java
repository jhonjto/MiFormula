package app.jjto;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MiAdaptador extends BaseExpandableListAdapter{

	Context contexto;
	String[]padre = {"        Aritmetica", "        Algebra y Algebra lineal","        Avanzadas","        Especiales"
			,"        Estadística"};
	static String[][]hijos ={
		{"suma","resta","multiplicación","división"
			,"conversion grados-radianes","conversion kilogramos-libras"
			,"conversion kilometros-metros","conversion Hectareas-acres"
			,"conversion Litros-mililitros","porcentaje","numeros naturales"
			,"maximo comun divisor","minimo comun multiplo","numeros enteros","valor absoluto"
			,"potencias","fracciones"},
		{"ecuaciones primer grado","ecuaciones segundo grado","exponentes parte 1",
			"exponentes parte 2","monomios parte 1","monomios parte 2",
			"ecuacion de la recta parte 1","ecuacion de la recta parte 2"
			,"logaritmo base b","logaritmo n","logaritmo natural"},
		{"arcocoseno","arcoseno","arcotangente","coseno","seno"},
		{"área triangulo","área cuadrado","área rectángulo","área rombo",
			"área trapecio","área poligono regular","área circulo"},
		{"moda"},
	};
	
	public MiAdaptador(Context context) {
		// TODO Auto-generated constructor stub
		this.contexto = context;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView tv = new TextView(contexto);
		tv.setText(hijos[groupPosition][childPosition]);
		tv.setTextSize(30);
		return tv;
		//Para ver imagenes en las casillas
		
		/*View inflate = View.inflate(contexto, R.layout.childrow, null);
		TextView tv = (TextView) inflate.findViewById(R.id.tvHijo);
		tv.setText(hijos[groupPosition][childPosition]);
		return inflate;*/
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return hijos[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return padre.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView tv = new TextView(contexto);
		tv.setText(this.padre[groupPosition]);
		tv.setTextSize(30);
		return tv;
		/*View inflate = View.inflate(contexto, R.layout.grouprow, null);
		TextView tv = (TextView) inflate.findViewById(R.id.tvPadre);
		tv.setText(this.padre[groupPosition]);
		return inflate;*/
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}

}
