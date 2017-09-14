package com.example.jadulco_maria_115.jadulco_listview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jadulco_maria_115.jadulco_listview.R;

public class MainActivity extends AppCompatActivity {
    String colleges[];
    String year[];
    ListView lv_Colleges;
    ArrayAdapter<String> adapter;
    int logos[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colleges = getResources().getStringArray(R.array.Colleges);
        year = getResources().getStringArray(R.array.Year);

        lv_Colleges = (ListView) findViewById(R.id.lvColleges);

        //logos = new int[] {R.drawable.iics,  };

       // for(int i=0; i < colleges.length; i++) {
        //    lv_Colleges.add(new logos ())
       // }



        adapter = new ArrayAdapter<String>(this, R.layout.row_layout, colleges);
        lv_Colleges.setAdapter(adapter);
        lv_Colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked" + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
