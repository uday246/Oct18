package oct3rd;

import java.util.Scanner;

public class BossReport {

	public static void main(String[] args) {

		int index = 1;

		String bossName, abilityType;

		// storing the 5 boss objects in an array

		Boss[] bosses = new Boss[5];

		// scanner object to read the inputs from the user

		Scanner input = new Scanner(System.in);

		// looping 5 times to take input for 5 Boss objects

		while (index < 6) {

			int damage = 0;

			int health = 0;

			int currency = 0;

			bossName = "";

			abilityType = "";

			// Asks user to enter boss name here and reads the input

			System.out.println("Enter " + index + " Boss Name ");

			bossName = input.next();

			// the below line converts to upper case and truncates input to 8
			// characters

			bossName = bossName.length() > 8 ? bossName.substring(0, 8).toUpperCase() : bossName.toUpperCase();

			// Ask user to enter ability name

			System.out.println("Enter " + index + " Ability Type (fire breath, slash, magical, etc.) ");

			abilityType = input.next();

			// the below line converts to upper case and truncates input to 8
			// characters

			abilityType = abilityType.length() > 8 ? abilityType.substring(0, 8).toUpperCase()
					: abilityType.toUpperCase();

			// while loop to keep on asking user to enter damage between 25 and
			// 50

			while (damage < 25 || damage > 50) {

				System.out.println("Enter " + index + " Damage ( 25-50) :");

				damage = input.nextInt();

			}

			// while loop to keep on asking user to enter health between 500 and
			// 999

			while (health < 500 || health > 999) {

				System.out.println("Enter " + index + " Health ( 500-999) :");

				health = input.nextInt();

			}

			// while loop to keep on asking user to enter health between 750 and
			// 999

			while (currency < 750 || currency > 999) {

				System.out.println("Enter " + index + " Currency ( 750-999) :");

				currency = input.nextInt();

			}

			// creates a new Boss object and adds to the bossess array created
			// earlier

			bosses[index - 1] = new Boss(bossName, abilityType, damage, health, currency);

			index += 1;

		}

		input.close();

		// iterates all the 5 objects and calls the toString method of the Boss
		// object

		for (int i = 0; i < 5; i++) {

			System.out.println(bosses[i]);

		}

	}

}	// This is my other class

class Boss
{

// instance variables set as private data type

private String bossName;

private String ability;

private int damage;

private int health;

private int currency;

//Single constructor class which take all the 5 properties to create Boss object

public Boss(String name, String ab, int damage, int health, int currency) {

this.bossName=name;

this.ability=ab;

this.damage=damage;

this.health=health;

this.currency=currency;

}

// get method for Boss Name

public String getBossName() {

return bossName;

}

// get method for Ability Name

public String getAbilityType() {

return ability;

}

// get method for damage

public int getDamage() {

return damage;

}

// get method for health

public int getHealth() {

return health;

}

// get method for currency

public int getCurrency() {

return currency;

}

// setter method to set new name

public void setBossName(String name) {

this.bossName=name.length()>8?name.toUpperCase().substring(0, 7):name.toUpperCase();

}

// setter method to set ability type

public void setAbility(String theability) {

ability=theability.trim();

}

// setter method to set damage

public void setDamage(int thedamage) {

if (thedamage<25 || thedamage>50) {

System.out.println("Damage cannot be more than 50 or less than 25");

}

else {

this.damage=thedamage;

}

}

// setter method to set health

public void setHealth(int thehealth) {

if(thehealth<500 || thehealth>999) {

System.out.println("Health cannot be less than 500 Or greater than 999");

}

else {

this.health=thehealth;

}

}

// setter method to set currency

public void setCurrency(int thecurrency) {

if(thecurrency<750 || thecurrency>999) {

System.out.println("Currency cannot be less than 750 Or greater than 999");

}else {

this.currency=thecurrency;

}

}

//Overrides the toString method

public String toString() {

return String.format("%-9s", bossName).replace(' ', ' ')+String.format("%-9s", ability).replace(' ', ' ')+String.format("%3d", damage).replace(' ', ' ')+String.format("%4d",health).replace(' ', ' ') + String.format("%4d",currency).replace(' ', ' ');

}

}
