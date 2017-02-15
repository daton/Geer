package firebase2.campitos.org.geer;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

public class Videos2Activity extends AppCompatActivity {
    VideoView myVideoView;
    LinearLayout.LayoutParams  layoutParams;
    int orientacion;

    String mensaje="jajaja";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos2_activity);
   // orientacion=  Videos2Activity.this.getResources().getConfiguration().orientation;

        myVideoView = (VideoView) findViewById(R.id.mi_video);


/*

        myVideoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
              // myVideoView.start();
              //  Toast.makeText(getApplicationContext(), "pantalla completa", Toast.LENGTH_LONG).show();
             //  myVideoView.setMediaController(new MediaController(Videos2Activity.this));
        //  int orientacion=     Videos2Activity.this.getResources().getConfiguration().orientation;
              //  Toast.makeText(getApplicationContext(),"Actividad:"+orientacion,Toast.LENGTH_LONG).show();

                  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设置横屏






                return true;
            }
        });
*/
        myVideoView.setVideoPath(MisVideos.miUrl);


        //myVideoView.onTouchEvent( e);

  myVideoView.setMediaController(new MediaController(getApplicationContext()));
      //  myVideoView.start();

     //   System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
       // getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);

/*
         layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
*/
        /*
        View decorView = getWindow().getDecorView();

        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE;
        decorView.setSystemUiVisibility(uiOptions);

        myVideoView.start();


*/

            }

    public void iniciar(View v){
myVideoView.start();
        myVideoView.setMediaController(new MediaController(this));
        System.out.println("aaaaaaaaa");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设置横屏

        View decorView = getWindow().getDecorView();

        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE;
        decorView.setSystemUiVisibility(uiOptions);

        myVideoView.start();

    }

    public void leerVideos(View v){
    //  String valor=  ServicioLeerVideos.servicioLeerVideos(getApplicationContext());
    //   TareaAsincornciaEstacion tarea=new TareaAsincornciaEstacion();
     //   tarea.execute(null,null,null);
      //  myVideoView.stopPlayback();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设置横屏
            myVideoView.pause();



    }

    public void pausar(View v){
        //  String valor=  ServicioLeerVideos.servicioLeerVideos(getApplicationContext());
        //   TareaAsincornciaEstacion tarea=new TareaAsincornciaEstacion();
        //   tarea.execute(null,null,null);
        //  myVideoView.stopPlayback();
        myVideoView.start();
        myVideoView.setMediaController(new MediaController(this));
        Toast.makeText(getApplicationContext(),"Se pasuso", Toast.LENGTH_LONG).show();


    }
    public void tocarVideo(View v){
        Toast.makeText(getApplicationContext(),"Haz tocado el video", Toast.LENGTH_LONG).show();
    }


    public class TareaAsincornciaEstacion extends AsyncTask<String, Integer, Integer> {

        @Override
        protected Integer doInBackground(String... params) {

            try {
                mensaje=  ServicioLeerVideos.servicioLeerVideos(getApplicationContext());
            }catch(Exception e){
                System.out.println("ALGO NO SALIO BIEN");
            }
            return 1;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_LONG).show();


        }
      }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.munusito, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_regresar:
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                break;

            default:
                break;
        }

        return true;
    }




    }

