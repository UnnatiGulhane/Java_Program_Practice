package fibonacci_series;

import java.util.Scanner;

public class FibonacciSeriesUsingScanner {
	int firstNo=0;
	int secondNo=1;
	void getFibonacciSeries(int num) {
		for(int index=1;index<=num;index++) {
			System.out.print(firstNo+", ");
			int thirdNo=firstNo+secondNo;
			firstNo=secondNo;
			secondNo=thirdNo;
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers you want in the sequence");
		int count=scanner.nextInt();
		System.out.println("Fibonacci series of "+count+" numbers is :");
		FibonacciSeriesUsingScanner fibonacci=new FibonacciSeriesUsingScanner();
		fibonacci.getFibonacciSeries(count);
		
	}

}
