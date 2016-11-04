package frasealeatoria.meusapps.tiboy.frasealeatoria20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {
    private EditText mresultado;
    private Button mvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        mresultado = (EditText) findViewById(R.id.editText_resultado_resultado);
        mvoltar = (Button) findViewById(R.id.button_resultado_voltar);

        String[] palavras = getIntent().getStringArrayExtra("palavras");

        mresultado.setText(embaralha(palavras));
        mvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private String embaralha(String[] palavras) {
        int tamanho = palavras.length;

        Random random = new Random(System.currentTimeMillis());

        StringBuffer frase = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            frase
                .append(palavras[random.nextInt(tamanho)])
                .append(" ");
        }

        return frase.toString().trim();
    }
}
