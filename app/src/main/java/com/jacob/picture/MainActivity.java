package com.jacob.picture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_test1).setOnClickListener(this);
        findViewById(R.id.button_test2).setOnClickListener(this);
        findViewById(R.id.button_test3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_test1: {
                Intent intent = new Intent(this, PictureDemoOne.class);
                startActivity(intent);
            }
            break;
            case R.id.button_test2: {
                Intent intent = new Intent(this, PictureDemoTwo.class);
                startActivity(intent);
            }
            break;
            case R.id.button_test3: {
                Intent intent = new Intent(this, PictureDemoThree.class);
                startActivity(intent);
            }
            break;
        }
    }
}