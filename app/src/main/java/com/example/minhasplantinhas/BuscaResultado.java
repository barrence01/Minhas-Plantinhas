package com.example.minhasplantinhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BuscaResultado extends AppCompatActivity {

    static ArrayList<Integer> plantasAdicionadas = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_resultado);

        String chaveContador = getIntent().getStringExtra("chave_contador");
        int contador = Integer.parseInt(chaveContador);

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
                todasAsPlantas[0] = new TodasAsPlantas(Memoria.nomeDasPlantas.get(x), Memoria.especiesDasPlantas.get(x), Memoria.txtAgua.get(x), Memoria.txtLuz.get(x), Memoria.txtAmbiente.get(x), Memoria.imagemPlanta.get(x), Memoria.imagemLuz.get(x));
            }

            BuscaResultadoAdaptador adaptador = new BuscaResultadoAdaptador(todasAsPlantas, BuscaResultado.this);
            recyclerView.setAdapter(adaptador);

        }


    }



