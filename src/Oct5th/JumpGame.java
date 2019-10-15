package Oct5th;

public class JumpGame {
public static void main(String[] args) {
	int arr[] = {2, 4, 1, 0, 3, 2};
	System.out.println(jumpGame(arr));
}
public static boolean jumpGame(int[] a){
	int index=0;
	for(int i=0;i<a.length;i++){
		index=a[i];
		if(index>=a.length)
			return true;
		if(a[index]==0)
			i = i+ (index-1);
		else
			i+=index;
		
	}
	return false;
}
}
