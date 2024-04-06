package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class InicioArtista extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_artista);
    }
    public void SiguienteLupa(View view){
        Intent siguiente = new Intent (this, BusquedaUsuario.class);
        startActivity(siguiente);
    }

    public void SiguienteTresRayas(View view){
        Intent siguiente = new Intent (this, TresRayas.class);
        startActivity(siguiente);
    }
    public void SiguienteTresPuntods(View view) {
        Intent siguiente = new Intent(this, TresPuntos.class);
        startActivity(siguiente);
    }

    public void SolicitudEvento(View view) {
        Intent siguiente = new Intent(this, SolicitudEventoArtista.class);
        startActivity(siguiente);
    }

}