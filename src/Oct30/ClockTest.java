package Oct30;

class Clock {
	private int hour;
	private int min;
	private int sec;

	public int getHour() {
		return hour;
	}

	public void setHour(int aHour) {
		if(aHour>=1 && aHour<=12)
			hour = aHour;
		else
			System.out.println("Invalid Hour");
	}

	public int getMin() {
		return min;
	}

	public void setMin(int aMin) {
		if(aMin>=0 && aMin<=59)
			min = aMin;
		else
			System.out.println("Invalid min");
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int aSec) {
		if(aSec>=0 && aSec<=59)
		sec = aSec;
		else
		System.out.println("Invalid sec");
	}

	public Clock() {
		hour = 0;
		min = 0;
		sec = 0;
	}

	public Clock(int aHour, int aMin, int aSec) {
		super();
		hour = aHour;
		min = aMin;
		sec = aSec;
	}

	public String toString() {
		String str = "";
		if (hour < 10) {
			str = "0" + hour;
		} else {
			str = "" + hour;
		}
		str += " : ";
		if (min < 10) {
			str += "0" + min;
		} else {
			str += "" + min;
		}
		str += " : ";

		if (sec < 10) {
			str += "0" + sec;
		} else {
			str += "" + sec;
		}

		return str;
	}

	public void tick() {
		sec++;
		min = min + sec / 60;
		sec = sec % 60;
		hour = hour + min / 60;
		min = min % 60;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
		result = prime * result + sec;
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
		Clock other = (Clock) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		if (sec != other.sec)
			return false;
		return true;
	}

}

public class ClockTest {
	public static void main(String[] args) {
		Clock c = new Clock();
		System.out.println(c);
		c.setHour(4);
		c.setMin(8);
		c.setSec(5);
		System.out.println(c);
		System.out.println("Hour : " + c.getHour());
		System.out.println("Min : " + c.getMin());
		System.out.println("Sec : " + c.getSec());
		c.setHour(11);
		c.setMin(59);
		c.setSec(59);
		System.out.println(c);
		c.tick();
		System.out.println(c);
		Clock c1 = new Clock(12, 0, 0);
		if (c1.equals(c))
			System.out.println("Times are equal");
		else
			System.out.println("Times are not equal");
	}
}
