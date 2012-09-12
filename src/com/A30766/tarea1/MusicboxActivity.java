package com.A30766.tarea1;

import java.util.ArrayList;
import java.util.Iterator;

import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MusicboxActivity extends Activity {
	
	private EditText consulta;
	private ImageButton buscarBoton;
	private ListView lista;
	private TextView empty;
	ArrayList<CancionViewHolder> canciones = new ArrayList<CancionViewHolder>();
	ArrayList<CancionViewHolder> nuevasCanciones = new ArrayList<CancionViewHolder>();
	private static final String TAG = "MyActivity";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicbox);
        
        consulta = (EditText)findViewById(R.id.editText1);
        buscarBoton = (ImageButton)findViewById(R.id.button1);
        lista = (ListView)findViewById(R.id.listView1);
        empty = (TextView)findViewById(R.id.textView1);
        //Pone los datos en el listView
        rellenarListView();
        buscarBoton.setOnClickListener(new View.OnClickListener() {
        	private ProgressDialog dialog;

			public void onClick(View v) {
				dialog = ProgressDialog.show(MusicboxActivity.this, "", 
                        "Buscando", true);
        		Thread t = new Thread(){
        			public void run(){
        				try{
        					sleep(3000);
        				}catch(Exception e){
        					Log.e(TAG, e.getMessage());
        				}
        				dialog.dismiss();
        			}
        			
        		};
        		t.start();
        		rellenarListView();
        		empty.setText("Nada para mostrar...");
        		lista.setEmptyView(empty);
        		       		
        		
			}
        	
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_musicbox, menu);
        return true;
    }
    
    
    public void rellenarListView(){
    	ListView listView = (ListView) findViewById(R.id.listView1);
    	
    	if(consulta.getText().toString().equals("")){
    		canciones.clear();
	    	CancionViewHolder cancion1 = new CancionViewHolder("Another One Bites The Dust", "Queen");
	        canciones.add(cancion1);
	        CancionViewHolder cancion2 = new CancionViewHolder("Don't stop me now", "Queen");
	        canciones.add(cancion2);
	        CancionViewHolder cancion3 = new CancionViewHolder("Love song", "The Cure");
	        canciones.add(cancion3);
	        CancionViewHolder cancion4 = new CancionViewHolder("Sad but true", "Metallica");
	        canciones.add(cancion4);
	        CancionViewHolder cancion5 = new CancionViewHolder("Man in the Mirror", "Michael Jackson");
	        canciones.add(cancion5);
	        CancionViewHolder cancion6 = new CancionViewHolder("Another angel down", "Avantasia");
	        canciones.add(cancion6);
	        CancionViewHolder cancion7 = new CancionViewHolder("Tears don't fall", "Bullet for my valentine");
	        canciones.add(cancion7);
	        CancionViewHolder cancion8 = new CancionViewHolder("We found love", "Rihanna");
	        canciones.add(cancion8);
	        CancionViewHolder cancion9 = new CancionViewHolder("Calling Dr. Love", "Kiss");
	        canciones.add(cancion9);
	        CancionViewHolder cancion10 = new CancionViewHolder("Don't tread on me", "Metallica");
	        canciones.add(cancion10);
	        CancionViewHolder cancion11 = new CancionViewHolder("Hungry for heaven", "Dio");
	        canciones.add(cancion11);
	        CancionViewHolder cancion12 = new CancionViewHolder("Another life", "Iron Maiden");
	        canciones.add(cancion12);
	        CancionViewHolder cancion13 = new CancionViewHolder("Ghost of perdition", "Opeth");
	        canciones.add(cancion13);
	        CancionViewHolder cancion14 = new CancionViewHolder("Back in the day", "Megadeth");
	        canciones.add(cancion14);
	        CancionViewHolder cancion15 = new CancionViewHolder("Sexy love", "Ne-yo");
	        canciones.add(cancion15);
	        CancionViewHolder cancion16 = new CancionViewHolder("I'm Gonna Find Another You", "John Mayer");
	        canciones.add(cancion16);
	        CancionViewHolder cancion17 = new CancionViewHolder("Don't Go Away Mad", "Mštley CrŸe");
	        canciones.add(cancion17);
	        CancionViewHolder cancion18 = new CancionViewHolder("Back on the streets", "Helloween");
	        canciones.add(cancion18);
	        CancionViewHolder cancion19 = new CancionViewHolder("Heart of a Brave", "Primal Fear");
	        canciones.add(cancion19);
	        CancionViewHolder cancion20 = new CancionViewHolder("Don't know nothing", "Maroon5");
	        canciones.add(cancion20);
	        CancionViewHolder cancion21 = new CancionViewHolder("Back down south", "Kings of Leoen");
	        canciones.add(cancion21);
	        CancionViewHolder cancion22 = new CancionViewHolder("Don't Stand So Close To Me", "The Police");
	        canciones.add(cancion22);
	        CancionViewHolder cancion23 = new CancionViewHolder("Trust", "Megadeth");
	        canciones.add(cancion23);
	        CancionViewHolder cancion24 = new CancionViewHolder("Back to you", "John Mayer");
	        canciones.add(cancion24);
	        CancionViewHolder cancion25 = new CancionViewHolder("Ghost of navigator", "Iron Maiden");
	        canciones.add(cancion25);
	        CancionViewHolder cancion26 = new CancionViewHolder("Stone In Love", "Journey");
	        canciones.add(cancion26);
	        CancionViewHolder cancion27 = new CancionViewHolder("Don't break my heart", "UB40");
	        canciones.add(cancion27);
	        CancionViewHolder cancion28 = new CancionViewHolder("Hungry like the wolf", "Duran Duran");
	        canciones.add(cancion28);
	        CancionViewHolder cancion29 = new CancionViewHolder("Stand inside your love", "Smashing Pumpkins");
	        canciones.add(cancion29);
	        CancionViewHolder cancion30 = new CancionViewHolder("Don't spit on my mind", "Helloween");
	        canciones.add(cancion30);  
	        
	        //Asignar el adaptador al ListView
	        listView.setAdapter(new CancionItemAdapter(this, android.R.layout.simple_list_item_1, canciones));
    	}else{
    		nuevasCanciones.clear();
    		Log.v(TAG, consulta.getText().toString());
    		
    		buscar(consulta.getText().toString(), canciones );
    		if(nuevasCanciones.isEmpty()){
    			
    		}
    			
    		Log.v(TAG, "Antes de list!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    		listView.setAdapter(new CancionItemAdapter(this, android.R.layout.simple_list_item_1, nuevasCanciones));
    		Log.v(TAG, "Despu�s de list!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	}
        
        
        
    

    }
    
    public class CancionItemAdapter extends ArrayAdapter<CancionViewHolder> {
    	private ArrayList<CancionViewHolder> misCanciones;
    	
    	
    	public CancionItemAdapter(Context context, int textViewResourceId, ArrayList<CancionViewHolder> misCanciones) {
			super(context, textViewResourceId, misCanciones);
			this.misCanciones = misCanciones;
		}
    	
    	@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				LayoutInflater vi = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = vi.inflate(R.layout.listitem, null);
			}
			CancionViewHolder cancion = misCanciones.get(position);
			if (cancion != null) {
				TextView laCancion = (TextView) v.findViewById(R.id.cancion);
				TextView elArtista = (TextView) v.findViewById(R.id.artista);
				//ImageView elArte = (ImageView) v.findViewById(R.id.arte);

				if (laCancion != null) {
					laCancion.setText(cancion.nombre);
				}

				if(elArtista != null) {
					elArtista.setText(cancion.artista );
				}
			}
			
			
			return v;
    	}
    }
	


    
    public class CancionViewHolder {
    	public String nombre;
    	public String artista;
    	
    	public CancionViewHolder(String nombre, String artista) {
    		this.nombre = nombre;
    		this.artista = artista;
    	}
    	
    	public String getNombre(){
			return nombre;
    	}
    }

    public ArrayList<CancionViewHolder> buscar(String cadena, ArrayList<CancionViewHolder> canciones){
    	String lista;
    	Iterator itr = canciones.iterator();
    	///////////////////////////////////////////Log.v(TAG, itr.toString());
    	int i = 0;
    	while(itr.hasNext() && i <canciones.size()){
    		lista = canciones.get(i).getNombre();
    		Log.v(TAG, canciones.get(i).getNombre());
    		if(like(cadena, lista)){
    			nuevasCanciones.add(canciones.get(i));
    		}
    		Log.v(TAG, "EL CONTADOR"+i);
    		i++;
    	}
    	return nuevasCanciones;
    }
    
    public boolean like(String busqueda, String lista){
    	busqueda = busqueda.toLowerCase();
    	lista = lista.toLowerCase();
    	if(lista.indexOf(busqueda) == -1)
    		return false; 
    	return true;
  }
   
}



