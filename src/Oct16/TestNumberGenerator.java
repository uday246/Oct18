package Oct16;

import java.util.ArrayList;
import java.util.Random;

class NumberGenerator {
	private int min;
	private int max;

	public NumberGenerator() {
		min = 0;
		max = 0;
	}

	public NumberGenerator(int aMin, int aMax) {
		super();
		min = aMin;
		max = aMax;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int aMin) {
		min = aMin;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int aMax) {
		max = aMax;
	}

	public int getNewRandomNumber() {
		Random r = new Random();
		if (min == 0 && max == 0)
			return r.nextInt();
		else
			return r.nextInt(max - min + 1) + min;
	}
}

class UniqueNumberGEnerator extends NumberGenerator {
	private ArrayList<Integer> numsUsed = new ArrayList<Integer>();

	public UniqueNumberGEnerator() {
		super(0, 0);
	}

	public UniqueNumberGEnerator(int aMin, int aMax) {
		super(aMin, aMax);
	}

	public int getNewRandomNumber() {
		Random r = new Random();
		int temp = 0;
		do {
			if (getMin() == 0 && getMax() == 0)
				temp = r.nextInt();
			else
				temp = r.nextInt(getMax() - getMin() + 1) + getMin();
		} while (numsUsed.contains(temp));
		numsUsed.add(temp);
		return temp;
	}
}

public class TestNumberGenerator {
	public static void main(String[] args) {
		NumberGenerator num = new UniqueNumberGEnerator(1,1000);
		for (int i = 0; i < 10; i++)
			System.out.println(num.getNewRandomNumber());
	}
}
