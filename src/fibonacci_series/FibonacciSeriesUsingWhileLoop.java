package fibonacci_series;

public class FibonacciSeriesUsingWhileLoop {
	int firstNo=0;
	int secondNo=1;
	void getFibonacciSeries(int num) {
		int i=1;
		while(i<=num) {
			System.out.print(firstNo+", ");
			int thirdNo=firstNo+secondNo;
			firstNo=secondNo;
			secondNo=thirdNo;
			i++;
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesUsingWhileLoop fibonacci=new FibonacciSeriesUsingWhileLoop();
		System.out.println("Fibonacci series :");
		fibonacci.getFibonacciSeries(8);

	}

}
