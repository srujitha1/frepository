package assessment;

public class Emp {
	private static int counter=0;
	private String name;
	private String age;
	private int id;
	private String salary;

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		counter++;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = counter;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
