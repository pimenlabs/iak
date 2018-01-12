package id.web.pimenlabs.iak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class faq extends AppCompatActivity {
    public CardView cardView,cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("FAQ IAK");
        toolbar.setSubtitle("Penggerak Ekosistem Developer Android Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView = (CardView) findViewById(R.id.cv);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq1.class);
                startActivity(intent);
            }
        });

        cardView = (CardView) findViewById(R.id.cv);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq1.class);
                startActivity(intent);
            }
        });

        cardView1 = (CardView) findViewById(R.id.cv1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq2.class);
                startActivity(intent);
            }
        });

        cardView2 = (CardView) findViewById(R.id.cv2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq3.class);
                startActivity(intent);
            }
        });

        cardView3 = (CardView) findViewById(R.id.cv3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq4.class);
                startActivity(intent);
            }
        });

        cardView4 = (CardView) findViewById(R.id.cv4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq5.class);
                startActivity(intent);
            }
        });

        cardView5 = (CardView) findViewById(R.id.cv5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq6.class);
                startActivity(intent);
            }
        });

        cardView6 = (CardView) findViewById(R.id.cv6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), faq7.class);
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
