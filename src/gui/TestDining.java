package gui;

import java.util.ArrayList;

class Restaurant {
	private String name;
	private String foodType;

	public Restaurant(String aName, String aFoodType) {
		super();
		name = aName;
		foodType = aFoodType;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String aFoodType) {
		foodType = aFoodType;
	}

	

}

class Dining {
	ArrayList<Restaurant> list;

	public Dining() {
		list = new ArrayList<Restaurant>();
	}

	public void addRestaurant(String name, String foodType) {
		// store into arraylist of type Restaurant
		list.add(new Restaurant(name, foodType));
	}

	public void removeRestaurant(String name, String foodType) {
		int index=-1;
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getName().equalsIgnoreCase(name)) {
				index=i;
			}
		}
		if(index!=-1)
			list.remove(index);
	}

	public String foodType(String name) {
		String res = "";
		for (Restaurant r : list) {
			if (r.getName().equalsIgnoreCase(name)) {
				return r.getFoodType();
			}
		}
		return res;
	}
	public int numOfRestaurants(){
		return list.size();
	}
}

public class TestDining {
	public static void main(String[] args) {
		Dining d = new Dining();
		d.addRestaurant("Paradise", "Veg/Non veg"); // adding restaurant
		d.addRestaurant("Chutneys", "Veg");// adding restaurant
		System.out.println("No of restaurants : "+d.numOfRestaurants());
		System.out.println("Food type in Paradise : "+d.foodType("Paradise")); // removing restaurant
		d.removeRestaurant("Paradise", "Veg/Non veg"); 
		System.out.println("No of restaurants : "+d.numOfRestaurants());
		
		
	}
}
