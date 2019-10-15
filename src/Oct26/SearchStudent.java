package Oct26;

public class SearchStudent {
public static void main(String[] args) {
	String name[]={"Smith","jack","peter","Roz"};
	int id[]={1,2,3,4};
	System.out.println(findStudent(id, name, 3));
	System.out.println(findStudent(id, name, 13));
	
	
}
public static  String  findStudent(int []idArr,String name[],int id){
	for(int i=0;i<name.length;i++)
		if(idArr[i]==id)
			return name[i];
	return null;
}
}
