package com.example.minhasplantinhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ListaDePlantas extends AppCompatActivity {

    //Página que mostra a lista total de plantas
    //----------------------------------------------------------

    //-----------------------------------------------------------
    //Dados dos CardsView
    Memoria cardview = new Memoria();
    ArrayList<String> nomeDasPlantas = cardview.getNomeDasPlantas();
    ArrayList<String> especiesDasPlantas = cardview.getEspeciesDasPlantas();
    ArrayList<String> txtAgua = cardview.getTxtAgua();
    ArrayList<String> txtLuz = cardview.getTxtLuz();
    ArrayList<String> txtAmbiente = cardview.getTxtAmbiente();
    //-----------------------------------------------------------
    //Arrays para facilitar a manipulação da imagem.
    ArrayList<Integer> imagemPlanta = cardview.getImagemPlanta();
    ArrayList<Integer> imagemLuz = cardview.getImagemLuz();
    //----------------------------------------------------------
    //Contador de itens
    int contador = nomeDasPlantas.toArray().length;


    //----------------------------------------------------------
    //Lista para adicionar todas as plantas
    TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[contador];

    SearchView searchView;
    RecyclerView recyclerView;
    TodasAsPlantasAdaptador adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_plantas);


        preencherLista();

        abrirRecyclerView();
//        //Adicionar os dados na lista
//        TodasAsPlantas[] todasAsPlantas = new TodasAsPlantas[]{
//
//                //new TodasAsPlantas("Samanbaia", "sambaias", "1h", "manhã", "sombra", R.drawable.foto_sem_foto, R.drawable.sun_color)
//                //new TodasAsPlantas("Samanbaia", "sambaias", "1h", "manhã", "sombra", R.drawable.foto_sem_foto, R.drawable.sun_color)
//                //new TodasAsPlantas("Samanbaia", "sambaias", "1h", "manhã", "sombra", R.drawable.foto_sem_foto, R.drawable.sun_color)
//        };
//
        searchView = findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                    //String str = nomeDasPlantas.get(1);
                    //String minusculo = str.toLowerCase();


                if (nomeDasPlantas.stream().anyMatch(query::equalsIgnoreCase)) {
                    Toast.makeText(ListaDePlantas.this, "Encontrado",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ListaDePlantas.this, "Nada Encontrado",Toast.LENGTH_LONG).show();
                }
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });



    }

    private void preencherLista() {

        for (int i = 0; i < nomeDasPlantas.toArray().length; i++) {
            todasAsPlantas[i] = new TodasAsPlantas(nomeDasPlantas.get(i), especiesDasPlantas.get(i), txtAgua.get(i), txtLuz.get(i), txtAmbiente.get(i), imagemPlanta.get(i), imagemLuz.get(i));
        }
    }

    private void abrirRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.listaDePlantas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        TodasAsPlantasAdaptador todasAsPlantasAdaptador = new TodasAsPlantasAdaptador(todasAsPlantas, ListaDePlantas.this);
        recyclerView.setAdapter(todasAsPlantasAdaptador);
    }




}