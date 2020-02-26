package com.studio.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();
    private String[] opcao = {"cara","coroa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonPlay = findViewById(R.id.botaoJogarId);
        this.mViewHolder.buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random randomic = new Random();
        int numeroAleatorio = randomic.nextInt(2);

        Intent intent = new Intent (this, Main2Activity.class);
        intent.putExtra("opcao", opcao[numeroAleatorio]);
        startActivity(intent);
    }

    private class ViewHolder {
        ImageButton buttonPlay;


    }
}
