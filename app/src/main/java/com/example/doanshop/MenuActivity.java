package com.example.doanshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private int mAddm3 = 0;
    public TextView mAddCount;

    private int mAddms = 0;
    public TextView mAddCountS;

    private int mAddmx = 0;
    public TextView mAddCountX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mAddCount = (TextView) findViewById(R.id.subtotal_countm3);
        mAddCountS = (TextView) findViewById(R.id.subtotal_countms);
        mAddCountX = (TextView) findViewById(R.id.subtotal_countmx);
    }


    /**
     *
     * this adds 1 to the model 3 quantity
     */
    public void add_model3(View view){
         mAddm3++;
        if (mAddCount != null){
            mAddCount.setText(Integer.toString(mAddm3));
        }
    }

    /**
     *
     * this removes 1 from the model 3 quantity
     */
    public  void remove_model3(View view){

            if(mAddm3 <= 0){
                mAddm3 = 0;
                Toast.makeText(this, "Can't remove anymore.", Toast.LENGTH_SHORT).show();
            }else {
                mAddm3--;
                mAddCount.setText(Integer.toString(mAddm3));
            }

    }

    /**
     *
     * this adds 1 to the model s quantity
     */
    public void add_models(View view){
        mAddms++;
        if (mAddCountS != null){
            mAddCountS.setText(Integer.toString(mAddms));
        }
    }

    /**
     *
     * this removes 1 to the model s quantity
     */
    public  void remove_models(View view){

        if(mAddms <= 0){
            mAddms = 0;
            Toast.makeText(this, "Can't remove anymore.", Toast.LENGTH_SHORT).show();
        }else {
            mAddms--;
            mAddCountS.setText(Integer.toString(mAddms));
        }

    }

    /**
     *
     * this adds 1 to the model x quantity
     */
    public void add_modelx(View view){
        mAddmx++;
        if (mAddCountX != null){
            mAddCountX.setText(Integer.toString(mAddmx));
        }
    }

    /**
     *
     * this removes 1 to the model x quantity
     */
    public  void remove_modelx(View view){

        if(mAddmx <= 0){
            mAddmx = 0;
            Toast.makeText(this, "Can't remove anymore.", Toast.LENGTH_SHORT).show();
        }else {
            mAddmx--;
            mAddCountX.setText(Integer.toString(mAddmx));
        }

    }

    /**
     *
     * open checkout activity
     */
    public void openCheckout(View view) {

        int subtotal = (mAddm3*54990)+(mAddms*108990)+(mAddmx*115990);
        double tps = subtotal * 0.05;
        double tvq = subtotal * 0.09975;
        double total = subtotal + tps + tvq;

        Intent intent1 = new Intent(this, CheckoutActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("subtotal",String.valueOf(subtotal));
        bundle.putString("total",String.valueOf(total));
        bundle.putString("tvq",String.valueOf(tvq));
        bundle.putString("tps",String.valueOf(tps));

        intent1.putExtras(bundle);
        intent1.putExtras(bundle);
        intent1.putExtras(bundle);
        intent1.putExtras(bundle);

        startActivity(intent1);

    }


}
