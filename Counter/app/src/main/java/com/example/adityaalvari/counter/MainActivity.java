package com.example.adityaalvari.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countReset(View view) {
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }


    public void resetClick(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        countReset(view);
    }


}
