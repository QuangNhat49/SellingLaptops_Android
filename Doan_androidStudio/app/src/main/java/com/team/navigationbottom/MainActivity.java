package com.team.navigationbottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.team.navigationbottom.Fragment.Cart;
import com.team.navigationbottom.Fragment.Home;
import com.team.navigationbottom.Fragment.Laptop;
import com.team.navigationbottom.Fragment.Person;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Home home;
    Cart cart;
    Person person;
    Laptop laptop;
    Fragment fragment;
    ViewFlipper vfquangcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        vfquangcao = findViewById(R.id.vfquangcao);

        setFragment(new Home());
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Home()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int idmn = item.getItemId();
                switch (idmn) {
                    case R.id.laptop:
                        setFragment(new Laptop());
                        fragment = new Laptop();
                        break;
                    case R.id.person:
                        setFragment(new Person());
                        fragment = new Person();
                        break;
                    case R.id.cart:
                        setFragment(new Cart());
                        fragment = new Cart();
                        break;
                    case R.id.home:
                        setFragment(new Home());
                        fragment = new Home();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
                return true;
            }
        });
    }
    // hổ trọw hiện ra giao diện
    private void setFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment );
        fragmentTransaction.commit();
    }

}