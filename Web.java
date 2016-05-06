import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
public class Web{
    public static String getHTMLPage(String url){
        String response = "";
        try{
            response = Jsoup.connect(url).execute().body();
        }catch(IOException e){
           System.out.println(e);
       }
       return response;
    }
}
