package oct12;

class Section {
	private int CRN;
	private String Department;
	private int coursNnumber;
	private String instructionalMode;
	private String meetingDays;
	private String meetingTimes;
	private int Capacity;
	private int Enrollment;
	private int instructorID;

	public Section() {
		CRN = 0;
		Department = "";
		coursNnumber = 0;
		instructionalMode = "";
		meetingDays = "";
		meetingTimes = "";
		Capacity = 0;
		Enrollment = 0;
		instructorID = 0;
	}

	public Section(int aCRN, String aDepartment, int aCoursNnumber, String aKnstructionalMode, String aMeetingDays,
			String aMeetingTimes, int aCapacity, int aEnrollment, int aInstructorID) {
		super();
		CRN = aCRN;
		Department = aDepartment;
		coursNnumber = aCoursNnumber;
		instructionalMode = aKnstructionalMode;
		meetingDays = aMeetingDays;
		meetingTimes = aMeetingTimes;
		Capacity = aCapacity;
		Enrollment = aEnrollment;
		instructorID = aInstructorID;
	}

	public int getCRN() {
		return CRN;
	}

	public void setCRN(int aCRN) {
		CRN = aCRN;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String aDepartment) {
		Department = aDepartment;
	}

	public int getCoursNnumber() {
		return coursNnumber;
	}

	public void setCoursNnumber(int aCoursNnumber) {
		coursNnumber = aCoursNnumber;
	}

	public String getInstructionalMode() {
		return instructionalMode;
	}

	public void setInstructionalMode(String aInstructionalMode) {
		instructionalMode = aInstructionalMode;
	}

	public String getMeetingDays() {
		return meetingDays;
	}

	public void setMeetingDays(String aMeetingDays) {
		meetingDays = aMeetingDays;
	}

	public String getMeetingTimes() {
		return meetingTimes;
	}

	public void setMeetingTimes(String aMeetingTimes) {
		meetingTimes = aMeetingTimes;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int aCapacity) {
		Capacity = aCapacity;
	}

	public int getEnrollment() {
		return Enrollment;
	}

	public void setEnrollment(int aEnrollment) {
		Enrollment = aEnrollment;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int aInstructorID) {
		instructorID = aInstructorID;
	}

	@Override
	public String toString() {
		return " CRN :" + CRN + "\n Department : " + Department + "\n coursNnumber :" + coursNnumber
				+ "\n instructionalMode : " + instructionalMode + "\n meetingDays : " + meetingDays
				+ " \n meetingTimes : " + meetingTimes + "\n Capacity :" + Capacity + "\n Enrollment : " + Enrollment
				+ "\n instructorID : " + instructorID;
	}

}

public class DriverSection {
	public static void main(String[] args) {
		Section se = new Section(10059, "SOC", 300, "Online", "N/A", "N/A", 60, 60, 122);
		System.out.println(se);
	}
}
