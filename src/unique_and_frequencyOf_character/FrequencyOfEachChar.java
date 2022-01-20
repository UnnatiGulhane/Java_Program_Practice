package unique_and_frequencyOf_character;

public class FrequencyOfEachChar {
	int getFrequency(String str,char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(ch==str.charAt(index))
				count++;
		}
		return count;
	}
	void checkChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(index==str.indexOf(ch)) {
				System.out.println("Frequency of "+"\""+ch+"\""+getFrequency(str,ch));
			}
		}
	}
	public static void main(String[] args) {
		FrequencyOfEachChar frequency=new FrequencyOfEachChar();
		String str="technocredits";
		frequency.checkChar(str);
	}

}
