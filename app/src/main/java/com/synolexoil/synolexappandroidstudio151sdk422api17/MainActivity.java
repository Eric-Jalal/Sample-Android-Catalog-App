package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView = null;
    Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT
        // IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT   ====++++++++++++++++++++++++++++==============***********************************
        // Make this line uncomment before getting build apk!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Pushe.initialize(this, true);

        SynolexLubInfoJava synolexLubInfoJava = new SynolexLubInfoJava();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, synolexLubInfoJava);
        fragmentTransaction.commit();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.fragment_synolex_lube_info) {
            SynolexLubInfoJava synolexLubInfoJava = new SynolexLubInfoJava();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, synolexLubInfoJava);
            fragmentTransaction.commit();

        } else if (id == R.id.fragment_synolex_lube_search) {
            SynoLubeSearchJava synoLubeSearchJava = new SynoLubeSearchJava();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, synoLubeSearchJava);
            fragmentTransaction.commit();

        } /*else if (id == R.id.fragment_lube_info_java) {
            LubeInfoJava lubeInfoJava = new LubeInfoJava();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, lubeInfoJava);
            fragmentTransaction.commit();

        }*/ else if (id == R.id.fragment_lube_change_reminder) {
            LubeChangeReminder lubeChangeReminder = new LubeChangeReminder();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, lubeChangeReminder);
            fragmentTransaction.commit();

        } else if (id == R.id.fragment_insurance_expiration_reminder) {
            InsuranceExpirationReminder insuranceExpirationReminder = new InsuranceExpirationReminder();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, insuranceExpirationReminder);
            fragmentTransaction.commit();

        }/* else if (id == R.id.fragment_map) {
            Map map = new Map();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, map);
            fragmentTransaction.commit();

        } */else if (id == R.id.fragment_khalafi) {
            khalafi khalafiobj = new khalafi();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, khalafiobj);
            fragmentTransaction.commit();

        }/* else if (id == R.id.fragment_motorsound) {
            motorsound motorsoundobj = new motorsound();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, motorsoundobj);
            fragmentTransaction.commit();

        } */else if (id == R.id.fragment_buy) {
            Buy buy = new Buy();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, buy);
            fragmentTransaction.commit();

        } else if (id == R.id.fragment_policy) {
            Policy policy = new Policy();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, policy);
            fragmentTransaction.commit();

        } else if (id == R.id.fragment_callus) {
            Callus callus = new Callus();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, callus);
            fragmentTransaction.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
