package com.studio.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.mViewHolder.buttonBack = findViewById(R.id.botaoVoltarId);
        this.mViewHolder.imageCaraOuCoroa =findViewById(R.id.imageMoeda);

        this.mViewHolder.buttonBack.setOnClickListener(this);
        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String opcaoEscolhido = extra.getString("opcao");
            if (opcaoEscolhido.equals("cara")) {
               this.mViewHolder.imageCaraOuCoroa.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                this.mViewHolder.imageCaraOuCoroa.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private class ViewHolder{
        ImageButton buttonBack;
        ImageView imageCaraOuCoroa;
    }
}
