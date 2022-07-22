package com.example.minhasplantinhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;

import android.widget.Toast;

import java.text.Normalizer;
import java.util.ArrayList;


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

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String busca) {
//                int indexDaBusca;
//                String a = busca.toLowerCase();
//
//                for (int i = 0; i < nomeDasPlantas.toArray().length; i++) {
//                    String x = nomeDasPlantas.get(i).toLowerCase();
//                    if (x.startsWith(a)) {
//                        indexDaBusca = i;
//                        Toast.makeText(ListaDePlantas.this, "Encontrado!", Toast.LENGTH_LONG).show();
//                        Intent intent = new Intent(ListaDePlantas.this, BuscaResultado.class);
//                        String strcontador = String.valueOf(indexDaBusca);
//                        intent.putExtra("chave_contador", strcontador);
//                        startActivity(intent);
//                        break;
//
//                    } else if (i == nomeDasPlantas.toArray().length - 1){
//                        Toast.makeText(ListaDePlantas.this, "Nada Encontrado", Toast.LENGTH_LONG).show();
//                    }
//
//                }
//
////                if (nomeDasPlantas.stream().anyMatch(query::equalsIgnoreCase)) {
////                    //int x = nomeDasPlantas.get().toLowerCase().indexOf(query);
////                    String y = query.toLowerCase(); }
//
//                return true;
//            }
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String busca) {
                int indexDaBusca;
                String a = busca.toLowerCase();
                String buscaSemAcento = removerAcentos(a);

                for (int i = 0; i < nomeDasPlantas.toArray().length; i++) {
                    String x = nomeDasPlantas.get(i).toLowerCase();
                    String itemListaSemAcento = removerAcentos(x);
                    if (itemListaSemAcento.startsWith(buscaSemAcento)) {
                        indexDaBusca = i;
                        Toast.makeText(ListaDePlantas.this, "Encontrado!", Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(ListaDePlantas.this, BuscaResultado.class);
                        String strcontador = String.valueOf(indexDaBusca);
                        intent.putExtra("chave_contador", strcontador);
                        startActivity(intent);
                        break;

                    } else if (i == nomeDasPlantas.toArray().length - 1){
                        Toast.makeText(ListaDePlantas.this, "Nada Encontrado", Toast.LENGTH_LONG).show();
                    }

                }

//                if (nomeDasPlantas.stream().anyMatch(query::equalsIgnoreCase)) {
//                    //int x = nomeDasPlantas.get().toLowerCase().indexOf(query);
//                    String y = query.toLowerCase(); }

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });



    }


    public static String removerAcentos(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("-", " ");
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
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