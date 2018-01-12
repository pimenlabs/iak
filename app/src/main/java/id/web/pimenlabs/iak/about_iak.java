package id.web.pimenlabs.iak;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;
import android.widget.Toast;

public class about_iak extends AppCompatActivity {
    String htmlString =
            "\n" +
                    "\n" +
                    "<div class=\"rich-content site-width site-width--padded \"><p><span style=\"font-weight: 400;\">Android telah digunakan di lebih dari 190 negara di dunia. Setiap harinya, ada lebih dari 1 juta perangkat Android baru yang diaktifkan di seluruh dunia. Ada lebih dari 1.5 milyar download per bulan di Google Play dan angka ini terus bertambah.*</span><span style=\"font-weight: 400;\"><br/></span><span style=\"font-weight: 400;\"><br/></span><span style=\"font-weight: 400;\">132.7 juta pengguna internet di Indonesia.** Kita adalah market yang besar. Tetapi, apa kita bisa jadi player yang besar? Bisa! Dengan kolaborasi. Kami percaya, kolaborasi adalah kunci untuk membuat developer Indonesia berdaya. </span><span style=\"font-weight: 400;\"><br/></span><span style=\"font-weight: 400;\"><br/></span><span style=\"font-weight: 400;\">Gerakan ini akan menjadi lebih besar. Semua ingin berbagi dan menjadi developer yang lebih baik. Untuk itu, kita harus mengambil kesempatan ini untuk berkarya, menciptakan aplikasi android yang berdampak positif.</span></p>\n" +
                    "<p><span style=\"font-weight: 400;\">Indonesia Android Kejar adalah program yang diinisiasi oleh Google Developers untuk mendukung developer Indonesia dalam mengembangkan aplikasi mobile melalui pembelajaran online di Udacity dan pertemuan offline (study group) dengan komunitas lokal.</span></p>\n" +
                    "<p><span style=\"font-weight: 400;\"> </span></p>\n" +
                    "<p><span style=\"font-weight: 400;\">*Sumber: </span><a href=\"https://developer.android.com/about/index.html\"><span style=\"font-weight: 400;\">https://developer.android.com/about/index.html</span></a></p>\n" +
                    "<p><span style=\"font-weight: 400;\">**Sumber: Survei Internet APJII 2016</span></p></div>\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_iak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("About IAK");
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
