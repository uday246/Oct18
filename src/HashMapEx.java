import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapEx {
public static void main(String[] args) {
	StudentPojo s1 = new StudentPojo("Uday",1,76);
	StudentPojo s2 = new StudentPojo("Koti",2,50);
	StudentPojo s3 = new StudentPojo("Test",3,90);
	
	
	
	ArrayList<StudentPojo>list = new ArrayList<StudentPojo>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	System.out.println(list);
	Collections.sort(list,new MyStudentComparator());
	System.out.println(list);
	
	
	
	HashMap<StudentPojo,Integer>map = new HashMap<StudentPojo,Integer>();
	map.put(s1, 1);
	map.put(s2, 2);
	map.put(s3, 3);
	List<Entry<StudentPojo,Integer>> list2 =  new ArrayList(map.entrySet());
	Collections.sort(list2, new MyMapComparator());
	/*TreeMap<StudentPojo,Integer>map1 = new TreeMap<StudentPojo,Integer>(map);
	System.out.println(map1);
	
	Set<Entry<StudentPojo, Integer>> en = map.entrySet();
	for(Entry<StudentPojo, Integer> e : en){
		System.out.println(e.getKey()+" : "+e.getValue());
	}*/
	
	
	
}
}
class MyStudentComparator implements Comparator{

	@Override
	public int compare(Object aArg0, Object aArg1) {
		StudentPojo s1 = (StudentPojo)aArg0;
		StudentPojo s2 = (StudentPojo)aArg1;
		if(s1.marks < s2.marks)
			return -1;
		else if (s1.marks > s2.marks)
			return 1;
		return 0;	
	}
	
}

class MyMapComparator implements Comparator{

	@Override
	public int compare(Object aArg0, Object aArg1) {
		Entry<StudentPojo, Integer> e1 = (Entry<StudentPojo, Integer>)aArg0;
		Entry<StudentPojo, Integer> e2 = (Entry<StudentPojo, Integer>)aArg1;
		return e1.getKey().name.compareTo(e2.getKey().name);
		
	}
	
}

class StudentPojo implements Comparable{
	String name;
	int id;
	int marks;
	static final int iii=10;
	public StudentPojo(String aName, int aId, int aMarks) {
		super();
		name = aName;
		id = aId;
		marks = aMarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPojo other = (StudentPojo) obj;
		if (id != other.id)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentPojo [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
}