package gui;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("bat");
		l.add("cat");
		l.add("dog");
		// creating iterator for List
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
