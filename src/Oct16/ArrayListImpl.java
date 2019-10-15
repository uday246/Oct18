package Oct16;

import java.util.ArrayList;

public class ArrayListImpl {
	private ArrayList al = new ArrayList();

	public void remove(int index) {
		al.remove(index);
	}

	public void remove(int start, int end) {
		if (al.size() >= end)
			return;
		for (; start <= end; start++)
			al.remove(start);
	}

	public void removeAll() {
		al.clear();
	}
}
