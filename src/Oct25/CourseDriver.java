package Oct25;

class Course {
	public String courseName;
	public String instructor;
	public String courseId;
	public String description;

	public Course(String name, String instName, String id, String desc) {
		courseName = name;
		instructor = instName;
		courseId = id;
		description = desc;
	}

	public void displayMessage() {
		System.out.println("Course name is " + courseName);
		System.out.printf("Course ID is " + courseId);
		System.out.printf("Course Instructor is " + instructor);
		System.out.printf("Course Description : " + description);
	}
}

class EngCourse extends Course {
	public EngCourse(String name, String instName, String id, String desc) {
		super(name, instName, id, desc);
	}

	public void displayMessage() {
		System.out.println("This course is offered by the English Department.");
		System.out.println("Course name is " + courseName);
		System.out.println("Course ID is " + courseId);
		System.out.println("Course Instructor is " + instructor);
		System.out.println("Course Description : " + description);
		System.out.println("--------------------------------------");
	}
}

class MathCourse extends Course {
	public MathCourse(String name, String instName, String id, String desc) {
		super(name, instName, id, desc);
	}

	public void displayMessage() {
		System.out.println("This course is offered by the Math Department.");
		System.out.println("Course name is " + courseName);
		System.out.println("Course ID is " + courseId);
		System.out.println("Course Instructor is " + instructor);
		System.out.println("Course Description : " + description);
		System.out.println("--------------------------------------");
	}
}

class ProgCourse extends Course {
	public ProgCourse(String name, String instName, String id, String desc) {
		super(name, instName, id, desc);
	}

	public void displayMessage() {
		System.out.println("This course is offered by the Computer Engineering Department.");
		System.out.println("Course name is " + courseName);
		System.out.println("Course ID is " + courseId);
		System.out.println("Course Instructor is " + instructor);
		System.out.println("Course Description : " + description);
		System.out.println("--------------------------------------");
	}
}

class PhyCourse extends Course {
	public PhyCourse(String name, String instName, String id, String desc) {
		super(name, instName, id, desc);
	}

	public void displayMessage() {
		System.out.println("This course is offered by the Physics Department.");
		System.out.println("Course name is " + courseName);
		System.out.println("Course ID is " + courseId);
		System.out.println("Course Instructor is " + instructor);
		System.out.println("Course Description : " + description);
		System.out.println("--------------------------------------");
	}
}

public class CourseDriver {
	public static void main(String[] args) {
		Course c1, c2, c3, c4;
		c1 = new PhyCourse("Introduction to Physics", "Castor Troy", "201",
				"In this course we will learn about the basics of physics and how to apply physics in daily life.");
		c2 = new MathCourse("Algebra 201", "Matthew Potter", "004",
				"In this course we shall learn about solving algebra equations");
		c3 = new EngCourse("English 300", "Teresa Jones", "E23",
				"In this course we shall learn about some great literary works of 19th century");
		c4 = new ProgCourse("Programming 101", "Bowe Ping", "P234",
				"In this course we will learn about programming in Java");
		c1.displayMessage();
		c2.displayMessage();
		c3.displayMessage();
		c4.displayMessage();
	}
}