package com.example.minhasplantinhas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetalhesMinhasPlantas extends AppCompatActivity {

    private TextView campoNome, campoEspecie, campoAgua, campoLuz, campoAmbiente, campoResumo, campoIluminacao, campoRega, campoPoda, campoFertilizante, campoCuidadosExtras;
    private ImageView imagemPlanta, imagemLuz;
    private Button btnRemover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_minha_planta);
        //----------------------------------------------------------
        //Página que mostra os detalhes de uma planta específica
        //----------------------------------------------------------
        //Dados extras recebidos
        String contador = getIntent().getStringExtra("chave_contador");
        //Contador
        int chaveContador = Integer.parseInt(contador);
        //----------------------------------------------------------
        //Dados da memória
        Memoria memoria = new Memoria();
        //para buscar a ordem correta da lista "MinhasPlantas"
        MinhasPlantas mm = new MinhasPlantas();

        ArrayList<String> listaNomePlantas = memoria.getNomeDasPlantas();
        ArrayList<String> listaEspecies = memoria.getEspeciesDasPlantas();
        ArrayList<String> listatxtAgua = memoria.getTxtAgua();
        ArrayList<String> listatxtLuz = memoria.getTxtLuz();
        ArrayList<String> listatxtAmbiente = memoria.getTxtAmbiente();
        ArrayList<Integer> listaImagemPlanta = memoria.getImagemPlanta();
        ArrayList<Integer> listaImagemLuz = memoria.getImagemLuz();
        //ArrayList do conteúdo
        ArrayList<String> listaResumo = memoria.getListaResumo();
        ArrayList<String> listaIluminacao = memoria.getListaIluminacao();
        ArrayList<String> listaRega = memoria.getListaRega();
        ArrayList<String> listaPoda = memoria.getListaPoda();
        ArrayList<String> listaFertilizantes = memoria.getListaFertilizantes();
        ArrayList<String> listaCuidadosExtras = memoria.getListaCuidadosExtras();
        //----------------------------------------------------------

        //----------------------------------------------------------
        //Campos da Página
        campoNome = findViewById(R.id.textView);
        campoEspecie = findViewById(R.id.textView2);
        campoAgua = findViewById(R.id.txt_agua2);
        campoLuz = findViewById(R.id.txt_luz2);
        campoAmbiente = findViewById(R.id.txt_ambiente2);
        campoResumo = findViewById(R.id.textView3);
        campoIluminacao = findViewById(R.id.textView5);
        campoRega = findViewById(R.id.textView7);
        campoPoda = findViewById(R.id.textView9);
        campoFertilizante = findViewById(R.id.textView11);
        campoCuidadosExtras = findViewById(R.id.textView13);

        imagemPlanta = findViewById(R.id.imageView2);
        imagemLuz = findViewById(R.id.imagem_luz2);
        //----------------------------------------------------------
        //Atribuir valores a variáveis

        int chave = mm.plantasAdicionadas2.get(chaveContador);

        String nome = listaNomePlantas.get(chave);
        String especie = listaEspecies.get(chave);
        String txtAgua = listatxtAgua.get(chave);
        String txtLuz = listatxtLuz.get(chave);
        String txtAmbiente = listatxtAmbiente.get(chave);
        String resumo = listaResumo.get(chave);
        String iluminacao = listaIluminacao.get(chave);
        String rega = listaRega.get(chave);
        String poda = listaPoda.get(chave);
        String fertilizante = listaFertilizantes.get(chave);
        String cuidadosExtras = listaCuidadosExtras.get(chave);

        Integer imgLuz = listaImagemLuz.get(chave);
        Integer imgPlanta = listaImagemPlanta.get(chave);

        //----------------------------------------------------------
        //Adicionar a Página
        campoNome.setText(nome);
        campoEspecie.setText(especie);
        campoAgua.setText(txtAgua);
        campoLuz.setText(txtLuz);
        campoAmbiente.setText(txtAmbiente);
        campoResumo.setText(resumo);
        campoIluminacao.setText(iluminacao);
        campoRega.setText(rega);
        campoPoda.setText(poda);
        campoFertilizante.setText(fertilizante);
        campoCuidadosExtras.setText(cuidadosExtras);

        imagemLuz.setImageResource(imgLuz);
        imagemPlanta.setImageResource(imgPlanta);

//        btnRemover = findViewById(R.id.btn_remover);
//        btnRemover.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(DetalhesMinhasPlantas.this, MinhasPlantas.class);
//
//                MinhasPlantas minhasplantas = new MinhasPlantas();
//                intent.putExtra("chave_contador", contador);
//                finishAffinity();
//                startActivity(intent);
//            }
//        });
//
//    }
    }
}