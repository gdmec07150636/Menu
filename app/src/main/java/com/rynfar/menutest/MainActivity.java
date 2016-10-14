package com.rynfar.menutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        registerForContextMenu(button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE,1,Menu.NONE,R.string.menu1);
        menu.add(Menu.NONE,2,Menu.NONE,R.string.menu2);
        menu.add(Menu.NONE,3,Menu.NONE,R.string.menu3);
        menu.add(Menu.NONE,4,Menu.NONE,R.string.exit);
        /*MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu,menu);*/

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        if(item.getItemId()==4){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(Menu.NONE,1,Menu.NONE,R.string.menu1);
        menu.add(Menu.NONE,2,Menu.NONE,R.string.menu2);
        menu.add(Menu.NONE,3,Menu.NONE,R.string.menu3);
        menu.add(Menu.NONE,4,Menu.NONE,R.string.exit);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        if(item.getItemId()==4){
            finish();
        }
        return super.onContextItemSelected(item);
    }
}
