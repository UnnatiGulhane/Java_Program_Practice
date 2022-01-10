package calculator_program;

public class CalciWithArguments {
	void addition(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	
	void substraction(int a,int b) {
		System.out.println("substraction is : "+(a-b));
	}
	
	void multiplication(int a,int b) {
		System.out.println("Multiplication is : "+(a*b));
	}
	
	void division(int a,int b) {
		System.out.println("Division is : "+(a/b));
	}

	public static void main(String[] args) {
		CalciWithArguments calci=new CalciWithArguments();
		calci.addition(2, 4);// TODO Auto-generated method stub
		calci.substraction(10, 2);
		calci.multiplication(3, 5);
		calci.division(18, 9);
	}

}
