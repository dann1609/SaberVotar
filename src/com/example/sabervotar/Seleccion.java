package com.example.sabervotar;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
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

public class  Seleccion extends Activity {

	TextView usuario;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seleccion);
		usuario=(TextView)findViewById(R.id.textView2);
		Bundle recibe=getIntent().getExtras();
		usuario.setText("Bienvenido "+recibe.getString("usuario"));
		
		Button bt1=(Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			Dialog d1=new Dialog(Seleccion.this);
			d1.setTitle("Historial");
			d1.setContentView(R.layout.data1);
			d1.show();
			}
		});
        
        Button bt2=(Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			Dialog d2=new Dialog(Seleccion.this);
			d2.setTitle("Historial");
			d2.setContentView(R.layout.data2);
			d2.show();				
			}
		});
        
        Button bt3=(Button) findViewById(R.id.button3);
        bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			Dialog d3=new Dialog(Seleccion.this);
			d3.setTitle("Historial");
			d3.setContentView(R.layout.data3);
			d3.show();		
			}
		});
        
        Button bt4=(Button) findViewById(R.id.button4);
        bt4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			Dialog d4=new Dialog(Seleccion.this);
			d4.setTitle("Historial");
			d4.setContentView(R.layout.data4);
			d4.show();
			}
		});
        
        Button bt5=(Button) findViewById(R.id.button5);
        bt5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			Dialog d5=new Dialog(Seleccion.this);
			d5.setTitle("Historial");
			d5.setContentView(R.layout.data5);
			d5.show();
			}
		});
	}

}
