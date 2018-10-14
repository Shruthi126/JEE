package regex.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DetectTags {

	/*
	https://stackoverflow.com/questions/3075130/what-is-the-difference-between-and-regular-expressions
	Here's a visual representation of what the two patterns matched:

	A.*Z yields 1 match
	A.*?Z yields 2 matches

	eeeAiiZuuuuAoooZeeee
	   \__/r   \___/r      r = reluctant
	    \____g____/        g = greedy
	    
	    
	Our example <p><a href="http://www.q.cfm">Example Link</q></z>    
	We have to match both p and a here without being greedy
	 */   
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int num= s.nextInt(); String str =null;
        List<String> tags = new ArrayList();
        Pattern p = Pattern.compile("<\\b(\\w+)\\b.*?>");
        s.nextLine();
        for(int i=0;i<num;i++){
            str=s.nextLine();
            Matcher m = p.matcher(str);
            while(m.find()){
                MatchResult mr=m.toMatchResult();//Important for taking the matched result
              if(!tags.contains(mr.group(1)))
                  tags.add(mr.group(1));            
            }
            
         }
        Collections.sort(tags);
      System.out.println(tags.stream().collect(Collectors.joining(";")));
    }
    
}
