package com.qspl.quagnitia.opionmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.it1)
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        if (id==R.id.it2)
            Toast.makeText(this, "Font", Toast.LENGTH_SHORT).show();
        if (id==R.id.it3)
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
        if (id==R.id.it4)
            Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
