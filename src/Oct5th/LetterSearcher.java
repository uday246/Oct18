package Oct5th;

public class LetterSearcher {
	private String str;

	public LetterSearcher(String aStr) {
		// assigning first char
		str = aStr.charAt(0)+"";
	}
	public int letterCount(String phrase){
		int count=0;
		// looping through the string
		for(int i=0;i<phrase.length();i++){
			// if matches increase count
			if(phrase.charAt(i)==str.charAt(0))
				count++;
		}
		return count;
	}
	public int doubleIndex(String phrase){
		for(int i=0;i<phrase.length()-1;i++){
			// if char occurs consecutively return i
			if(phrase.charAt(i)==str.charAt(0) && phrase.charAt(i+1)==str.charAt(0))
				return i;
		}
		return -1;
	}
	public String getLetter(){
		return str;
	}
	public static void main(String[] args) {
		LetterSearcher ls = new LetterSearcher("p");
		System.out.println(ls.letterCount("Apples are best"));
		System.out.println(ls.doubleIndex("Apples are best"));
		System.out.println(ls.getLetter());
	}
}
