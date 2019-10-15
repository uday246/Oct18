import java.util.HashMap;
public class HashMapSalaries {

	public static void main(String[] args) {
		// creating Hasmap
		HashMap<String,Integer> salaries=new HashMap<String,Integer>();
		// putting the values into map
		salaries.put("David", 45600);
		salaries.put("Doris", 55000);
		salaries.put("Marco", 76000);
		salaries.put("Lisa", 59000);
		// deleting Macro from map
		salaries.remove("Marco");
		// chaning value of doris to 65000
		salaries.put("Doris", 65000);
		// clearing the map
		salaries.clear();
		//  checking if map contains mary
		if(salaries.containsKey("mary"))
		{
			System.out.println("true");
		}
		else{
			System.out.println("mary does not exist");
		}

	}

}
