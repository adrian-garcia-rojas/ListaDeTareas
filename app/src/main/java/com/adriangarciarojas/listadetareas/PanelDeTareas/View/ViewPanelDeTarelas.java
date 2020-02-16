package com.adriangarciarojas.listadetareas.PanelDeTareas.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.adriangarciarojas.listadetareas.R;

public class ViewPanelDeTarelas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_panel_de_tarelas);
        
        
        
        
    }
    
    public void metodosDePrueba(){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
