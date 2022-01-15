package string_reverse;

public class StringReverse {
	String getReverseString(String str) {
		String reverseString="";
		for(int index=str.length()-1;index>=0;index--) {
			reverseString+=str.charAt(index);
		}
		return reverseString;
	}

	public static void main(String[] args) {
		StringReverse stringReverse=new StringReverse();
		String str="globalwarming";
		System.out.println("Reverse of string "+"\""+str+"\""+" is :");
		System.out.println(stringReverse.getReverseString("globalwarming"));

	}

}
