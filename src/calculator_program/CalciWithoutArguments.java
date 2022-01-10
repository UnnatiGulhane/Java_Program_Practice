package calculator_program;

public class CalciWithoutArguments {
	int a=10;
	int b=8;
	void addition() {
		int sum=a+b;
		System.out.println("Addition is : "+sum);
	}
	
	void Substraction() {
		int sub=a-b;
		System.out.println("Substraction is : "+sub);
	}
	
	void Multiplication() {
		int mul=a*b;
		System.out.println("Multiplication is : "+mul);
	}
	
	void Division() {
		int div=a/b;
		System.out.println("Division is : "+div);
	}
	public static void main(String[] args) {
		CalciWithoutArguments calci=new CalciWithoutArguments();
		calci.addition();
		calci.Substraction();
		calci.Multiplication();
		calci.Division();// TODO Auto-generated method stub

	}

}
