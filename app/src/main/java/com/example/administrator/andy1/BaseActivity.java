package com.example.administrator.andy1;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

/**
 * Created by Administrator on 4/22/2016.
 */
public class BaseActivity extends AppCompatActivity
{
    public void log(String msg)
    {
        Log.d(this.getClass().getName(), msg);
    }

    public void bind(Button b, String name)
    {
        ActionTarget act = new ActionTarget();
        act.target = this;
        try { act.method = this.getClass().getDeclaredMethod(name); } catch(Exception xp) {}

        Log.d(this.getClass().getName(), "bind: " + act.getMethodName());
        b.setOnClickListener(act);
    }
}
