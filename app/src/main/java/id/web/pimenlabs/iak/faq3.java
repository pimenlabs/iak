package id.web.pimenlabs.iak;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class faq3 extends AppCompatActivity {
    String htmlString =
            "<p style=\"text-align: justify;\"><strong>BERAPA LAMA WAKTU YANG SAYA BUTUHKAN UNTUK PROGRAM INI?</strong></p>\n" +
                    "<p style=\"text-align: justify;\"><span>Untuk menyelesaikan kursus online membutuhkan waktu selama kurang lebih 30 jam. Indonesia Android Kejar dapat diadakan dalam sesi mingguan atau dalam format akhir pekan. Kamu akan mendapatkan penjelasan lebih lanjut terkait alokasi waktu pembelajaran online dan offline setelah mendaftar.</span></p>\n" +
                    "<p style=\"text-align: justify;\"><span>Kami mendorong peserta untuk dapat datang di semua sesi agar dapat mendapatkan pengalaman terbaik dari program ini. Jumlah kedatangan minimum di setiap sesi akan dibutuhkan untuk dapat menerima sertifikat. Alasan ketidakhadiran karena keadaan darurat akan dipertimbangkan.</span></p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq3);
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
