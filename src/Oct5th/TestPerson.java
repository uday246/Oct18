package Oct5th;
class Person{
	private int age;
	private String type;
	
	public Person(int aAge, String aType) {
		super();
		age = aAge;
		type = aType;
	}
	public Person(){
		
	}
	public Person(int aAge) {
		super();
		age = aAge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int aAge) {
		age = aAge;
	}
	
}
class Toddler extends Person{
	public Toddler(){
		
	}
	public Toddler(int age){
		super(age,"toddler");
	}
}
public class TestPerson {

}
