package firebase2.campitos.org.geer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by campitos on 14/02/17.
 */

public class MisVideos {

    public static String miUrl="";

    public static ArrayList<MiVideo> obtenerVodeos(){
        MiVideo v1=new MiVideo("Internet","","http://www.geducativoedi.com.mx/videos/internet/internet.mp4");
        MiVideo v2=new MiVideo("Word","","http://www.geducativoedi.com.mx/videos/word/word.mp4");
        MiVideo v3=new MiVideo("Access","","http://www.geducativoedi.com.mx/videos/access/access.mp4");
        ArrayList<MiVideo> todos=new ArrayList<MiVideo>();
        todos.add(v1);
        todos.add(v2);
        todos.add(v3);
        return todos;
    }
}
