package app.jjto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Formulas {
	
	public static final String ID_FILA = "_id";
	public static final String ID_NOMBRE = "nombre_formula";
	public static final String ID_CONTENIDO = "contenido_formula";
	
	private static final String N_BD = "Formulas";
	private static final String N_TABLA = "Tabla_Formulas";
	private static final int VERSION_BD = 1;
	
	private BDHelper nHelper;
	private final Context nContexto;
	private SQLiteDatabase nBD;
	
	private static class BDHelper extends SQLiteOpenHelper{

		public BDHelper(Context context) {
			super(context, N_BD, null, VERSION_BD);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE "+ N_TABLA + "(" +
			ID_FILA + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
			ID_NOMBRE + " TEXT NOT NULL, " +
			ID_CONTENIDO + " TEXT NOT NULL);"

					);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + N_TABLA);
			onCreate(db);
		}
		
	}

	public Formulas(Context c){
		nContexto = c;
	}
	
	public Formulas abrir() throws Exception{
		nHelper = new BDHelper(nContexto);
		nBD = nHelper.getWritableDatabase();
		return this;
	}

	public void cerrar() {
		// TODO Auto-generated method stub
		nHelper.close();
	}

	public long crearEntrada(String nom, String cont) {
		// TODO Auto-generated method stub
		ContentValues cv = new ContentValues();
		cv.put(ID_NOMBRE, nom);
		cv.put(ID_CONTENIDO, cont);
		return nBD.insert(N_TABLA, null, cv);
		
	}

	public String recibir() {
		// TODO Auto-generated method stub
		String[]columnas = new String[]{ID_FILA, ID_NOMBRE, ID_CONTENIDO};
		Cursor c = nBD.query(N_TABLA, columnas, null, null, null, null, null);
		String resultado = "";
		
		int iFila = c.getColumnIndex(ID_FILA);
		int iNombre = c.getColumnIndex(ID_NOMBRE);
		int iContenido = c.getColumnIndex(ID_CONTENIDO);
		
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			resultado = resultado + c.getString(iFila) + " " + c.getString(iNombre) + " " + c.getString(iContenido) + " \n";
		}
		
		return resultado;
	}

	public String getN(Long lb) {
		// TODO Auto-generated method stub
		String[]columnas = new String[]{ID_FILA, ID_NOMBRE, ID_CONTENIDO};
		Cursor c = nBD.query(N_TABLA, columnas, ID_FILA + "=" + lb, null, null, null, null);
		if(c.moveToFirst()){
			//c.moveToNext();
			String nb = c.getString(1);
			return nb;
		}else{
			Toast.makeText(nContexto, "No existe el registro",
                    Toast.LENGTH_SHORT).show();
		}
		return null;
	}

	public String getT(Long lb) {
		// TODO Auto-generated method stub
		String[]columnas = new String[]{ID_FILA, ID_NOMBRE, ID_CONTENIDO};
		Cursor c = nBD.query(N_TABLA, columnas, ID_FILA + "=" + lb, null, null, null, null);
		if(c.moveToFirst()){
			//c.moveToNext();
			String tb= c.getString(2);
			return tb;
		}else{
			Toast.makeText(nContexto, "No existe el registro",
                    Toast.LENGTH_SHORT).show();
		}
		return null;
	}

	public void editar(Long lb, String nombre, String contenido) throws Exception{
		// TODO Auto-generated method stub
		ContentValues cvEditar = new ContentValues();
		cvEditar.put(ID_NOMBRE, nombre);
		cvEditar.put(ID_CONTENIDO, contenido);
		nBD.update(N_TABLA, cvEditar, ID_FILA + "=" + lb, null);
	}

	public void borrar(long elFilal) throws Exception{
		// TODO Auto-generated method stub
		nBD.delete(N_TABLA, ID_FILA + "=" + elFilal, null);
		
	}
	
}
