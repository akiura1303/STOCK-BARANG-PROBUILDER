package com.stokbarang.app;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.stokbarang.app.activity.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.card_transaksi).setOnClickListener(v -> startActivity(new Intent(this, TransaksiActivity.class)));
        findViewById(R.id.card_master_data).setOnClickListener(v -> startActivity(new Intent(this, MasterDataActivity.class)));
        findViewById(R.id.card_laporan).setOnClickListener(v -> startActivity(new Intent(this, LaporanStokActivity.class)));
        findViewById(R.id.card_pengaturan).setOnClickListener(v -> startActivity(new Intent(this, PengaturanActivity.class)));
    }
}