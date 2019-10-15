
public class FilterString {
public static String filterIn(String w,String list){
	String res="";
	for(int i=0;i<w.length();i++){
		if(list.contains(w.charAt(i)+"")){
			res+=w.charAt(i);
		}
	}
	return res;
}
public static void main(String[] args) {
	System.out.println(filterIn("I love Ariana Grande", "Marron5"));

}

}
