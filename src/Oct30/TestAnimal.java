package Oct30;

class Animal {
	private String name;
	private int count;

	public Animal(String aName) {
		super();
		name = aName;
		count = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int aCount) {
		count = aCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", count=" + count + "]";
	}

}

public class TestAnimal {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		ArrayList<Animal> list = new ArrayList<Animal>();
		String str = "";
		while (!str.equalsIgnoreCase("quit")) {
			System.out.println("Enter animal name or quit");
			str = sc.nextLine();
			Animal a = new Animal(str);
			if (list.contains(a)) {
				int count = list.get(list.indexOf(a)).getCount();
				count++;
				list.get(list.indexOf(a)).setCount(count);
			} else {
				list.add(a);
			}
		}
		for (Animal a : list) {
			System.out.println(a);
		}*/
	}
}
