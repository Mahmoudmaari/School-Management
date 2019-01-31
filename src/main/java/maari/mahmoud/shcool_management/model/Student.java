package maari.mahmoud.shcool_management.model;

public class Student {
	/*
	 * made by Falak
	 */
	private int id;
	private String name;
	private String email;
	private String address;

	public Student() {

	}

	public Student(int id, String name, String email, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]" + "\n";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String setEmail(String email) {
		return this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public String setAddress(String address) {
		return this.address = address;
	}

}
