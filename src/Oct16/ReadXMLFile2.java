package Oct16;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class Employee {
	private String id;
	private String firstName;
	private String lastName;
	private String locations;

	public Employee() {

	}

	public Employee(String aId, String aFirstName, String aLastName, String aLocations) {
		super();
		id = aId;
		firstName = aFirstName;
		lastName = aLastName;
		locations = aLocations;
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		id = aId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String aLastName) {
		lastName = aLastName;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String aLocations) {
		locations = aLocations;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", locations=" + locations
				+ "]";
	}

}

public class ReadXMLFile2 {

	public static void main(String argv[]) {

		try {

			File fXmlFile = new File("emp.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("employee");
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					Employee e = new Employee(eElement.getAttribute("id"), eElement.getAttribute("firstName"),
							eElement.getAttribute("lastName"), eElement.getAttribute("location"));
					System.out.println(e);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
