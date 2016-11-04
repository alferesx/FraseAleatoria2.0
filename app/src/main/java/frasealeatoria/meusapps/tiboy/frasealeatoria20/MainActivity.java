package frasealeatoria.meusapps.tiboy.frasealeatoria20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Criar os componentes visuais
    private EditText mpalavra1;
    private EditText mpalavra2;
    private EditText mpalavra3;
    private EditText mpalavra4;
    private String[] palavras= new String[4];
    private Button mGerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciar os componentes visuais
        mpalavra1 = (EditText) findViewById(R.id.editText_main_palavra1);
        mpalavra2 = (EditText) findViewById(R.id.editText_main_palavra2);
        mpalavra3 = (EditText) findViewById(R.id.editText_main_palavra3);
        mpalavra4 = (EditText) findViewById(R.id.editText_main_palavra4);
        mGerar = (Button) findViewById(R.id.button_main_gerar);


        mGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                palavras[0]=mpalavra1.getText().toString();
                palavras[1]=mpalavra2.getText().toString();
                palavras[2]=mpalavra3.getText().toString();
                palavras[3]=mpalavra4.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("palavras", palavras);
                startActivity(intent);
            }
        });

    }
}
