package com.example.longnd.menucreate;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
//    private LinearLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        // call NavlgationView with id= tab
        NavigationView navigationView = findViewById(R.id.tab);
        navigationView.setNavigationItemSelectedListener(this);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new Default_fragment()).commit();
//            navigationView.setCheckedItem(R.id.defaultt);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
           return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if(menuItem.getItemId()== R.id.logout)
        {
//          getSupportFragmentManager().beginTransaction().replace(R.id.defaultt,new Message_fragment()).commit();
            Toast.makeText(getApplicationContext(),"log out",Toast.LENGTH_SHORT).show();
        }
        if(menuItem.getItemId()== R.id.zoom_in)
        {
            Toast.makeText(getApplicationContext(),"zoom in",Toast.LENGTH_SHORT).show();

        }
        if(menuItem.getItemId()== R.id.zoom_out)
        {
            Toast.makeText(getApplicationContext(),"zoom out ",Toast.LENGTH_SHORT).show();
        }
        if(menuItem.getItemId()== R.id.setting)
        {
//            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt,new setting_fragment()).commit();
            Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
        }
        drawerLayout.closeDrawer(Gravity.START);
        return true;
    }
}
