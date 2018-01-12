package id.web.pimenlabs.iak;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Tetang extends AppCompatActivity {
    String hp = "085299911570";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tetang);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tentang Saya ");
        toolbar.setSubtitle("Detail Pembuat Aplikasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", hp, null));
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
