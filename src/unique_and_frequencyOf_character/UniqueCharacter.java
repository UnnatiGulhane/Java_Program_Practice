package unique_and_frequencyOf_character;

public class UniqueCharacter {
	void getUniqueCharacter(String str) {
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
		
	}

	public static void main(String[] args) {
		String str="technocredits";
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		System.out.println("Unique characters from "+"\""+str+"\"");
		uniqueCharacter.getUniqueCharacter(str);
		

	}

}
