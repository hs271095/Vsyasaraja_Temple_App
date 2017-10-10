package bangalore.bms.japaapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Harshit on 10-10-2017.
 */

public class UserPage extends AppCompatActivity {
    BottomNavigationView bnv;
    ListView lv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userpage);
        bnv=(BottomNavigationView)findViewById(R.id.navbot);
        lv=(ListView)findViewById(R.id.listView);
        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
        Map<String, String> datum = new HashMap<String, String>(2);
        datum.put("user","test1@gmail.com" );
        datum.put("age", "Age:25");
        data.add(datum);
        SimpleAdapter adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_2, new String[] {"user", "age"},new int[] {android.R.id.text1,
                android.R.id.text2}) {
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                TextView text2 = (TextView) view.findViewById(android.R.id.text2);
                text1.setTextColor(Color.parseColor("#8c2424"));
                text1.setTextSize(20);
                text2.setTextColor(Color.parseColor("#8c2424"));
                text2.setTextSize(15);
                return view;
            }
        };
        lv.setAdapter(adapter);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.home:
                        Intent j = new Intent(UserPage.this, HomePage.class);
                        startActivity(j);
                        break;
                    case R.id.settings:
                        Intent go2 = new Intent(UserPage.this, SettingsPage.class);
                        startActivity(go2);
                        break;
                    case R.id.users:
                        break;
                    case R.id.record:
                        break;

                }
                return false;
            }
        });
    }
}
