package com.example.minhasplantinhas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetalhesPlanta extends AppCompatActivity {

    private TextView campoNome, campoEspecie, campoAgua, campoLuz, campoAmbiente, campoResumo, campoIluminacao, campoRega, campoPoda, campoFertilizante, campoCuidadosExtras;
    private ImageView imagemPlanta, imagemLuz;
    private Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_planta);
        //----------------------------------------------------------
        //Página que mostra os detalhes de uma planta específica
        //----------------------------------------------------------
        //Dados extras recebidos
        String contador = getIntent().getStringExtra("chave_contador");


        //Contador
        int chaveContador = Integer.parseInt(contador);

        //----------------------------------------------------------
        //Dados da memória
        ArrayList<String> listaNomePlantas = Memoria.nomeDasPlantas;
        ArrayList<String> listaEspecies = Memoria.especiesDasPlantas;
        ArrayList<String> listatxtAgua = Memoria.txtAgua;
        ArrayList<String> listatxtLuz = Memoria.txtLuz;
        ArrayList<String> listatxtAmbiente = Memoria.txtAmbiente;
        ArrayList<Integer> listaImagemPlanta = Memoria.imagemPlanta;
        ArrayList<Integer> listaImagemLuz = Memoria.imagemLuz;
        //ArrayList do conteúdo
        ArrayList<String> listaResumo = Memoria.listaResumo;
        ArrayList<String> listaIluminacao = Memoria.listaIluminacao;
        ArrayList<String> listaRega = Memoria.listaRega;
        ArrayList<String> listaPoda = Memoria.listaPoda;
        ArrayList<String> listaFertilizantes = Memoria.listaFertilizantes;
        ArrayList<String> listaCuidadosExtras = Memoria.listaCuidadosExtras;
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
        String nome = listaNomePlantas.get(chaveContador);
        String especie = listaEspecies.get(chaveContador);
        String txtAgua = listatxtAgua.get(chaveContador);
        String txtLuz = listatxtLuz.get(chaveContador);
        String txtAmbiente = listatxtAmbiente.get(chaveContador);
        String resumo = listaResumo.get(chaveContador);
        String iluminacao = listaIluminacao.get(chaveContador);
        String rega = listaRega.get(chaveContador);
        String poda = listaPoda.get(chaveContador);
        String fertilizante = listaFertilizantes.get(chaveContador);
        String cuidadosExtras = listaCuidadosExtras.get(chaveContador);

        Integer imgLuz = listaImagemLuz.get(chaveContador);
        Integer imgPlanta = listaImagemPlanta.get(chaveContador);

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


        btnAdicionar = findViewById(R.id.btn_adicionar);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetalhesPlanta.this, MinhasPlantas.class);

                intent.putExtra("chave_contador", contador);
                finishAffinity();
                startActivity(intent);
            }
        });

    }
}