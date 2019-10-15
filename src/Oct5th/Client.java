package Oct5th;

import java.util.Random;

class Coin {
	private int value;
	private String sideUp;

	public Coin(int aValue) {
		super();
		if (aValue == 5 || aValue == 10 || aValue == 25)
			value = aValue;
		else
			value = 1;
	}

	public void toss() {
		// generating random number, if it even return Heads else Tails
		if (new Random().nextInt() % 2 == 0)
			sideUp = "Heads";
		else
			sideUp = "Tails";
	}

	public String getSideUp() {
		return sideUp;
	}

	public int getValue() {
		return value;
	}
}

public class Client {
	public static void main(String[] args) {
		int weight=0;
		Coin c1 = new Coin(5);
		Coin c2 = new Coin(10);
		Coin c3 = new Coin(25);
		// loop untill it reaches 100
		while(weight<100){
			c1.toss();
			c2.toss();
			c3.toss();
			if(c1.getSideUp().equals("Heads"))
				weight+=c1.getValue();
			if(c2.getSideUp().equals("Heads"))
				weight+=c2.getValue();
			if(c3.getSideUp().equals("Heads"))
				weight+=c3.getValue();
			
		}
		System.out.println(weight);
		if(weight==100)
			System.out.println("You won");
		else
			System.out.println("You Loose");
	}
}
