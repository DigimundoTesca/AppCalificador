package com.example.rich.calificador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button merida = (Button)findViewById(R.id.button);
        Button aguascalientes = (Button)findViewById(R.id.button2);

        merida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initiateMerida();
            }
        });

        aguascalientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initiateAguascalientes();
            }
        });

    }

    void initiateAguascalientes(){
        Intent intent = new Intent(this,Aguascalientes.class);
        startActivity(intent);
    }

    public void initiateMerida(){
        Intent intent = new Intent(this,Merida.class);
        startActivity(intent);
    }
}
