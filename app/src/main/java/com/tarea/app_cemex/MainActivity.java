package com.tarea.app_cemex;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button button,button_nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.button_register);
        button_nav= (Button)findViewById(R.id.button_inicio);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainRegistroActivity.class));
            }
        });

        button_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainNadBar.class));
            }
        });

        //BottonNavegation
        BottomNavigationView navigationView = findViewById(R.id.nav_view_botton);
         final Home_Fragment home_fragment = new Home_Fragment();
         final Favorite_Fragment favorite_fragment = new Favorite_Fragment();
         final Fragment_CallCenter fragment_callCenter = new Fragment_CallCenter();
         final Fragment_Promocion fragment_promocion = new Fragment_Promocion();

       //  navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            // @Override
//             public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                 int id= menuItem.getItemId();
//                 if (id== R.id.navigation_home){
//                     setFragment(home_fragment);
//                     return true;
//                 }else if (id==R.id.navigation_favorite){
//                     setFragment(favorite_fragment);
//                     return true;
//                 }else if (id==R.id.navigation_callcenter){
//                     setFragment(fragment_callCenter);
//                     return true;
//                 }else if (id==R.id.navigation_promociones){
//                     setFragment(fragment_promocion);
//                     return true;
//                 }
//                 return false;
//             }
//         });

       //  navigationView.setSelectedItemId(R.id.navigation_home);

    }
    private  void  setFragment(Fragment fragment){
    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.fragment_container,fragment);
    fragmentTransaction.commit();
    }
}



                 //END

