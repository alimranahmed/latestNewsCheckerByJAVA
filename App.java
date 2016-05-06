import java.util.*;
public class App{
    public static void main(String[] CHAND){
        View v = new View();
        while(true){
            ArrayList<String> headingList = News.getProthomAloLatestHeading(10);
            v.inflate(headingList);
            sleepForSec(5*60);
        }
    }

    public static void sleepForSec(int seconds){
        try {
            Thread.sleep(seconds * 1000);//1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
