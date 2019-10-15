package Oct30;

public class GPS {
	private double langitude;
	private double latitude;
	public GPS(double aLangitude, double aLatitude) {
		super();
		langitude = aLangitude;
		latitude = aLatitude;
	}
	public double getLangitude() {
		return langitude;
	}
	public void setLangitude(double aLangitude) {
		langitude = aLangitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double aLatitude) {
		latitude = aLatitude;
	}
	public GPS getNearestGas(){
		return null;
	}
	public GPS getNearestHospital(){
		return null;
	}
	
}
