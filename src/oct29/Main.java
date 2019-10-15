package oct29;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		ObjA obj = new ObjA();

		ArrayList list = new ArrayList();

		passResult(obj, 1, 1, list);

	}

	private static void passResult(ObjA o, int cases, int result, ArrayList list) throws IOException {

		// TODO Auto-generated method stub

		ObjA obj1 = new ObjA();

		obj1.addtest();

		list=obj1.getList();

		System.out.println("\nThe hashmap in main " + list);

	}

}

class ObjA {

	ArrayList list = new ArrayList();

	int result;

	int cases;

	public void addtest() {

		cases = 1;

		result = 1;

		addHashMaps(cases, result, list);

		cases = 2;

		result = 2;

		addHashMaps(cases, result, list);

	}

	public void addHashMaps(int cases, final int result, ArrayList list) {

		if (cases == 1) {

			Map myMap = new HashMap() {
				{
					put("case_A", 1);
					put("3case_A", result);
				}
			};

			list.add(myMap);

		}

		if (cases == 2) {

			Map myMap = new HashMap() {
				{
					put("case_A", 1);
					put("3case_A", result);
				}
			};

			list.add(myMap);

		}

	}

	public ArrayList getList() {

		System.out.print("The hashmap in getList " + list);

		return list;

	}

}
