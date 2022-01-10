package prime_number;

public class PrimeNumber {
	int totalCount=0;
	int primeSum=0;
	int primeAverage;
	void isPrime(int number) {
		boolean status=true;
		for(int index=2;index<=number;index++) {
			if(number%2==0) {
				status=false;
				System.out.println(number+" is not a prime number");
				break;
			}
		}
		if(status) {
			totalCount++;
			primeSum+=number;
			primeAverage=primeSum/totalCount;
			System.out.println(number+" is a prime number");
		}
	}
	
	void primeNumbersInRange(int startRange,int endRange) {
		System.out.println("Prime numbers between "+"\""+startRange+"\""+" and "+"\""+endRange+"\""+" are :");
		for(int index=startRange;index<=endRange;index++) {
			isPrime(index);
		}
	}
	
	void getTotalPrimeNo() {
		System.out.println("total prime numbers are : "+totalCount);
	}
	
	void getPrimeSum() {
		System.out.println("Sum of prime numbers are : "+primeSum);
	}
	
	void getPrimeAverage() {
		System.out.println("Average of prime numbers are : "+primeAverage);
	}
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(5);
		primeNumber.primeNumbersInRange(100, 110);
		primeNumber.getTotalPrimeNo();
		primeNumber.getPrimeSum();
		primeNumber.getPrimeAverage();

	}

}
