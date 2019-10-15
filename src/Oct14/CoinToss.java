
package Oct14;

import java.util.Random;

class CoinFlip {
	private String sideUp;

	public CoinFlip() {
		toss();
	}

	public void toss() {
		// generating random number, if it even return Heads else Tails
		if (new Random().nextInt(2) == 0)
			sideUp = "heads";
		else
			sideUp = "tails";
	}

	public String getSideUp() {
		return sideUp;
	}

}

public class CoinToss {
	public static void main(String[] args) {
		int headCount=0,tailCount=0;
		CoinFlip c= new CoinFlip();
		
		System.out.println("Initial Facing : "+c.getSideUp());
		for(int i=0;i<20;i++){
			c.toss();
			System.out.println(c.getSideUp());
			if(c.getSideUp().equalsIgnoreCase("Heads"))
				headCount++;
			else
				tailCount++;
		}
		System.out.println("Heads Count "+headCount);
		System.out.println("Tails Count "+tailCount);
		
	}
}

