package factorial_program;

public class FactorialPrgm {
	
	void getFactorial(int number) {
		int factorial=1;
		for(int index=1;index<=number;index++) {
			factorial=factorial*index;
		}
		System.out.println("Factorial of "+"\""+number+"\""+" is "+factorial);
	}

	public static void main(String[] args) {
		FactorialPrgm factorialPrgm = new FactorialPrgm();
		factorialPrgm.getFactorial(10);

	}

}
