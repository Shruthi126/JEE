package regex.com;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberAndSymbol {

	public static void main(String[] args) {
			
		int i=0; int total=0;
		
		Pattern pattern = Pattern.compile("(//d*?)");
		Matcher match = pattern.matcher("984@29#*3");
		MatchResult m= match.toMatchResult();
		
		while(!m.group(i).isEmpty()){
			total=total+Integer.parseInt(m.group(i++));
		}
		System.out.println(total);		
		
		/*List<Character> list=Arrays.asList('!','@','#','$','%','^','&','*','(',')');
		List<String> total = new ArrayList();
		StringBuilder str=new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();
		String c=sc.nextLine();
		 
		for(int i=0;i<len;i++){
			if(!list.contains(c.charAt(i))){
				str.append(c.charAt(i));
			}else if(str.length()!=0){
				total.add(str.toString());
				str.setLength(0);
			}
		}
			if(str.length()!=0 && !total.contains(str)) 
				total.add(str.toString());
			
			System.out.println(total.stream().mapToInt(a->Integer.parseInt(a)).sum());
		*/	 
		}
	}


