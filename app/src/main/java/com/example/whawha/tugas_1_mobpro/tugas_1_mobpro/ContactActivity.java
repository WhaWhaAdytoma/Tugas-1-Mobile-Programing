package com.example.whawha.tugas_1_mobpro.tugas_1_mobpro;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactActivity {

        @BindView(R.id.kontak)
        TextView kontak;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kontak);
            ButterKnife.bind(this);
        }

        @OnClick(R.id.kontak)
        public void onViewClicked() {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:08212512628"));
            startActivity(intent);
        }
    }

