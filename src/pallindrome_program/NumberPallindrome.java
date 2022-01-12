package pallindrome_program;

public class NumberPallindrome {
	void getPallindrome(int number) {
		int pallindrome=number;
		int reverse=0;
		while(pallindrome!=0) {
			int remainder=pallindrome%10;
			reverse=reverse*10+remainder;
			pallindrome=pallindrome/10;
		}
		if(number==reverse) {
			System.out.println(number+" is a pallindrome number");
		}
		else {
			System.out.println(number+" is not a pallindrome number");
		}
		
	}

	public static void main(String[] args) {
		NumberPallindrome numberPallindrome=new NumberPallindrome();
		numberPallindrome.getPallindrome(1221);
		numberPallindrome.getPallindrome(2345);

	}

}
