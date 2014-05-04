package com.example.sabervotar;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
TextView tv1;
EditText tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv1=(TextView) findViewById(R.id.label2);
        
        Button miboton=(Button) findViewById(R.id.button1);
        miboton.setOnClickListener(new OnClickListener() {
		
                	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView mietiqueta = (TextView) findViewById(R.id.label);
				EditText minombre = (EditText) findViewById(R.id.escribe1);
				String name1=minombre.getText().toString();
				tv1.setText("Bienvenido "+name1);
				//mostrar pantalla seleccion
				Intent int1=new Intent("com.example.sabervotar.Seleccion");
				Bundle nombre=new Bundle();
				nombre.putString("usuario",name1);
				int1.putExtras(nombre);
				startActivity(int1);
			}
		});
        
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

   
}
