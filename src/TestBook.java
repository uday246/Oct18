import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private int noOfPages;
	private int noOfLastPage;

	public Book(String aTitle, String aAuthor, int aNoOfPages) {
		super();
		title = aTitle;
		author = aAuthor;
		noOfPages = aNoOfPages;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getNoOfLastPage() {
		return noOfLastPage;
	}

	public void setNoOfLastPage(int aNoOfLastPage) {
		noOfLastPage = aNoOfLastPage;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public double getFinishedPercentage() {
		return (noOfLastPage / (double) noOfPages) * 100;
	}

	public static void main(String[] args) {
		Book b = new Book("A", "B", 100);
		b.setNoOfLastPage(60);
		System.out.println(b.getFinishedPercentage());
	}
}

public class TestBook {
	public static void compareBooks(Book b1, Book b2) {
		if (b1.getFinishedPercentage() > b2.getFinishedPercentage()) {
			System.out.println(b1.getTitle());
		} else if (b1.getFinishedPercentage() < b2.getFinishedPercentage()) {
			System.out.println(b2.getTitle());
		} else {
			System.out.println("Wow its tie");
		}
	}

	public static void main(String[] args) {
		Book b1 = new Book("Building Java Programs", "Staurt Reges & Marty stepp", 1194);
		b1.setNoOfLastPage(586);
		System.out.println("Enter title of Book");
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		System.out.println("Enter author");
		String a = sc.next();
		System.out.println("Enter num of pages");
		int n = sc.nextInt();
		System.out.println("Enter last page");
		int l = sc.nextInt();
		Book b2 = new Book(t, a, n);
		b2.setNoOfLastPage(l);
		compareBooks(b1, b2);
	}
}
