
class Ant implements Comparable {
int size;
String name;
public Ant ( String name , int size ) {
this.name = name;
this.size = size;
}
public String getName () {
return this.name;
}
public int getSize() {
return this.size;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return name;
}
@Override
public int compareTo(Object obj) {
	Ant a1=(Ant)obj;
	
	return this.name.substring(0, 1).compareToIgnoreCase(a1.name.substring(0, 1));
}
}


public class Main {

public static void main(String[] argv) {
Ant ant1 = new Ant("Anthony", 2);
Ant ant2 = new Ant("amy", 2);
compare(ant1, ant2);
ant1 = new Ant("Anthony", 2);
ant2 = new Ant("benny", 2);
compare(ant1, ant2);
ant1 = new Ant("Anthony", 2);
ant2 = new Ant("amy", 3);
compare(ant1, ant2);
}
private static void compare(Comparable c1, Comparable c2) {
int result = c1.compareTo(c2);
if(result < 0) {
System.out.println(c1 + " smaller than " + c2 );
} else if(result == 0) {
System.out.println(c1 + " equals to " + c2 );
} else {
System.out.println(c1 + " larger than " + c2 );
}
}
}