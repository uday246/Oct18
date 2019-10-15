class RoomOccupancy {
	private int numberInRoom;
	private static int totalNumber;

	public void addOneToRoom() {
		numberInRoom++;
		totalNumber++;
	}

	public void removeOneFromRoom() {
		if (numberInRoom > 0) {
			numberInRoom--;
			totalNumber--;
		}
	}

	public int getNumber() {
		return numberInRoom;
	}

	public static int getTotal() {
		return totalNumber;
	}

}

public class DriverOccupancy {
	public static void main(String[] args) {
		RoomOccupancy msb101 = new RoomOccupancy();
		msb101.addOneToRoom();
		msb101.addOneToRoom();

		RoomOccupancy msb102 = new RoomOccupancy();
		msb102.addOneToRoom();
		msb102.addOneToRoom();

		RoomOccupancy msb103 = new RoomOccupancy();
		msb103.addOneToRoom();
		msb103.addOneToRoom();

		msb102.removeOneFromRoom();
		System.out.println("Number of people in Room 1: " + msb101.getNumber());
		System.out.println("Number of people in Room 2: " + msb102.getNumber());
		System.out.println("Number of people in Room 3: " + msb103.getNumber());
		System.out.println("Total number of people all rooms : " + RoomOccupancy.getTotal());
	}
}
