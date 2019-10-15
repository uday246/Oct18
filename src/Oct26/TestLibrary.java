package Oct26;

class Book {
	private String title;
	private int noOfPages;
	private double rating;
	static int count = 0;

	public Book(String aTitle, int aNoOfPages, double aRating) {
		super();
		title = aTitle;
		noOfPages = aNoOfPages;
		rating = aRating;
		count++;
	}

	public void changeRating(double e) {
		if (e >= 0 && e <= 10)
			rating = e;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String aTitle) {
		title = aTitle;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int aNoOfPages) {
		noOfPages = aNoOfPages;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double aRating) {
		rating = aRating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", noOfPages=" + noOfPages + ", rating=" + rating + "]";
	}

	public static int bookCount() {
		return count;
	}
}

public class TestLibrary {
	public static void main(String[] args) {
		Book b1 = new Book("Book1", 10, 5);
		Book b2 = new Book("Book2", 15, 9);
		Book b3 = new Book("Book3", 19, 10);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		b1.changeRating(8);
		b2.changeRating(9);
		b3.changeRating(7);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}
}
