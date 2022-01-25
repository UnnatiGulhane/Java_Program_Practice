package perfectNo;

public class PerfectNumber {
	void getNumber(int number) {
		int sum=0;
		for(int index=1;index<number;index++) {
			if(number%index==0)
			  sum=sum+index;
		}
		if(sum==number) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" is not a perfect number");
		}
	}

	public static void main(String[] args) {
		PerfectNumber perfectNumber=new PerfectNumber();
		perfectNumber.getNumber(6);
		perfectNumber.getNumber(11);

	}

}
