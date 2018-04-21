package com.example.panhongwen.menutest;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //定义“字体大小”菜单项的标识
    final int FONT_10 = 0x111;
    final int FONT_14 = 0x112;
    final int FONT_18 = 0x113;
    //定义“普通菜单项”的标识
    final int PLAIN_ITEN = 0x11b;
    //定义“字体颜色”菜单项的标识
    final int FONT_RED = 0x114;
    final int FONT_BLACK =0x115;
    private TextView edit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (TextView) findViewById(R.id.txt);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //向menu中添加“字体大小”的子菜单
        SubMenu fontMenu = menu.addSubMenu("字体大小");
        fontMenu.setHeaderTitle("选择字体大小");
        fontMenu.add(0,FONT_10,0,"小");
        fontMenu.add(0,FONT_14,0,"中");
        fontMenu.add(0,FONT_18,0,"大");
        menu.add(0,PLAIN_ITEN,0,"普通菜单项");
        SubMenu colorMenu = menu.addSubMenu("字体颜色");
        colorMenu.setHeaderTitle("选择字体颜色");
        colorMenu.add(0,FONT_RED,0,"红色");
        colorMenu.add(0,FONT_BLACK,0,"黑色");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        //判断单击是哪个菜单项，并针对性作出响应
        switch (mi.getItemId())
        {
            case FONT_10:
                edit.setTextSize(10 * 2);
                break;
            case FONT_14:
                edit.setTextSize(14 * 2);
                break;
            case FONT_18:
                edit.setTextSize(18 * 2);
                break;
            case FONT_RED:
                edit.setTextColor(Color.RED);
                break;
            case FONT_BLACK:
                edit.setTextColor(Color.BLACK);
                break;
            case PLAIN_ITEN:
                Toast toast = Toast.makeText(MainActivity.this,"您单击了普通菜单项",Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
        return true;
    }
}
