package bangalore.bms.japaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Harshit on 10-10-2017.
 */

public class SettingsPage extends AppCompatActivity {
    BottomNavigationView bnv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingspage);
        bnv=(BottomNavigationView)findViewById(R.id.navbot);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.home:
                        Intent j = new Intent(SettingsPage.this, HomePage.class);
                        startActivity(j);
                        break;
                    case R.id.settings:
                        break;
                    case R.id.users:
                        Intent go1 = new Intent(SettingsPage.this,UserPage.class);
                        startActivity(go1);
                        break;
                    case R.id.record:
                        break;

                }
                return false;
            }
        });
    }
}
