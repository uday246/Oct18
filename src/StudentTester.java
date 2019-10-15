import java.util.ArrayList;

class Student{
	private int id;
	private String name;
	MTO m = new MTO();
	public Student(int aId, String aName) {
		id = aId;
		name = aName;
	}
	public int getId() {
		return id;
	}
	public void setId(int aId) {
		
		id = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	
}
class MTO
{
	private String model;
	private String type;
	private String option;
	public MTO(){
		
	}
	public MTO(String aModel, String aType, String aOption) {
		super();
		model = aModel;
		type = aType;
		option = aOption;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String aModel) {
		model = aModel;
	}
	public String getType() {
		return type;
	}
	public void setType(String aType) {
		type = aType;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String aOption) {
		option = aOption;
	}
	
	
	
}
public class StudentTester {
public static void main(String[] args) {
	int a[]=new int[10];
	String s="2.4";
	try{
		a[10]=10;
	}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	
	System.out.println("hello");
	System.out.println("hello");
	System.out.println("hello");
	System.out.println("hello");
	
}

private static ArrayList<MTO> getMTOList() throws Exception
{
	ArrayList<MTO> mlist=new ArrayList();
	MTO M1=new MTO("MOD1","TYP1","OPT1");
	MTO M2=new MTO("MOD2","TYP2","OPT2");
    MTO M3=new MTO("MOD3","TYP3","OPT3");
    mlist.add(M1);
    mlist.add(M2);
    mlist.add(M3);
   for(int i=0;i<mlist.size();i++)
	   System.out.println(mlist.get(i).getModel());
   
    return mlist;
}

private static ArrayList<Student> getAllStudents() {
	Student s1 = new Student(1,"Uday");
	Student s2 = new Student(2,"Bargavi");
	Student s3 = new Student(3,"Koti");
	
	ArrayList<Student> list = new ArrayList<Student>();
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(new Student(4,"Helo"));
for(Student s:list){
	System.out.println(s.getId());
}
	
	return list;
}

}
