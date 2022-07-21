package com.example.minhasplantinhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

public class BuscaResultado extends AppCompatActivity {

    static ArrayList<Integer> plantasAdicionadas = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_resultado);

        String chaveContador = getIntent().getStringExtra("chave_contador");
        int contador = Integer.parseInt(chaveContador);

            Memoria memoria = new Memoria();
            //plantasAdicionadas.add(contador);
            plantasAdicionadas.clear();
            plantasAdicionadas.add(contador);





            RecyclerView recyclerView = findViewById(R.id.buscaresultado);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            //TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[contador];

//                TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[]{
//                        new TodasAsPlantas("Samanbaia", "sambaias", "1h", "manhã", "sombra", R.drawable.foto_sem_foto, R.drawable.sun_color)
//                };


            int qtdplantas = plantasAdicionadas.toArray().length;

            TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[1];
            for (int i = 0; i < qtdplantas; i++) {
                int x = plantasAdicionadas.get(i);
                todasAsPlantas[0] = new TodasAsPlantas(memoria.getNomeDasPlantas().get(x), memoria.getEspeciesDasPlantas().get(x), memoria.getTxtAgua().get(x), memoria.getTxtLuz().get(x), memoria.getTxtAmbiente().get(x), memoria.getImagemPlanta().get(x), memoria.getImagemLuz().get(x));
            }

            BuscaResultadoAdaptador adaptador = new BuscaResultadoAdaptador(todasAsPlantas, BuscaResultado.this);
            recyclerView.setAdapter(adaptador);

        }


    }



