package com.example.minhasplantinhas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private Button btncomecar;
    private EditText email, senha; /*Tipo <EditText> no xml*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        email = findViewById(R.id.editTextTextEmailAddress);
        senha = findViewById(R.id.editTextTextPassword);


        btncomecar = findViewById(R.id.button);

        btncomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String variavelEmail = email.getText().toString(); /*Transforma o EditText em String*/
                String variavelSenha = senha.getText().toString();

                ArrayList<String> listaContas = new ArrayList<String>(Arrays.asList("conta1@ibm.com", "conta2@ibm.com", "conta3@ibm.com"));
                ArrayList<String> senhas = new ArrayList<String>(Arrays.asList("111", "222", "333"));

                for(int contador = 0; contador < listaContas.size(); contador++) {

                    if (variavelEmail.equals(listaContas.get(contador))) {
                        if (variavelSenha.equals(senhas.get(contador))) {
                            Intent intent = new Intent(MainActivity.this, MinhasPlantas.class);
                            intent.putExtra("chave_email", variavelEmail); /*Envia junto com a intent as informações dos objetos*/
                            startActivity(intent);
                            break;
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    "Senha inválida!",
                                    Toast.LENGTH_LONG).show();
                            break;
                        }
                    } else if (contador == listaContas.size() - 1) {
                        Toast.makeText(getApplicationContext(),
                                "Email inválido!",
                                Toast.LENGTH_LONG).show();
                        break;
                    }
                }
            }
        });
    }
}