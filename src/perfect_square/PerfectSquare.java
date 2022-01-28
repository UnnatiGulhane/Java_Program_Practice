package perfect_square;

public class PerfectSquare {
	boolean isPerfectSquare(int num) {
		if(num>0) {
			int num1=(int) Math.sqrt(num);
			return ((num1*num1)==num);
		}
		return false;
	}
	
	void displayResult(int num) {
		if(isPerfectSquare(num)) {
			System.out.println(num+" is a perfect square");
		}
		else {
			System.out.println(num+" is not a perfect square");
		}
	}

	public static void main(String[] args) {
		PerfectSquare perfectSquare=new PerfectSquare();
		perfectSquare.displayResult(36);
		perfectSquare.displayResult(5);

	}

}
