package frasealeatoria.meusapps.tiboy.frasealeatoria20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResultadoActivity extends AppCompatActivity {
    private EditText mresultado;
    private Button mvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        mresultado = (EditText) findViewById(R.id.editText_resultado_resultado);
        mvoltar = (Button) findViewById(R.id.button_resultado_voltar);
        Intent intent = getIntent();
        String[] palavras1 = getIntent().getStringArrayExtra("palavras");
        mresultado.setText(String.valueOf(palavras1[0])+(String.valueOf(palavras1[1]))+(String.valueOf(palavras1[2]))+(String.valueOf(palavras1[3])));
        mvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
