package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class faq7 extends AppCompatActivity {
    String htmlString =
            "\n" +
                    "<p><strong>JIKA SAYA SUDAH PERNAH MENGIKUTI INDONESIA ANDROID KEJAR SEBELUMNYA, APAKAH SAYA MASIH BOLEH IKUT?</strong></p>\n" +
                    "<p>Tentu saja boleh. Kamu bisa mendaftar sebagai fasilitator pada level yang kamu kuasai (Beginner/Intermediate/Advanced) atau menjadi peserta di level yang lebih tinggi (Intermediate/Advanced)</p>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq7);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("FAQ IAK");
        toolbar.setSubtitle("Penggerak Ekosistem Developer Android Indonesia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView textView = (TextView) findViewById(R.id.display_html_string);
        textView.setText(Html.fromHtml(htmlString));
    }

    public boolean onSupportNavigateUp(){
        finish();
        onBackPressed();
        return true;
    }

}
