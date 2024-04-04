package com.example.tugas6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailNegaraActivity extends AppCompatActivity {

    private TextView textViewNamaNegara, textViewDeskripsiNegara, textViewRatingNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_negara);

        // Menerima data dari intent
        String namaNegara = getIntent().getStringExtra("nama_negara");
        String deskripsiNegara = getIntent().getStringExtra("deskripsi_negara");
        String ratingNegara = getIntent().getStringExtra("rating_negara");

        // Inisialisasi TextView
        textViewNamaNegara = findViewById(R.id.textViewNamaNegara);
        textViewDeskripsiNegara = findViewById(R.id.textViewDeskripsiNegara);
        textViewRatingNegara = findViewById(R.id.textViewRatingNegara);

        // Menampilkan data ke TextView
        textViewNamaNegara.setText(namaNegara);
        textViewDeskripsiNegara.setText(deskripsiNegara);
        textViewRatingNegara.setText(ratingNegara);

        // Inisialisasi Button untuk tombol share
        Button buttonShare = findViewById(R.id.buttonShare);

        // Memberikan OnClickListener ke Button untuk tombol share
        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareButtonClicked();
            }
        });
    }

    // Metode untuk menangani klik tombol share
    private void shareButtonClicked() {
        String namaNegara = textViewNamaNegara.getText().toString();
        String deskripsiNegara = textViewDeskripsiNegara.getText().toString();
        String ratingNegara = textViewRatingNegara.getText().toString();

        // Membuat teks yang akan dibagikan
        String shareText = "Negara: " + namaNegara + "\nDeskripsi: " + deskripsiNegara + "\nRating: " + ratingNegara;

        // Membuat intent untuk berbagi teks
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

        // Memulai aktivitas untuk berbagi teks
        startActivity(Intent.createChooser(shareIntent, "Bagikan Negara"));
    }
}
