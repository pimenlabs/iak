package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class faq2 extends AppCompatActivity {
    String htmlString =
            "\n" +
                    "<p style=\"text-align: justify;\"><strong>APA SAJA PERSYARATAN UNTUK MENGIKUTI INDONESIA ANDROID KEJAR?</strong></p>\n" +
                    "<p style=\"text-align: justify;\">Semua orang dapat mendaftar ke program Indonesia Android Kejar. Tapi, pastikan kamu mendaftar sesuai level dengan memastikan prasyarat kursus di setiap level dalam Udacity. Sebagai informasi, kini kursus level beginner Udacity tersedia dalam bahasa Indonesia, yaitu <a href=\"http://udacity.com/indonesia\">udacity.com/indonesia </a></p>\n" +
                    "<ul style=\"text-align: justify;\">\n" +
                    "<li dir=\"ltr\"><span>Peserta yang belum memiliki pengalaman tapi ingin mulai mempelajari programming dapat mendaftar di level beginner. Cek lebih lanjut </span><a href=\"https://www.udacity.com/course/android-development-for-beginners--ud837\"><span>di sini. </span></a></li>\n" +
                    "<li dir=\"ltr\"><span>Peserta yang sudah memiliki pengalaman programming yang lebih tinggi dapat mendaftar di level intermediate atau advance. Cek lebih lanjut di sini:</span></li>\n" +
                    "<ul>\n" +
                    "<li dir=\"ltr\"><a href=\"https://www.udacity.com/course/developing-android-apps--ud853\"><span>Intermediate</span></a></li>\n" +
                    "<li dir=\"ltr\"><a href=\"https://www.udacity.com/courses/ud855\"><span>Advance</span></a></li>\n" +
                    "</ul>\n" +
                    "</ul>\n" +
                    "<p style=\"text-align: justify;\"><span>Dalam rangka membantu pembelajaran ini, peserta diharapkan untuk mengunduh </span><a href=\"http://developer.android.com/sdk/installing/studio.html\"><span>Android Studio</span></a><span>. Akses ke perangkat Android akan sangat membantu walaupun tidak diwajibkan dalam penyelesaian final project. Silakan lihat </span><a href=\"https://www.udacity.com/tech-requirements\"><span>Technology Requirements</span></a><span> untuk menggunakan Udacity.</span></p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq2);
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
