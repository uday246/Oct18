package Oct16;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.Scanner;

public class DriverClass {

//not enough time to add comments..hope you understand...

public static void main(String[] args) throws IOException {

Scanner scan = new Scanner(System.in);

BufferedReader br = null;

Books books;

ArrayList<Books> ar = new ArrayList<>();

// Adding sample Data to the array list

Books b0 = new Books("First Book", "author,one", "123-1234512345", 4.5, 1);

b0.setAverageRating(4.5);

Books b1 = new Books("Second Book", "author,two", "456-1234512345", 4.7, 1);

b1.setAverageRating(4.7);

Books b2 = new Books("Third Book", "author,three", "789-1234512345", 3.4, 1);

b2.setAverageRating(3.4);

ar.add(b0);

ar.add(b1);

ar.add(b2);

System.out.println("Choose a menu option from the list below: ");

System.out.println("\r\n" + "Choose a menu option from the list below:\r\n"

+ " 1: Load book data from a file \r\n" + " 2: Add one new book \r\n" + " 3: Rate one book \r\n"

+ " 4: Get recommendations \r\n" + " 5: Print the full book list \r\n" + " 6: Exit the software");

try {

int option = scan.nextInt();

while (option != 6) {

switch (option) {

case 1:

System.out.println("Enter the file name(for eg., Books)");

String bookName = scan.next();

if (bookName.equals("Books")) {

loadBookData(br, bookName);

} else {

System.out.println("File for" + bookName + " found!!!!!!!!");

}

break;

case 2:

System.out.println("Enter the book title:");

scan.nextLine();

String bookTitle = scan.nextLine();

System.out.println("Enter the author(lastName,firstName with no spaces)");

String author = scan.next();

System.out.println("Enter the 13 digit ISBN: ");

String isbnNo = scan.next();

addNewBook(bookTitle, author, isbnNo, ar);

break;

case 3:

System.out.println("Enter the ISBN: ");

String isbn = scan.next();

boolean found = false;

for (Books book : ar) {

if (book.getIsbn().equals(isbn)) {

System.out.println("Enter the rating: ");

double rating = scan.nextDouble();

rateBook(ar, isbn, rating, book);

found = true;

break;

}

}

if (found) {

System.out.println("The record for " + isbn + " was updated");

} else {

System.out.println("The record for " + isbn + " was not found");

}

break;

case 4:

Collections.sort(ar, new SortClass());

for (Books book : ar) {

System.out.println(String.format("%1$-18f %2$-10d %3$-10s %4$-10s %5$-10s", book.getAverageRating(),

book.getNoOfReviews(), book.getIsbn(), book.getAuthor(), book.getTitle()));

}

break;

case 5:

for (Books book : ar) {

System.out.println(String.format("%1$-18f %2$-10d %3$-10s %4$-10s %5$-10s", book.getRating(),

book.getNoOfReviews(), book.getIsbn(), book.getAuthor(), book.getTitle()));

}

break;

default:

System.out.println("please select a proper option!!!");

break;

}

System.out.println("Enter an option:");

option = scan.nextInt();

}

} finally {

if (br != null)

br.close();

System.out.println("Exiting the program...");

}

}

static void loadBookData(BufferedReader br, String bookName) throws IOException {

br = new BufferedReader(new FileReader(bookName + ".txt"));

StringBuilder sb = new StringBuilder();

String line = br.readLine();

while (line != null) {

sb.append(line);

sb.append(System.lineSeparator());

line = br.readLine();

}

String everything = sb.toString();

System.out.println(everything);

}

static void addNewBook(String title, String author, String isbn, ArrayList<Books> ar) {

Books books = new Books();

books.setAuthor(author);

books.setTitle(title);

books.setIsbn(isbn);

ar.add(books);

}

static void rateBook(ArrayList<Books> ar, String isbn, double rating, Books book) {

int reviews=0;

for (Books books : ar) {

if (book.getIsbn().equals(isbn)) {

book.setRating(rating);

reviews=book.getNoOfReviews();

}

}

book.setNoOfReviews(++reviews);

double averageRating=0.0;

for (Books books : ar) {

if (book.getIsbn().equals(isbn)) {

averageRating+=book.getRating();

averageRating/=book.getNoOfReviews();

}

}

book.setAverageRating(averageRating);

}

}

class SortClass implements Comparator<Books> {

@Override

public int compare(Books o1, Books o2) {

return o1.getRating() == o2.getRating() ? 0 : o1.getRating() < o2.getRating() ? 1 : -1;

}

}


class Books {

private String title;

private String author;

private String isbn;

private double rating;

private int noOfReviews;

private double averageRating;

public Books() {

super();

}

@Override

public String toString() {

return "Books [title=" + title + ", author=" + author + ", isbn=" + isbn + ", rating=" + rating

+ ", noOfReviews=" + noOfReviews + "]";

}

public Books(String title, String author, String isbn, double rating, int noOfReviews) {

super();

this.title = title;

this.author = author;

this.isbn = isbn;

this.rating = rating;

this.noOfReviews = noOfReviews;

}

public String getTitle() {

return title;

}

public void setTitle(String title) {

this.title = title;

}

public String getAuthor() {

return author;

}

public void setAuthor(String author) {

this.author = author;

}

public String getIsbn() {

return isbn;

}

public void setIsbn(String isbn) {

this.isbn = isbn;

}

public double getRating() {

return rating;

}

public void setRating(double rating) {

this.rating = rating;

}

public int getNoOfReviews() {

return noOfReviews;

}

public void setNoOfReviews(int noOfReviews) {

this.noOfReviews = noOfReviews;

}

public double getAverageRating() {

return averageRating;

}

public void setAverageRating(double averageRating) {

this.averageRating = averageRating;

}

}
