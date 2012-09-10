package com.A30766.tarea1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashScreen extends Activity {

	private Thread splash_Thread;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        
        // Thread que despliega por 2 segundos la pantalla de Splash
        	splash_Thread =  new Thread(){
            @Override
            public void run(){
                try {
                    synchronized(this){
                        // Tiempo que se va a mostrar la pantalla de Splash
                        wait(2000);
                    }
                }
                catch(InterruptedException ex){                    
                }

                finish();
                
                // Muestra la siguiente Activity
                Intent mainIntent = new Intent();
                mainIntent.setClass(SplashScreen.this, MusicboxActivity.class);
                startActivity(mainIntent);
                stop();                    
            }
        };
        
        splash_Thread.start();    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash_screen, menu);
        return true;
    }
}
