package com.example.panhongwen.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView myListView;
    private String[] names = new String[]
            {"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imageids = new int[]
            {R.mipmap.lion,R.mipmap.tiger,R.mipmap.monkey,R.mipmap.dog,R.mipmap.cat,R.mipmap.elephant};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String,Object>> listItems =
                new ArrayList<Map<String ,Object>>();
        for(int i = 0;i < names.length; i++)
        {
            Map<String,Object> listItem = new HashMap<String, Object>();
            listItem.put("personname",names[i]);
            listItem.put("imagess",imageids[i]);
            listItems.add(listItem);

        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,
                R.layout.layout,
                new String []{"personname","imagess"},
                new int[]{R.id.name,R.id.heade});
        ListView list = (ListView) findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);

        myListView=(ListView)findViewById(R.id.mylist);
        myListView.setAdapter(simpleAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv=(TextView)view.findViewById(R.id.name);
                String text = tv.getText().toString();
                Toast toast = Toast.makeText(MainActivity.this,
                        text,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
