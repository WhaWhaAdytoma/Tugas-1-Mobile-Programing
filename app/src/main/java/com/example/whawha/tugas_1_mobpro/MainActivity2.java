package com.example.whawha.tugas_1_mobpro;




import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.jml_nasgor)
    TextView jmlNasgor;
    @BindView(R.id.jml_ramen)
    TextView jmlRamen;
    @BindView(R.id.jml_ayam)
    TextView jmlAyam;
    @BindView(R.id.jml_lemontea)
    TextView jmlLemontea;
    @BindView(R.id.jml_matcha)
    TextView jmlMatcha;
    @BindView(R.id.jml_orange)
    TextView jmlOrange;
    @BindView(R.id.pesan)
    TextView pesan;
    @BindView(R.id.nasigoreng)
    CardView nasigoreng;
    @BindView(R.id.ramen)
    CardView ramen;
    @BindView(R.id.ayamkremes)
    CardView ayamkremes;
    @BindView(R.id.lemontea)
    CardView lemontea;
    @BindView(R.id.matcha)
    CardView matcha;
    @BindView(R.id.orange)
    CardView orange;

    Integer menu_aktif = 0;
    Integer temp_jumlah = 0;
    Integer total;
    String menu = "", jumlah = "", totalperitem = "";
    Integer a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
    Integer t_nasgor = 0, t_ramen = 0, t_ayam = 0, t_lemontea = 0, t_matcha = 0, t_orange = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        registerForContextMenu(nasigoreng);
        registerForContextMenu(ramen);
        registerForContextMenu(ayamkremes);
        registerForContextMenu(lemontea);
        registerForContextMenu(matcha);
        registerForContextMenu(orange);
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

            return true;
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            super.onCreateContextMenu(menu, v, menuInfo);
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.context_menu, menu);
            if (v.getId() == R.id.ayamgeprek) {
                menu_aktif = 1;
            } else if (v.getId() == R.id.ikanbakar) {
                menu_aktif = 2;
            } else if (v.getId() == R.id.nasikomplit) {
                menu_aktif = 3;
            } else if (v.getId() == R.id.greettea) {
                menu_aktif = 4;
            } else if (v.getId() == R.id.esteh) {
                menu_aktif = 5;
            } else if (v.getId() == R.id.kopiirlandia) {
                menu_aktif = 6;
            }
        }

        @Override
        public boolean onContextItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nol:
                    temp_jumlah = 0;
                    break;
                case R.id.satu:
                    temp_jumlah = 1;
                    break;
                case R.id.dua:
                    temp_jumlah = 2;
                    break;
                case R.id.tiga:
                    temp_jumlah = 3;
                    break;
                case R.id.empat:
                    temp_jumlah = 4;
                    break;
                case R.id.lima:
                    temp_jumlah = 5;
                    break;
            }

            switch (menu_aktif) {
                case 1:
                    jmlNasgor.setText("" + temp_jumlah);
                    break;
                case 2:
                    jmlRamen.setText("" + temp_jumlah);
                    break;
                case 3:
                    jmlAyam.setText("" + temp_jumlah);
                    break;
                case 4:
                    jmlLemontea.setText("" + temp_jumlah);
                    break;
                case 5:
                    jmlMatcha.setText("" + temp_jumlah);
                    break;
                case 6:
                    jmlOrange.setText("" + temp_jumlah);
                    break;
            }
            return true;
        }

        public void getCount() {

            a = Integer.parseInt(jmlNasgor.getText().toString());
            b = Integer.parseInt(jmlRamen.getText().toString());
            c = Integer.parseInt(jmlAyam.getText().toString());
            d = Integer.parseInt(jmlLemontea.getText().toString());
            e = Integer.parseInt(jmlMatcha.getText().toString());
            f = Integer.parseInt(jmlOrange.getText().toString());

            t_nasgor = a * 20000;
            t_ramen = b * 25000;
            t_ayam = c * 25000;
            t_lemontea = d * 15000;
            t_matcha = e * 15000;
            t_orange = f * 15000;

            total = t_nasgor + t_ramen + t_ayam + t_lemontea + t_matcha + t_orange;

            if (t_nasgor == 0){

            }else{
                menu += "Ayam Geprek\n";
                jumlah += "" + a + "\n";
                totalperitem += "Rp. " + t_nasgor + "\n";
            }
            if (t_ramen == 0){

            }else{
                menu += "Ikan Bakar\n";
                jumlah += "" + b + "\n";
                totalperitem += "Rp. " + t_ramen + "\n";
            }
            if (t_ayam == 0){

            }else{
                menu += "Nasi Komplit\n";
                jumlah += "" + c + "\n";
                totalperitem += "Rp. " + t_ayam + "\n";
            }
            if (t_lemontea == 0){

            }else{
                menu += "Green Tea\n";
                jumlah += "" + d + "\n";
                totalperitem += "Rp. " + t_lemontea + "\n";
            }
            if (t_matcha == 0){

            }else{
                menu += "Es Teh\n";
                jumlah += "" + e + "\n";
                totalperitem += "Rp. " + t_matcha + "\n";
            }
            if (t_orange == 0){

            }else{
                menu += "Kopi Irlandia\n";
                jumlah += "" + f + "\n";
                totalperitem += "Rp. " + t_orange + "\n";
            }
        }

        @OnClick(R.id.aksipesan)
        public void onViewClicked() {
            menu = "";
            jumlah = "";
            totalperitem = "";

            getCount();

            if(t_nasgor == 0 && t_ramen == 0 && t_ayam == 0 && t_lemontea == 0 && t_matcha == 0 && t_orange == 0){
                Toast.makeText(this, "Anda belum memilih menu.", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("total", total);
                intent.putExtra("menu", menu);
                intent.putExtra("jumlah", jumlah);
                intent.putExtra("totalperitem", totalperitem);
                startActivity(intent);
            }

        }
    }

