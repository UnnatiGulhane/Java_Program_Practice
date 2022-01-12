package pallindrome_program;

public class StringPallindrome {
	void getPallindrome(String str) {
		String reverseString="";
		for(int index=str.length()-1;index>=0;index--) {
			reverseString+=str.charAt(index);
		}
		if(str.equals(reverseString)) {
			System.out.println(str+" is a pallindrome string");
		}
		else {
			System.out.println(str+" is not a pallindrome string");
		}
	}
	public static void main(String[] args) {
		StringPallindrome stringPallindrome = new StringPallindrome();
		stringPallindrome.getPallindrome("ananya");
		stringPallindrome.getPallindrome("malayalam");
		

	}

}
