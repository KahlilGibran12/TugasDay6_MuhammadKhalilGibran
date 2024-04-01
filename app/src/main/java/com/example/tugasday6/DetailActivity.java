package com.example.tugasday6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tugasday6.NamaItem;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Mendapatkan data dari Intent
        int itemId = getIntent().getIntExtra("itemId", 0);
        NamaItem item = getItemById(itemId);

        // Menampilkan detail item
        TextView tvName = findViewById(R.id.tvDetailName);
        TextView tvDeskripsi = findViewById(R.id.tvDetailDeskripsi);
        TextView tvHarga = findViewById(R.id.tvDetailHarga);
        ImageView ivFotoItem = findViewById(R.id.ivDetailFotoItem);
        Button btnShare = findViewById(R.id.btnShare);

        if (item != null) {
            tvName.setText(item.getName());
            tvDeskripsi.setText(item.getDeskripsi());
            tvHarga.setText(item.getHarga());
            ivFotoItem.setImageResource(item.getFotoItem());

            // Mengatur onClickListener untuk tombol share
            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareItem(item, ivFotoItem);
                }
            });
        }
    }

    // Metode untuk mendapatkan item berdasarkan ID
    private NamaItem getItemById(int itemId) {
        for (NamaItem item : MainActivity.namaItem) {
            if (item.getId() == itemId) {
                return item;
            }
        }
        return null; // Kembalikan null jika tidak menemukan item
    }

    // Metode untuk berbagi item
    private void shareItem(NamaItem item, ImageView imageView) {
        String shareText = "Nama: " + item.getName() +
                "\nDeskripsi: " + item.getDeskripsi() +
                "\nHarga: " + item.getHarga();

        // Simpan gambar ke penyimpanan sementara
        BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        String imagePath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Item Image", null);
        Uri imageUri = Uri.parse(imagePath);

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
        sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri); // Sisipkan URI gambar
        sendIntent.setType("image/jpeg");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

