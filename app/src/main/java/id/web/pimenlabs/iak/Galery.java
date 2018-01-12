package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Galery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Galery");
        toolbar.setSubtitle("Penggerak Ekosistem Developer Android Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    public boolean onSupportNavigateUp(){
        finish();
        onBackPressed();
        return true;
    }
}
