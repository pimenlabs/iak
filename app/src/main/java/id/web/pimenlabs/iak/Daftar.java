package id.web.pimenlabs.iak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Daftar extends AppCompatActivity {
    Button btn_daftar_fasilitator, btn_daftar_peserta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Daftar");
        toolbar.setSubtitle("Penggerak Ekosistem Developer Android Indonesia");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        btn_daftar_fasilitator = (Button) findViewById(R.id.btn_daftar_fasilitator);
        btn_daftar_fasilitator.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), daftar_fasilitator.class);
                startActivity(intent);
            }
        });


        btn_daftar_peserta = (Button) findViewById(R.id.btn_daftar_peserta);
        btn_daftar_peserta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), daftar_peserta.class);
                startActivity(intent);
            }
        });
    }

    public boolean onSupportNavigateUp(){
        finish();
        onBackPressed();
        return true;
    }
}
