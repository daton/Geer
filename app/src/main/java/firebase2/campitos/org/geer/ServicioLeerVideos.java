package firebase2.campitos.org.geer;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by campitos on 10/02/17.
 */

public class ServicioLeerVideos {
    public static String servicioLeerVideos(Context ctx){

        String datos="nada";
        int valor=0;
        int lineas=0;
        try{
           /*
           La clase AssetManager sirve para tener acceso a archivos directamente en la carpeta de assets (que tu
           deberas de crear) por medio de una api de bajo nivel para abrir y leer archivos como stream de bytes
          http://developer.android.com/reference/android/content/res/AssetManager.html
            */


            URL url = new URL("http://geducativoedi.com.mx/archivaldo");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            InputStream input=con.getInputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(input));
            String inputLine;
            StringBuilder builder=new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                datos=inputLine;
                lineas++;
                builder.append(inputLine);

            }

        datos=builder.toString();

        }catch(Exception e){
            Log.i("XXXX","Algo malo  "+e.getMessage()+"  eloco "+lineas);
        }


        return datos;
    }


}
