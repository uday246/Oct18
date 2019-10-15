class SwimmingPool {
	private int length;
	private int width;
	private int depth;
	private int fillingRate;
	private int drainingRate;
	private int cap;
	private int water;

	// constructor to initialize the values
	public SwimmingPool(int aLength, int aWidth, int aDepth, int aFillingRate, int aDrainingRate) {
		super();
		length = aLength;
		width = aWidth;
		depth = aDepth;
		fillingRate = aFillingRate;
		drainingRate = aDrainingRate;
		// calculating the volume
		cap = length * width * depth;
		cap *= 1000;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int aLength) {
		length = aLength;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int aWidth) {
		width = aWidth;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int aDepth) {
		depth = aDepth;
	}

	public int getFillingRate() {
		return fillingRate;
	}

	public void setFillingRate(int aFillingRate) {
		fillingRate = aFillingRate;
	}

	public int getDrainingRate() {
		return drainingRate;
	}

	public void setDrainingRate(int aDrainingRate) {
		drainingRate = aDrainingRate;
	}

	// determines how much water required to fill the pool
	public int determineWaterToFillPool() {
		return cap - water;
	}

	// determines how much time required to fill the pool
	public int determineTimeToFillPool() {
		return (cap - water) / fillingRate;
	}

	// add the water to pool in given min
	public void addWater(int min) {
		water = water + min * fillingRate;
	}

}

public class TestPool {
	public static void main(String[] args) {
		SwimmingPool sw = new SwimmingPool(10, 10, 5, 50, 50);
		sw.addWater(5);
		System.out.println("Amount of water required : " + sw.determineWaterToFillPool());
		System.out.println("Amount of time  required : " + sw.determineTimeToFillPool());

	}
}
