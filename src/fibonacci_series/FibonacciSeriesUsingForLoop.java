package fibonacci_series;

public class FibonacciSeriesUsingForLoop {
	int num=10;
	int firstNo=0;
	int secondNo=1;
	void getFibonacciSeries() {
		for(int index=1;index<=num;index++) {
			System.out.print(firstNo+", ");
			int thirdNo=firstNo+secondNo;
			firstNo=secondNo;
			secondNo=thirdNo;
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesUsingForLoop fibonacci=new FibonacciSeriesUsingForLoop();
		System.out.println("Fibonacci series uptil 10 is :");
		fibonacci.getFibonacciSeries();
	}

}
