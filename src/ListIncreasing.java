
public class ListIncreasing {
public static void main(String[] args) {
	int test[] = {-98, -87,0, 1, 2, 3, 4, 50, 1000000, 1111001111, 10 , 9, 8, 7 , 0, -3, -2 };
	int i=0;
	// looping to find where the point in exist
	for(i=0;i<test.length-1;i++)
	{
		if(!(test[i]<test[i+1]))
			break;
	}
	i++;
	System.out.println("list fluctuation point is number : "+test[i]+" at index : "+i);
	
}
}
