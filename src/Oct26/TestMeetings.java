package Oct26;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Date {
	private int year;
	private int month;
	private int day;
	private int time;

	public Date() {

	}

	public Date(int aYear, int aMonth, int aDay, int aTime) {
		super();
		year = aYear;
		month = aMonth;
		day = aDay;
		time = aTime;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int aMonth) {
		month = aMonth;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int aDay) {
		day = aDay;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int aTime) {
		time = aTime;
	}

	@Override
	public String toString() {
		return day + " : " + month + " : " + year + " : " + time;
	}

}

class Meeting {
	private Date date;
	private String topic;
	private String place;

	public Meeting() {

	}

	public Meeting(Date aDate, String aTopic, String aPlace) {
		super();
		date = aDate;
		topic = aTopic;
		place = aPlace;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date aDate) {
		date = aDate;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String aTopic) {
		topic = aTopic;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String aPlace) {
		place = aPlace;
	}

	@Override
	public String toString() {
		return "Meeting [date=" + date + ", topic=" + topic + ", place=" + place + "]";
	}

}

public class TestMeetings {
	public static void main(String[] args) throws Exception {
		Meeting m1 = new Meeting();
		Meeting m2 = new Meeting();
		Meeting m3 = new Meeting();
		m1 = getMeetingDetails();
		m2 = getMeetingDetails();
		m3 = getMeetingDetails();
		Meeting m4 = shallowCopy(m1);
		Meeting m5 = deepCopy(m1);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		m1.setDate(new Date(10, 10, 2018, 16));
		m2.setPlace("Test1");
		m3.setTopic("Sports");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		PrintWriter pw = new PrintWriter(new FileWriter("meetings.txt"));
		pw.println(m1);
		pw.println(m2);
		pw.println(m3);
		pw.println(m4);
		pw.println(m5);

	}

	private static Meeting deepCopy(Meeting m) {
		Meeting t = new Meeting();
		Date d = new Date();
		t.setPlace(m.getPlace());
		t.setTopic(m.getTopic());
		d.setDay(m.getDate().getDay());
		d.setMonth(m.getDate().getMonth());
		d.setYear(m.getDate().getYear());
		d.setTime(m.getDate().getTime());
		t.setDate(d);
		return m;
	}

	private static Meeting shallowCopy(Meeting aM1) {
		Meeting t = new Meeting();
		t.setPlace(aM1.getPlace());
		t.setTopic(aM1.getTopic());
		t.setDate(aM1.getDate());
		return t;
	}

	private static Meeting getMeetingDetails() {
		Meeting t = new Meeting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter meeting place");
		t.setPlace(sc.nextLine());
		System.out.println("Enter meeting topic");
		t.setTopic(sc.nextLine());
		System.out.println("Enter meeting date and time (day,month,year,time");
		Date d = new Date();
		d.setDay(sc.nextInt());
		d.setMonth(sc.nextInt());
		d.setYear(sc.nextInt());
		d.setTime(sc.nextInt());
		t.setDate(d);
		return t;
	}
}
