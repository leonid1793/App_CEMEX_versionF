package com.tarea.app_cemex;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;


public class MainNadBar extends AppCompatActivity


        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;


    private void displaySelectedFragment(Fragment fragment, String tag) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flContainerMain, fragment, tag).addToBackStack(tag).commit();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav1);
        settoolvar();


         drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        CarruselFragment fragment = new CarruselFragment ();
        displaySelectedFragment(fragment,"");

        //BottonNavegation
        BottomNavigationView bottomNavigationView = findViewById(R.id.buttonbar);
        final Home_Fragment home_fragment = new Home_Fragment();
        final Favorite_Fragment favorite_fragment = new Favorite_Fragment();
        final Fragment_CallCenter fragment_callCenter = new Fragment_CallCenter();
        final Fragment_Promocion fragment_promocion = new Fragment_Promocion();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
         @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                 int id= menuItem.getItemId();
                 if (id== R.id.navigation_home){
                     setFragment(home_fragment);
                     return true;
                 }else if (id==R.id.navigation_favorite){
                     setFragment(favorite_fragment);
                     return true;
                 }else if (id==R.id.navigation_callcenter){
                     setFragment(fragment_callCenter);
                     return true;
                 }else if (id==R.id.navigation_promociones){
                     setFragment(fragment_promocion);
                     return true;
                 }
                 return false;
             }
         });

        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_nad_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            CarruselFragment fragment = new CarruselFragment();
            displaySelectedFragment (fragment,"");
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {


        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

         drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void settoolvar(){
        Toolbar toolbar = findViewById(R.id.tollvar1);
        ImageView butto1 = toolbar.findViewById(R.id.tollvar_btn1);
        ImageView button2 = toolbar.findViewById(R.id.tollvar_btn2);

        butto1.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_menu,null));
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (drawer.isDrawerOpen(GravityCompat.START)){
                    drawer.closeDrawer(GravityCompat.START);

                }else {
                    drawer.openDrawer(GravityCompat.START);
                }



            }
        });
        setSupportActionBar(toolbar);
    }

    private  void  setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flContainerMain,fragment);
        fragmentTransaction.commit();
    }
}
