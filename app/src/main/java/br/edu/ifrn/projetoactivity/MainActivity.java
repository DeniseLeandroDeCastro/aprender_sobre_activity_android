package br.edu.ifrn.projetoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar    = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                //Instanciar o objeto
                Usuario usuario = new Usuario("Denise Maria", "denisemaria@email.com");

                //Passar dados
                intent.putExtra("nome", "Denise");
                intent.putExtra("idade", 52);
                intent.putExtra("objeto", usuario);
                startActivity(intent);

            }
        });
    }
}