package javap;

public class Student {
	int id;
	String name;
	Address address;

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("City: " + address.city + "\nState: " + address.state + "\nCountry: " + address.country);
	}

}
