package com.example.whawha.tugas_1_mobpro.tugas_1_mobpro;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity3 extends AppCompatActivity {

    @BindView(R.id.namaitem)
    TextView namaitem;
    @BindView(R.id.totalitem)
    TextView totalitem;
    @BindView(R.id.hargatotalperitem)
    TextView hargatotalperitem;
    @BindView(R.id.total)
    TextView total;
    @BindView(R.id.pesan2)
    Button pesan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);

        Intent i = getIntent();

        Integer totalpesan = i.getIntExtra("total", 0);
        String namamenu = i.getStringExtra("menu");
        String jumlah = i.getStringExtra("jumlah");
        String totalhargaperitem = i.getStringExtra("totalperitem");
        namaitem.setText(namamenu);
        totalitem.setText(jumlah);
        hargatotalperitem.setText(totalhargaperitem);
        total.setText("Rp. " + totalpesan);
    }

    @OnClick(R.id.pesan)
    public void onViewClicked() {
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (item.getItemId() == R.id.kontak) {
            startActivity(new Intent(this, MainActivity5.class));
        }
        return true;
    }
}
