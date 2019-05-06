package com.example.aluno.contadortruco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText campo1;
    private EditText campo2;
    private TextView resultadot1;
    private TextView resultadot2;
    private TextView vitt1;
    private TextView vitt2;
    private Button trest1;
    private Button seist1;
    private Button novet1;
    private Button wint1;
    private Button trest2;
    private Button seist2;
    private Button novet2;
    private Button wint2;
    private int resultado;
    private int resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = (EditText) findViewById(R.id.editText2);
        campo2 = (EditText) findViewById(R.id.editText);
        resultadot1 = (TextView) findViewById(R.id.textView5);
        resultadot2 = (TextView) findViewById(R.id.textView3);
        vitt1 = (TextView) findViewById(R.id.textView7);
        vitt2 = (TextView) findViewById(R.id.textView8);
        trest1 = (Button) findViewById(R.id.button);
        seist1 = (Button) findViewById(R.id.button2);
        novet1 = (Button) findViewById(R.id.button3);

        trest2 = (Button) findViewById(R.id.button4);
        seist2 = (Button) findViewById(R.id.button5);
        novet2 = (Button) findViewById(R.id.button6);

        wint1 = (Button) findViewById(R.id.button8);
        wint2 = (Button) findViewById(R.id.button7);


        Double result2 = Double.parseDouble(resultadot2.getText().toString());
        //if (result <= 12 && result2 <= 12) {

        //Time 1
            trest1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double result = Double.parseDouble(resultadot1.getText().toString());
                    if ((result +3) < 12) {
                        try {
                            result = result + 3;
                            resultadot1.setText("" + result);

                        } catch (Exception E) {
                            Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "TIme: "+campo1.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                        resultado ++;
                        vitt1.setText("Vitorias:"+resultado);
                        resultadot1.setText(""+0);
                        resultadot2.setText(""+0);
                    }
                }
            });
        seist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(resultadot1.getText().toString());
                if ((result +6) < 12) {
                    try {
                        result = result + 6;
                        resultadot1.setText("" + result);

                    } catch (Exception E) {
                        Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "TIme: "+campo1.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                    resultado ++;
                    vitt1.setText("Vitorias:"+resultado);
                    resultadot1.setText(""+0);
                    resultadot2.setText(""+0);
                }
            }
        });

        //Time 2
        novet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(resultadot1.getText().toString());
                if ((result +9) < 12) {
                    try {
                        result = result + 9;
                        resultadot1.setText("" + result);

                    } catch (Exception E) {
                        Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "TIme: "+campo1.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                    resultado2 ++;
                    vitt1.setText("Vitorias:"+resultado2);
                    resultadot1.setText(""+0);
                    resultadot2.setText(""+0);
                }
            }
        });

        trest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(resultadot2.getText().toString());
                if ((result +3) < 12) {
                    try {
                        result = result + 3;
                        resultadot2.setText("" + result);

                    } catch (Exception E) {
                        Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "TIme: "+campo2.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                    resultado2 ++;
                    vitt2.setText("Vitorias:"+resultado2);
                    resultadot2.setText(""+0);
                    resultadot1.setText(""+0);
                }
            }
        });
        seist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(resultadot2.getText().toString());
                if ((result +6) < 12) {
                    try {
                        result = result + 6;
                        resultadot2.setText("" + result);

                    } catch (Exception E) {
                        Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "TIme: "+campo2.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                    resultado2 ++;
                    vitt2.setText("Vitorias:"+resultado2);
                    resultadot2.setText(""+0);
                    resultadot1.setText(""+0);
                }
            }
        });
        novet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(resultadot2.getText().toString());
                if ((result +9) < 12) {
                    try {
                        result = result + 9;
                        resultadot2.setText("" + result);

                    } catch (Exception E) {
                        Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "TIme: "+campo2.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                    resultado2 ++;
                    vitt2.setText("Vitorias:"+resultado2);
                    resultadot2.setText(""+0);
                    resultadot1.setText(""+0);
                }
            }
        });

        //wins
        wint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {
                        Toast.makeText(MainActivity.this, "TIme: "+campo1.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                        resultado ++;
                        vitt1.setText("Vitorias:"+resultado);
                        resultadot1.setText(""+0);
                        resultadot2.setText(""+0);

                    } catch (Exception E) {
                        Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                    }


            }
        });
        wint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity.this, "TIme: "+campo2.getText().toString()+" Ganhou!!!!", Toast.LENGTH_SHORT).show();
                    resultado2 ++;
                    vitt2.setText("Vitorias:"+resultado2);
                    resultadot2.setText(""+0);
                    resultadot1.setText(""+0);

                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}
