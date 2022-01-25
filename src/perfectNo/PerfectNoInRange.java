package perfectNo;

public class PerfectNoInRange {
	void getNumber(int startRange,int endRange) {
		for(int index=startRange;index<=endRange;index++) {
			int sum=0;
			for(int index1=1;index1<index;index1++) {
				if(index%index1==0) {
					sum=sum+index1;
				}
			}
			if(sum==index)
				System.out.println(index+" is a perfect number");
			else
				System.out.println(index+" is not a perfect number");
		}
	}

	public static void main(String[] args) {
		PerfectNoInRange number=new PerfectNoInRange();
		number.getNumber(1, 10);

	}

}
