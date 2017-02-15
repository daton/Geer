package firebase2.campitos.org.geer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class VideosActividad extends AppCompatActivity {
VideoView myVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos_actividad);




        myVideoView = (VideoView) findViewById(R.id.mi_video);

        myVideoView.setVideoPath(
                "http://www.geducativoedi.com.mx/excel.mp4");

        myVideoView.start();
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");




    }
}
