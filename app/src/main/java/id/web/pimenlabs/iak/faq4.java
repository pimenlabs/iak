package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class faq4 extends AppCompatActivity {
    String htmlString =
            "\n" +
                    "<p style=\"text-align: justify;\"><strong>BAGAIMANA SAYA MENDAFTAR DALAM PROGRAM INI?</strong></p>\n" +
                    "<p style=\"text-align: justify;\"><span>Bagi kamu yang ingin mendaftar menjadi fasilitator, silahkan klik </span><a href=\"https://events.withgoogle.com/indonesia-android-kejar/daftar/\"><span>link</span></a><span> berikut. Bagi kamu yang ingin mendaftar sebagai peserta, silakan klik </span><a href=\"https://events.withgoogle.com/indonesia-android-kejar/daftar/\"><span>link</span></a><span> berikut.</span></p>\n" +
                    "<p style=\"text-align: justify;\"><span>Kamu akan diarahkan untuk mendaftar di Udacity Course sesuai level yang telah kamu pilih untuk dapat mengakses course materials secara online.</span></p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq4);
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
