package firebase2.campitos.org.geer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    private VideoView myVideoView;

    private int position = 0;

    private ProgressDialog progressDialog;

    private MediaController mediaControls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Aqui irá mensaje a  correo eletrónco", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        //Ocultamos
        ocultarTodo();
        LinearLayout principal=(LinearLayout)findViewById(R.id.layout_principal);
        principal.setVisibility(View.VISIBLE);
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            ocultarTodo();
            LinearLayout principal=(LinearLayout)findViewById(R.id.layout_principal);
            principal.setVisibility(View.VISIBLE);
        } else if (id == R.id.nav_examenes) {
            ocultarTodo();

            ScrollView principal=(ScrollView) findViewById(R.id.layout_examenes);
            principal.setVisibility(View.VISIBLE);





        }else if (id == R.id.somos) {
            ocultarTodo();
            ScrollView principal=(ScrollView) findViewById(R.id.layout_somos);
            principal.setVisibility(View.VISIBLE);
        }

        else if (id == R.id.nav_docentes) {
            ocultarTodo();
            Intent i=new Intent(getApplicationContext(),MenuVideosActivity.class);
            startActivity(i);
            //finish();
        }  else if (id == R.id.nav_oferta) {
            ocultarTodo();
            ScrollView principal=(ScrollView) findViewById(R.id.layout_oferta);
            principal.setVisibility(View.VISIBLE);



        } else if (id == R.id.nav_send) {
            ocultarTodo();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void ocultarTodo(){
        LinearLayout principal=(LinearLayout)findViewById(R.id.layout_principal);
         LinearLayout videos= (LinearLayout) findViewById(R.id.layout_videos);
        ScrollView somos=(ScrollView)findViewById(R.id.layout_somos);
        ScrollView examenes=(ScrollView)findViewById(R.id.layout_examenes);
        ScrollView oferta=(ScrollView)findViewById(R.id.layout_oferta);
        //Ocultamos
        principal.setVisibility(View.INVISIBLE);
        videos.setVisibility(View.INVISIBLE);
        somos.setVisibility(View.INVISIBLE);
        examenes.setVisibility(View.INVISIBLE);
        oferta.setVisibility(View.INVISIBLE);
    }
}
