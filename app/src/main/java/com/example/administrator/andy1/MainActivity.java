package com.example.administrator.andy1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.lang.reflect.Field;

public class MainActivity extends BaseActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        { Button b = (Button) findViewById(R.id.btnHome); bind(b, "btnHome_click"); }
        { Button b = (Button) findViewById(R.id.btnSearch); bind(b, "btnSearch_click"); }
        { Button b = (Button) findViewById(R.id.btnFavor); bind(b, "btnFavor_click"); }
        { Button b = (Button) findViewById(R.id.btnAlert); bind(b, "btnAlert_click"); }
        { Button b = (Button) findViewById(R.id.btnSettings); bind(b, "btnSettings_click"); }
    }


    public  void btnHome_click()
    {
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        intent.putExtra("key", "value");
        this.startActivity(intent);
    }

    public  void btnSearch_click()
    {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        intent.putExtra("key", "value");
        this.startActivity(intent);
    }

    public  void btnFavor_click() { }

    public  void btnAlert_click() { }

    public  void btnSettings_click() { }

}
