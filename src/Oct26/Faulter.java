package Oct26;

public class Faulter {
	private String type;
	Faulter(String msg){
		type=msg;
	}
	public Exception fault(){
		if(type.equalsIgnoreCase("NullPointer fault"))
		return new NullPointerException();
		if(type.equalsIgnoreCase("ArrayIndexOutOfBounds fault"))
			return new ArrayIndexOutOfBoundsException();
		if(type.equalsIgnoreCase("ClassCast fault"))
			return new ClassCastException();
		
		return new IllegalArgumentException();
			
	}
	
}
