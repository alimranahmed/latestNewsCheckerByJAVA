import java.util.*;
public class News{
    public static ArrayList getProthomAloLatestHeading(int number){

        String htmlPage = Web.getHTMLPage("http://www.prothom-alo.com/archive");
        ArrayList<String> headingList = new ArrayList();
       for(int i = 0; i < number; i++){
           //<h3><a href= found
           int found = htmlPage.indexOf("<h3><a href=");
           //System.out.println("Found at "+found);
           //String after <h3><a href=
           String afterH3 = htmlPage.substring(found);
           //News heading start
           int headingStart = afterH3.indexOf("\">")+2+found;
           //String after heading
           String afterStart = htmlPage.substring(headingStart);
           //end of heading
           int headingEnd = afterStart.indexOf("</a>") + headingStart;
           String heading = htmlPage.substring(headingStart, headingEnd);
           //Print the heading out
           System.out.println(heading);
           //Cut up the heading that has been printed out
           htmlPage = htmlPage.substring(headingEnd);
           headingList.add(heading);
       }
       return headingList;
    }
}
