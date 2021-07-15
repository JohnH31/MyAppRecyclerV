package com.jherrera.myapprecyclerv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ArrayList<Integer> lista = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Barra de Imagenes");
        recyclerView = findViewById(R.id.recyclerId);

        //Datos
        lista.add(R.drawable.coche);
        lista.add(R.drawable.elefante);
        lista.add(R.drawable.impresionismo1);
        lista.add(R.drawable.impresionismo2);
        lista.add(R.drawable.paletapintura);
        lista.add(R.drawable.pesado);
        lista.add(R.drawable.subrealismo1);
        lista.add(R.drawable.quimicos);
        lista.add(R.drawable.subrealismo);
        lista.add(R.drawable.vaca);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(lista);
        recyclerView.setAdapter(adaptadorRecycler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                //Toast.makeText(this,"Bolsa de compras",Toast.LENGTH_SHORT).show();
                //img.setImageResource(R.drawable.online_shopping);
                break;
            case R.id.item2:
                recyclerView.setLayoutManager(new GridLayoutManager(this,3));
                //Toast.makeText(this,"Compras",Toast.LENGTH_SHORT).show();
                //img.setImageResource(R.drawable.shopping);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}