package Oct14;

public class VowelCount {
	public static void main(String[] args) {
		String str="hello How are you";
		String vowels="aeiouAEIOU";
		int count=0;
		for(int i=0;i<str.length();i++)
			if(vowels.contains(str.charAt(i)+"")){
				count++;
			}
	System.out.println("Vowels in given String : "+count);
	}
	
}
