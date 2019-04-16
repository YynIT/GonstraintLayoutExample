package com.example.constraintlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab1:
                finish();
                break;
            case R.id.id_ratio:
                setContentView(R.layout.activity_ratio);
                break;
            case R.id.id_barrier:
                setContentView(R.layout.layout_barrier);
                break;
            case R.id.id_chain:
                setContentView(R.layout.layout_chain);
                break;
            case R.id.id_cicle:
                setContentView(R.layout.layout_circle);
                break;
            case R.id.id_group:
                setContentView(R.layout.layout_group);
                break;
            case R.id.id_guideLine:
                setContentView(R.layout.layout_guideline);
                break;
            case R.id.id_one:
                setContentView(R.layout.layout_one);
                break;
            case R.id.id_two:
                setContentView(R.layout.layout_two);
                break;
        }
    }

    private long currentTime = 0;

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - currentTime > 500) {
            currentTime = System.currentTimeMillis();
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_main);
        } else {
            super.onBackPressed();
        }
    }
}
