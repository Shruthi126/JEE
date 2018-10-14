package regex.com;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlLinks {
	
	

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num= s.nextInt(); String str =null;
        List<String> htmlLines = new ArrayList();
        s.nextLine();
        for(int i=0;i<num;i++){
            str=s.nextLine();
            if(str.contains("ref")){
                htmlLines.add(str);
                
            }
      
      Pattern p = Pattern.compile("(<a href=");
       Matcher m = p.matcher("dfj");
       m.group(group)
        }
       
    }
}