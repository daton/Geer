package firebase2.campitos.org.geer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MenuVideosActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_videos);

        LinearLayout layout= (LinearLayout) findViewById(R.id.layout_menu_videos);

        //Primero
        TextView tv1=new TextView(this);
        tv1.setText("Informatica 2 Internet ");
        tv1.setTextSize(18);
        tv1.setTextColor(getResources().getColor(R.color.colorAccent));

        layout.addView(tv1);

        ImageView img1=new ImageView(this);
        img1.setLayoutParams(new
                LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));;
        img1.setImageDrawable(getResources().getDrawable(R.drawable.con_video));
        img1.setOnClickListener(this);
        img1.setId(new Integer(1));
        layout.addView(img1);


       //Segundo

        TextView tv2=new TextView(this);
        tv2.setText("Informatica 2 Word ");
        tv2.setTextSize(18);
        tv2.setTextColor(getResources().getColor(R.color.colorAccent));
        layout.addView(tv2);

        ImageView img2=new ImageView(this);
        img2.setLayoutParams(new
                LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));;
        img2.setImageDrawable(getResources().getDrawable(R.drawable.con_video));
        img2.setId(new Integer(2));
        img2.setOnClickListener(this);
        layout.addView(img2);



        //Tercero

        TextView tv3=new TextView(this);
        tv3.setText("Informatica 4 Access ");
        tv3.setTextSize(18);
        tv3.setTextColor(getResources().getColor(R.color.colorAccent));
        layout.addView(tv3);

        ImageView img3=new ImageView(this);
        img3.setLayoutParams(new
                LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));;
        img3.setImageDrawable(getResources().getDrawable(R.drawable.con_video));
        img3.setId(new Integer(3));
        img3.setOnClickListener(this);

        layout.addView(img3);




    }

        public void verVideo(View v){

            Intent i=new Intent(getApplicationContext(),Videos2Activity.class);
            startActivity(i);
    }

    @Override
    public void onClick(View view) {
     Integer miId=view.getId();
       // Toast.makeText(getApplicationContext(),"El id es "+miId,Toast.LENGTH_LONG).show();
        switch (miId){
            case 1:{
                MisVideos.miUrl="http://www.geducativoedi.com.mx/videos/internet/internet.mp4";
                break;
            }
            case 2:{
                MisVideos.miUrl="http://www.geducativoedi.com.mx/videos/word/word.mp4";
                break;
            }
            case 3:{
                MisVideos.miUrl="http://www.geducativoedi.com.mx/videos/access/access.mp4";
                break;
            }
        }

        Intent i=new Intent(getApplicationContext(),Videos2Activity.class);
        startActivity(i);
    }
}
