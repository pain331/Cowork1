package com.example.kts.cowork1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // heejun86.kang test1
        // taseseop.kim test2
        Toast.makeText(this, "Creat", Toast.LENGTH_SHORT).show();
    }

    public void ButtonClick(View view) {
        Toast.makeText(this, "ButtonClick", Toast.LENGTH_SHORT).show();
    }
}
