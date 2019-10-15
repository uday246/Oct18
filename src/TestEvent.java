import java.util.Scanner;

class Event {
	private int hours;
	private int min;
	private int sec;
	int amountOfTime;

	public int getHours() {
		return hours;
	}

	public void setHours(int aHours) {
		hours = aHours;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int aMin) {
		min = aMin;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int aSec) {
		sec = aSec;
	}

	public Event() {

	}

	public Event(int aHours, int aMin, int aSec) {
		super();
		hours = aHours;
		min = aMin;
		sec = aSec;
	}

	public void printEndTime() {
		// converting the min into hours
		int temp = min + amountOfTime;
		
		hours = hours + temp / 60;
		hours%=23;
		// converting the remaining minutes
		min = amountOfTime % 60;
		// displaying time in 24hrs format
		System.out.println(hours + " : " + min + " : " + sec);
	}

}

public class TestEvent {
	public static void main(String[] args) {
		Event e1 = new Event();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the event starting time hours , min , sec");
		e1.setHours(sc.nextInt());
		e1.setMin(sc.nextInt());
		e1.setSec(sc.nextInt());
		// reading the totalamount of time in minutes
		System.out.println("enter amout of event time in min");
		e1.amountOfTime = sc.nextInt();
		e1.printEndTime();
	}
}