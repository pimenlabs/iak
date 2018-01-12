package id.web.pimenlabs.iak;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
@SuppressLint("NewApi")
public class MainActivity extends AppCompatActivity {
    Button btn_daftar, btn_daftar_peserta, btn_daftar_fasilitator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Indonsia Android Kejar");
        toolbar.setSubtitle("Penggerak Ekosistem Developer Android Indonesia");

        btn_daftar = (Button) findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Daftar.class);
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

        btn_daftar_fasilitator = (Button) findViewById(R.id.btn_daftar_fasilitator);
        btn_daftar_fasilitator.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), daftar_fasilitator.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_program:
                Intent intent = new Intent(getApplicationContext(), program.class);
                startActivity(intent);
                return true;
            case R.id.action_galery:
                Intent intent2 = new Intent(getApplicationContext(), Galery.class);
                startActivity(intent2);
                return true;
            case R.id.action_about_iak:
                Intent intent3 = new Intent(getApplicationContext(), about_iak.class);
                startActivity(intent3);
                return true;
            case R.id.action_faq:
                Intent intent4 = new Intent(getApplicationContext(), faq.class);
                startActivity(intent4);
                return true;
            case R.id.action_addItem:
                Intent intent5 = new Intent(getApplicationContext(), Tetang.class);
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public boolean onSupportNavigateUp(){
        finish();
        onBackPressed();
        return true;
    }
}
