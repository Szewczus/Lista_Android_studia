package com.example.tabela_szczegoly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AktywnoscOpis extends AppCompatActivity {

    TextView nazwa, opis;
    ImageView obraz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aktywnosc_opis);

        nazwa=(TextView)findViewById(R.id.nazwa);
        opis=(TextView)findViewById(R.id.opis);
        obraz=(ImageView)findViewById(R.id.obraz);

        int id=(int) getIntent().getLongExtra("id",0);

        nazwa.setText(MojaAplikacja.NAME[id]);
        opis.setText(MojaAplikacja.DESCRIPTION[id]);
        obraz.setImageResource(MojaAplikacja.IMAGE.getResourceId(id,0));
    }
}
