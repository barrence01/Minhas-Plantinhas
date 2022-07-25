package com.example.minhasplantinhas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//https://www.youtube.com/watch?v=ZTg-oXaCgBk
public class BuscaResultadoAdaptador extends RecyclerView.Adapter<BuscaResultadoAdaptador.ViewHolder> {


    TodasAsPlantas[] todasAsPlantas; // Cria um Array
    Context context;


    //Faz um array do TodasAsPlantas e coloca no contexto ListaDePlantas
    public BuscaResultadoAdaptador(TodasAsPlantas[] todasAsPlantas, BuscaResultado activity) {
        this.todasAsPlantas = todasAsPlantas;
        this.context = activity;

    }

    //Adiciona o cardview no contexto
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lista_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TodasAsPlantas listaTodasAsPlantas = todasAsPlantas[position];

        holder.txtNomePlanta.setText(listaTodasAsPlantas.getNomePlanta());
        holder.txtEspeciePlanta.setText(listaTodasAsPlantas.getEspeciePlanta());
        holder.txtAgua.setText(listaTodasAsPlantas.getTxtAgua());
        holder.txtLuz.setText(listaTodasAsPlantas.getTxtLuz());
        holder.txtAmbiente.setText(listaTodasAsPlantas.getTxtAmbiente());
        holder.imgPlanta.setImageResource(listaTodasAsPlantas.getImgPlanta());
        //holder.imgAgua.setImageResource(listaTodasAsPlantas.getImgAgua());
        holder.imgLuz.setImageResource(listaTodasAsPlantas.getImgLuz());
//        holder.imgAmbiente.setImageResource(listaTodasAsPlantas.getImgAmbiente());




        //Ao clicar no item da lista
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //A Intenção captura o contexto do fragmento e o envia para a próxima página
                Intent intent = new Intent(v.getContext(), DetalhesPlanta.class);
                //String strcontador = String.valueOf(holder.getAdapterPosition());
                //intent.putExtra("chave_contador", strcontador);
                String strcontador = String.valueOf(BuscaResultado.plantasAdicionadas.get(0));
                intent.putExtra("chave_contador", strcontador);

                context.startActivity(intent);
                //Toast.makeText(context, listaTodasAsPlantas.getNomePlanta(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return todasAsPlantas.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Criando Variaveis
        ImageView imgPlanta;
        //ImageView imgAgua;
        ImageView imgLuz;
        //ImageView imgAmbiente;
        TextView txtNomePlanta;
        TextView txtEspeciePlanta;
        TextView txtAgua;
        TextView txtLuz;
        TextView txtAmbiente;

        public ViewHolder(@NonNull View itemView) {
            // Atribuindo os IDs para as variaveis do cardview
            super(itemView);
            imgPlanta = itemView.findViewById(R.id.imagem_planta);
            //imgAgua = itemView.findViewById(R.id.imagem_agua);
            imgLuz = itemView.findViewById(R.id.imagem_luz);
            //imgAmbiente = itemView.findViewById(R.id.imagem_ambiente);
            txtNomePlanta = itemView.findViewById(R.id.nome_planta);
            txtEspeciePlanta = itemView.findViewById(R.id.especie_planta);
            txtAgua = itemView.findViewById(R.id.txt_agua);
            txtLuz = itemView.findViewById(R.id.txt_luz);
            txtAmbiente = itemView.findViewById(R.id.txt_ambiente);

        }
    }

}
