package stack;

public class StringReversal {

	public static void main(String[] args) throws Exception {
		String str= "He";
		StringBuilder reverseString = new StringBuilder();
		StackWithArray st= new StackWithArray(str.length());
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		
		while(!st.isEmpty())
			reverseString.append(st.pop());
		System.out.println(reverseString.toString());
	}

}
