package com.example.administrator.andy1;

import android.view.View;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 4/22/2016.
 */
public class ActionTarget implements View.OnClickListener
{
    public Object target;
    public Method method;

    public String getMethodName()
    {
        return method==null ? "NULL" : method.getName();
    }

    @Override
    public void onClick(View v)
    {
       try{ method.invoke(target); }
       catch (Exception xp) {}
    }
}
