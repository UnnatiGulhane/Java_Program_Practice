package string_length;

public class lengthOfStringInArray {
	int[] stringLength(String[] arr) {
		int[] output=new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index]=arr[index].length();
		}
		return output;
	}

	public static void main(String[] args) {
		String[] arr= {"shreya","unnati","rashmi","harsha","gauri"};
		lengthOfStringInArray length=new lengthOfStringInArray();
		int[] output=length.stringLength(arr);
		System.out.println("Length of each string in array is: ");
		for(int index=0;index<output.length;index++) {
			System.out.print(output[index]+" ");
		}
		
	}

}
