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
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // ho tro keo menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle= new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        NavigationView navigationView= findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new Default_fragment()).commit();
         }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.START)) {
            drawerLayout.closeDrawer(Gravity.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if(menuItem.getItemId()== R.id.nav_setting)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new setting_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        if(menuItem.getItemId()== R.id.nav_logout)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new logout_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        if(menuItem.getItemId()== R.id.nav_send)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new Default_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        if(menuItem.getItemId()== R.id.nav_share)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new Default_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        if(menuItem.getItemId()== R.id.nav_zoomin)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new zoom_in_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        if(menuItem.getItemId()== R.id.nav_zoomout)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new zoom_out_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        if(menuItem.getItemId()== R.id.nav_show)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.defaultt, new Message_fragment()).commit();
            Toast.makeText(getApplicationContext(),"heloo",Toast.LENGTH_LONG);
        }
        drawerLayout.closeDrawer(Gravity.START);
        return true;
    }
}
