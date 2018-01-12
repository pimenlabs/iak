package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class faq6 extends AppCompatActivity {
    String htmlString =
            "\n" +
                    "<p style=\"text-align: justify;\"><strong>BAGAIMANA JIKA SAYA TELAH MEMILIKI UDACITY ACCOUNT DAN INGIN MENDAFTAR KE INDONESIA ANDROID KEJAR?</strong></p>\n" +
                    "<p style=\"text-align: justify;\"><span>Luar biasa! Kamu hanya perlu mendaftar sebagai fasilitator atau sebagai peserta. Kami akan memberi informasi lebih lanjut terkait apa yang harus kamu lakukan setelah mendaftar.</span></p>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq6);
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
