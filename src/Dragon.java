
public abstract class Dragon {
public abstract boolean isFriendly();
}
class MettalicDragon extends Dragon{

	@Override
	public boolean isFriendly() {
		return false;
	}
	
}
