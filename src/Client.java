
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	static Scanner scanner;

	public static void main(String[] args) {
		try {
			DataFileReader dataFileReader = new DataFileReader("data.txt");
			// reading data from input file
			dataFileReader.loadDataFromFile();
			scanner = new Scanner(System.in);
			int choice = -1;
			// Looping until user chooses to quit
			while (choice != 4) {
				printMenu();
				try {
					choice = Integer.parseInt(scanner.nextLine());
					if (choice == 1) {
						// displaying the list
						dataFileReader.printList();
					} else if (choice == 2) {
						// adding filter
						System.out.println("Enter the filter to be added");
						String fltr = scanner.nextLine();
						// splitting the input using whitespaces into string
						// array
						String[] splittedValues = fltr.split(" ");
						// verifying the input has 3 fields
						if (splittedValues.length == 3) {
							String field = splittedValues[0]; // ex: rating
							String relation = splittedValues[1]; // ex: >
							String target = splittedValues[2]; // ex: 3
							// validating and creating the filter
							Filter filter = validateFilter(field, relation, target);
							if (filter == null) {
								System.out.println("filter not added");
							} else {
								// applying the filter
								dataFileReader.applyFilter(filter);
								System.out.println("Filter applied");
							}
						} else {
							System.out.println("Invalid filter");
						}
					} else if (choice == 3) {
						// removing filter
						System.out.println("Enter the filter to be removed");
						String fltr = scanner.nextLine();
						String[] splittedValues = fltr.split(" ");
						if (splittedValues.length == 3) {
							String field = splittedValues[0];
							String relation = splittedValues[1];
							String target = splittedValues[2];
							Filter filter = validateFilter(field, relation, target);
							if (filter == null) {
								System.out.println("filter not removed");
							} else {
								if (dataFileReader.removeFilter(filter)) {
									System.out.println("Filter removed");
								} else {
									System.out.println("Filter not found!");
								}
							}
						} else {
							System.out.println("Invalid filter");
						}
					}
				} catch (Exception e) {
					System.out.println("Enter a valid choice..");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * method to validate a filter entered by the user
	 * 
	 * @param field
	 *            - which field
	 * @param relation
	 *            - type of relation (=,>,<)
	 * @param target
	 *            - target value
	 * @return a Filter object if the filter is valid, else null
	 */
	public static Filter validateFilter(String field, String relation, String target) {
		Filter filter = null;
		if (field.equalsIgnoreCase("year")) {
			if (relation.equals("<") || relation.equals(">") || relation.equals("=")) {
				try {
					int year = Integer.parseInt(target);
					if (year < 0) {
						throw new Exception();
					} else {
						filter = new Filter(field, relation, target);
					}
				} catch (Exception e) {
					System.out.println("Invalid year");
				}
			} else {
				System.out.println("Invalid relation");
			}
		} else if (field.equalsIgnoreCase("rating")) {
			if (relation.equals("<") || relation.equals(">") || relation.equals("=")) {
				try {
					double rating = Double.parseDouble(target);
					if (rating < 0) {
						throw new Exception();
					} else {
						filter = new Filter(field, relation, target);
						// dataFileReader.applyFilter(filter);
					}
				} catch (Exception e) {
					System.out.println("Invalid rating");
				}
			} else {
				System.out.println("Invalid relation");
			}
		} else if (field.equalsIgnoreCase("genre")) {
			if (relation.equals("=")) {
				if (target.equalsIgnoreCase("movie") || target.equalsIgnoreCase("series")) {
					filter = new Filter(field, relation, target);
				} else {
					System.out.println("Invalid genre");
				}
			} else {
				System.out.println("Invalid relation");
			}
		} else if (field.equalsIgnoreCase("title")) {
			if (relation.equals("=")) {
				filter = new Filter(field, relation, target);
			} else {
				System.out.println("Invalid relation");
			}
		}
		return filter;
	}

	// method to display the menu
	public static void printMenu() {
		System.out.println("1. Display the list");
		System.out.println("2. Apply a filter");
		System.out.println("3. Remove a filter");
		System.out.println("4. Quit");
		System.out.println(" Enter your choice");
	}
}

class DataFileReader {
	Scanner scanner;
	ArrayList<Media> mediaList;
	ArrayList<Filter> filterList;

	public DataFileReader(String filename) throws FileNotFoundException {
		File file = new File(filename);
		scanner = new Scanner(new FileReader(file));
		mediaList = new ArrayList<Media>();
		filterList = new ArrayList<Filter>();
	}

	/**
	 * method to load data from a file
	 */
	public void loadDataFromFile() {
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if(line.trim().length()==0)
				continue;
			String[] cols = line.split("\\|");
			String title = cols[0].trim();
			String attrs[] = cols[1].split(",");
			double rating = parseRatingFromString(attrs[0]);
			if (isMovie(attrs[1])) {
				double length = parseLengthFromString(attrs[1]);
				int year = stripYearsFromString(title)[0];
				Movie movie = new Movie(title, rating, year, length);
				mediaList.add(movie);
			} else {
				Scanner scanner = new Scanner(attrs[1]);
				int num = scanner.nextInt();
				String type = scanner.next();
				int[] years = stripYearsFromString(title);
				Series series = new Series(title, rating, years[0], num, type, years[1]);
				mediaList.add(series);
			}
		}
	}

	/**
	 * method to parse rating from a string file
	 */
	public double parseRatingFromString(String str) {
		double r = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				r = Double.parseDouble(str.charAt(i) + "");
				if (i + 2 < str.length()) {
					if (str.charAt(i + 1) == '.') {
						if (Character.isDigit(str.charAt(i + 2))) {
							r += Double.parseDouble("0." + str.charAt(i + 2));
							return r;
						}
					} else {
						return r;
					}
				}
			}
		}
		return r;
	}

	/**
	 * Method to add a filter to the list
	 *
	 * @param filter
	 */
	public void applyFilter(Filter filter) {
		if (!filterList.contains(filter)) {
			filterList.add(filter);
		}
	}

	public boolean removeFilter(Filter filter) {
		if (filterList.contains(filter)) {
			filterList.remove(filterList.indexOf(filter));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * method to check if it is a movie or series,from a string
	 */
	public boolean isMovie(String str) {
		if (str.toLowerCase().contains("seasons") || str.toLowerCase().contains("episodes")) {
			return false;
		}
		return true;
	}

	/**
	 * method to strip a movie duration from string
	 */
	public double parseLengthFromString(String str) {
		double length = 0;
		if (str.contains("hr")) {
			int i = str.indexOf("hr");
			if (i - 1 >= 0) {
				length = Double.parseDouble(str.charAt(i - 1) + "");
			}
		}
		if (str.contains("m")) {
			int i = str.indexOf("m");
			if (i - 2 >= 0) {
				if (Character.isDigit(str.charAt(i - 2)) && Character.isDigit(str.charAt(i - 1))) {
					length += Double.parseDouble("0." + str.charAt(i - 2) + str.charAt(i - 1));
				} else if (Character.isDigit(str.charAt(i - 1))) {
					length += Double.parseDouble("0." + str.charAt(i - 1));
				}
			}
		}
		return length;
	}

	/**
	 * Method to print the list
	 */
	public void printList() {
		ArrayList<Media> filteredList = new ArrayList<Media>();
		for (Media m : mediaList) {
			boolean objection = false;
			for (Filter f : filterList) {
				if (f.getField().equals("year")) {
					/**
					 * Year wise filter
					 */
					char c = f.getRelation().charAt(0);
					if (c == '>') {
						int y = Integer.parseInt(f.getTarget());
						if (m.getYear() < y) {
							objection = true;
						}
					} else if (c == '<') {
						int y = Integer.parseInt(f.getTarget());
						if (m.getYear() >= y) {
							objection = true;
						}
					} else if (c == '=') {
						int y = Integer.parseInt(f.getTarget());
						if (m.getYear() != y) {
							objection = true;
						}
					}
				} else if (f.getField().equals("rating")) {
					/**
					 * applying rating wise filter
					 */
					char c = f.getRelation().charAt(0);
					if (c == '>') {
						double y = Double.parseDouble(f.getTarget());
						if (m.getRating() < y) {
							objection = true;
						}
					} else if (c == '<') {
						double y = Double.parseDouble(f.getTarget());
						if (m.getRating() >= y) {
							objection = true;
						}
					} else if (c == '=') {
						double y = Double.parseDouble(f.getTarget());
						if (m.getRating() != y) {
							objection = true;
						}
					}
				} else if (f.getField().equals("genre")) {
					/**
					 * Applying genre filter
					 */
					String type = f.getTarget();
					if (type.equalsIgnoreCase("movie")) {
						if (!(m instanceof Movie)) {
							objection = true;
						}
					} else if (type.equalsIgnoreCase("series")) {
						if (!(m instanceof Series)) {
							objection = true;
						}
					}
				}
			}
			if (!objection) {
				filteredList.add(m);
			}
		}
		/**
		 * Displaying the filtered list
		 */
		for (Media m : filteredList) {
			System.out.println(m.toString());
		}
	}

	/** method to strip the years from a string */
	public int[] stripYearsFromString(String str) {
		int[] years = new int[2];
		int i = str.lastIndexOf("(");
		int year1 = Integer.parseInt(str.substring(i + 1, i + 5));
		years[0] = year1;
		if (str.charAt(i + 5) == '-') {
			int year2 = Integer.parseInt(str.substring(i + 6, i + 10));
			years[1] = year2;
		}
		return years;
	}
}

class Filter {
	String field, relation, target;

	// constructor with arguments
	public Filter(String field, String relation, String target) {
		this.field = field;
		this.relation = relation;
		this.target = target;
	}

	// constructor with no arguments
	public Filter() {
		this.field = "";
		this.relation = "";
		this.target = "";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Filter) {
			Filter f = (Filter) o;
			if (f.field.equals(this.field) && f.relation.equals(this.relation) && f.target.equals(target)) {
				// filters are equal
				return true;
			}
		}
		return false;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}

abstract class Media {
	private String title;
	private double rating;
	private int year;

	// def constructor
	public Media() {
		title = "";
		rating = 0;
		year = 0;
	}

	// constructor with arguments
	public Media(String title, double rating, int year) {
		this.title = title;
		this.rating = rating;
		this.year = year;
	}

	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Rating: " + rating;
	}
}

class Movie extends Media {
	private double length;

	// constructor with no arguments
	public Movie() {
		super();
	}

	// constructor with arguments
	public Movie(String title, double rating, int year, double length) {
		super(title, rating, year);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return super.toString() + ", Length: " + String.format("%.2f h", length);
	}
}

class Series extends Media {
	private int num;
	private String type;
	private int endYear;

	// constructor with no arguments
	public Series() {
		super();
	}

	// constructor with arguments
	public Series(String title, double rating, int year, int seasons, String type, int end) {
		super(title, rating, year);
		this.num = seasons;
		this.type = type;
		endYear = end;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int seasons) {
		this.num = seasons;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + type + ": " + num;
	}
}