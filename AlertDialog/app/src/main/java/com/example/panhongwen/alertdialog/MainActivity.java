package com.example.panhongwen.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TableLayout loginForm = (TableLayout)getLayoutInflater()
                .inflate(R.layout.login,null);
        new AlertDialog.Builder(this)
                //设置对话框的标题
                .setTitle("ANDROID APP")
                //设置对话框显示的View对象
                .setView(loginForm)
                //为对话框设置一个确认按钮
                .setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        //此处为登录处理
                    }
                })
                //为对话框设置一个取消按钮
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        //取消登录，不做任何事
                    }
                })
                .create()
                .show();
    }
}
