package com.example.minhasplantinhas;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class MinhasPlantas extends AppCompatActivity {
    //Esta activity controla os botões da página minhas plantas
    //private AppBarConfiguration appBarConfiguration;
    //private ActivityMinhasPlantasBinding binding;

    //Array estático para não zerar onResume
    static ArrayList<Integer> plantasAdicionadas = new ArrayList<Integer>();
    static ArrayList<Integer> plantasAdicionadas2 = new ArrayList<Integer>();

    TextView toqueAdicionar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_plantas);


        //----------------------------------------------------------
        //Botões
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MinhasPlantas.this, ListaDePlantas.class);
                startActivity(intent);
                Snackbar.make(view, "Adicionando", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

    @Override
    public void onResume() {
        super.onResume();
        String chaveContador = getIntent().getStringExtra("chave_contador");

        if (chaveContador != null) {
            int contador = Integer.parseInt(chaveContador);
            Memoria memoria = new Memoria();
            plantasAdicionadas.add(contador);

            ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(plantasAdicionadas));
            plantasAdicionadas2 = listWithoutDuplicates;

            int qtdNDuplicado = listWithoutDuplicates.toArray().length;


            RecyclerView recyclerView = findViewById(R.id.minhasplantas);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            //TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[contador];

//                TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[]{
//                        new TodasAsPlantas("Samanbaia", "sambaias", "1h", "manhã", "sombra", R.drawable.foto_sem_foto, R.drawable.sun_color)
//                };

            int qtdplantas = qtdNDuplicado;
            if(listWithoutDuplicates.toArray().length > 5 ){
                toqueAdicionar = findViewById(R.id.toqueadicionar);
                toqueAdicionar.setText("");
            }

            TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[qtdplantas];
            for (int i = 0; i < qtdplantas; i++) {
                int x = listWithoutDuplicates.get(i);
                todasAsPlantas[i] = new TodasAsPlantas(memoria.getNomeDasPlantas().get(x), memoria.getEspeciesDasPlantas().get(x), memoria.getTxtAgua().get(x), memoria.getTxtLuz().get(x), memoria.getTxtAmbiente().get(x), memoria.getImagemPlanta().get(x), memoria.getImagemLuz().get(x));
            }

            MinhasPlantasAdaptador adaptador = new MinhasPlantasAdaptador(todasAsPlantas, MinhasPlantas.this);
            adaptador.setContador(qtdplantas);
            recyclerView.setAdapter(adaptador);

        } else {

            Toast.makeText(getApplicationContext(),
                    "Não há plantas!",
                    Toast.LENGTH_LONG).show();
        }


    }





}



