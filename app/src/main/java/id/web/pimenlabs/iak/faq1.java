package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class faq1 extends AppCompatActivity {
    String htmlString =
            "        \n" +
                    "    <div class=\"rich-content site-width site-width--padded \"><p style=\"text-align: justify;\"><strong>APA MISI DARI INDONESIA ANDROID KEJAR?</strong></p>\n" +
                    "<p style=\"text-align: justify;\">Indonesia Android Kejar adalah serangkaian kegiatan belajar bersama (study group) untuk mendukung developer Indonesia dalam mengembangkan aplikasi mobile melalui kursus online Udacity dan pertemuan offline. Kegiatan ini dijalankan oleh developer dan komunitasnya. Indonesia Android Kejar akan memfasilitasi pembahasan materi di level Beginner, Intermediate, dan Advance.</p>\n" +
                    "<p style=\"text-align: justify;\"><span>Misi Indonesia Android Kejar adalah membantu developers Indonesia untuk tumbuh dan terus menciptakan aplikasi berkualitas dan bermanfaat bukan hanya bagi Indonesia tapi juga bagi global. Program ini menyediakan pengalaman pembelajaran online melalui Udacity dan pembelajaran offline bersama anggota komunitas sehingga memberikan pemahaman yang lebih mendalam di ekosistem yang menyenangkan dan kolaboratif.</span></p>\n" +
                    "<p style=\"text-align: justify;\"><span>Indonesia Android Kejar adalah kesempatan kamu untuk terkoneksi dengan developer lainnya, menerima bimbingan dalam mempelajari Udacity Course, dan mendapatkan keuntungan lainnya.</span></p>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq1);
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
