//reverse string in array at same position
package string_reverse;

public class ReverseStringInArray {
	String getReverseString(String str) {
		String reverseString="";
		for(int index=str.length()-1;index>=0;index--) {
			reverseString+=str.charAt(index);
		}
		return reverseString;
		
	}
	String[] getArray(String[] arr) {
		String[] output=new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index]=getReverseString(arr[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] arr= {"unnati","gauri","rashmi","harsha"};
		ReverseStringInArray reverse=new ReverseStringInArray();
		String[] output=reverse.getArray(arr);
		System.out.println("Reverse of string in array at same position is : ");
		for(int index=0;index<output.length;index++) {
			System.out.print(output[index]+" ");
		}
	}

}
