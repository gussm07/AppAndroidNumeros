package edu.ieu.appandroidnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Obtener una referencia al objeto de botón llamado roll_button del archivo de diseño
        Button rollButton = findViewById(R.id.roll_button);
        Button rollButton2 = findViewById(R.id.roll_button2);

        // Modifica la propiedad de texto rollButton del botón en el código
        //rollButton.setText("Let's Roll");

        // Establecer el oyente de clics para el botón rollButton, una vez que el usuario hace clic en el botón, se activa el método onClick del oyente
        rollButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                // Genera números aleatorios
                Random rand = new Random();
                int randNumber = rand.nextInt(6)+1;
                int randNumber2 = rand.nextInt(6)+1;

                // Obtiene una referencia a la vista de texto llamada result_text del archivo de diseño
                TextView resultText = (TextView)findViewById(R.id.result_text);
                TextView resultText2 = (TextView)findViewById(R.id.result_text2);

                // Establezca el número aleatorio obtenido en la propiedad text de resultText, preste atención para convertir el número aleatorio en una cadena
                resultText.setText(String.valueOf(randNumber));
                resultText2.setText(String.valueOf(randNumber2));
            }
        });





        rollButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView textResultado = findViewById(R.id.textViewResultado);

                TextView numero1 = findViewById(R.id.result_text);
                TextView numero2 = findViewById(R.id.result_text2);

                EditText resultadoSuma = findViewById(R.id.etResultado);

                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                String r = resultadoSuma.getText().toString();

                int valor1 = Integer.parseInt(n1);
                int valor2 = Integer.parseInt(n2);
                int rf = Integer.parseInt((r));

                int resultado = valor1 + valor2;

                Context context = getApplicationContext();
                CharSequence texto = "EXCELENTE !";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, texto, duration);




                Context context2 = getApplicationContext();
                CharSequence texto2 = "Intentalo de nuevo!";
                int duration2 = Toast.LENGTH_SHORT;

                Toast toast2 = Toast.makeText(context2, texto2, duration2);



                if( resultado == rf ){
                    toast.show();
                    textResultado.setTextColor(Color.GREEN);
                    textResultado.setText("CORRECTO, ERES MUY BUENO!");

                }
                else {
                    toast2.show();
                    textResultado.setTextColor(Color.RED);
                    textResultado.setText("LO SIENTO MI HERMANO, ESTAS MAL");
                }


            }
        });


    }


}