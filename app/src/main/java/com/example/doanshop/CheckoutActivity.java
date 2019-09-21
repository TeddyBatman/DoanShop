package com.example.doanshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //DecimalFormat df = new DecimalFormat("#.##");

        Bundle bundle = getIntent().getExtras();
        String datas = bundle.getString("subtotal");
        TextView subtotal = findViewById(R.id.subtotal_grab);
        subtotal.setText(datas);


        String datatps = bundle.getString("tps");
        TextView tps = findViewById(R.id.tps_grab);
        tps.setText(datatps);


        String datatvq = bundle.getString("tvq");
        TextView tvq = findViewById(R.id.tvq_grab);
        tvq.setText(datatvq);


        String datatot = bundle.getString("total");
        TextView total = findViewById(R.id.total_grab);
        total.setText(datatot);

    }


}
