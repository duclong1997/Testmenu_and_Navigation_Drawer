package com.example.longnd.menucreate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = (Button) findViewById(R.id.but);
        but1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.setting)
        {
            Toast.makeText(getApplicationContext(),"hello1",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.logout)
        {
            Toast.makeText(getApplicationContext(),"hello2",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.zoom_in)
        {
            Toast.makeText(getApplicationContext(),"hello3",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.zoom_out)
        {
            Toast.makeText(getApplicationContext(),"hello4",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
            int id= v.getId();
            if(id== R.id.but)
            {
                Intent intent= new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
    }
}
