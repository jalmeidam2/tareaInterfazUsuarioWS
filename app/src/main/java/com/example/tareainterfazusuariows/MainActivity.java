package com.example.tareainterfazusuariows;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tareainterfazusuariows.Adaptador.ViewPagerAdapter;
import com.example.tareainterfazusuariows.Fragmentos.FragmentCamara;
import com.example.tareainterfazusuariows.Fragmentos.FragmentEstados;
import com.example.tareainterfazusuariows.Fragmentos.FragmentLlamadas;
import com.example.tareainterfazusuariows.Fragmentos.fragmentChat;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout = findViewById(R.id.idTablLayout);
        viewPager = findViewById(R.id.idViewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentCamara(), "");
        adapter.AddFragment(new fragmentChat(), "chat");
        adapter.AddFragment(new FragmentEstados(), "estados");
        adapter.AddFragment(new FragmentLlamadas(), "llamada");
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        tablayout.getTabAt(0).setIcon(R.drawable.camara);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.idnuevogrupo:
                // startActivity(new Intent(MainActivity.this, bienvenido.class));
                Toast.makeText(this, "OPCION 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idnuevadifusion:
                Toast.makeText(this, "OPCION 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idws:
                Toast.makeText(this, "OPCION 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idmensajesdestacados:
                Toast.makeText(this, "OPCION 4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idajustes:
                Toast.makeText(this, "OPCION 5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buscar:
                Toast.makeText(this, "OPCION 6", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}