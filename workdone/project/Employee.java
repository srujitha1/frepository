

package project;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int vacationDays=10;
	

	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	public void applyForLeave(int noOfDays)
	{
		if(vacationDays > noOfDays )
		{
			vacationDays-=noOfDays;
		}
		else
		{
			System.out.println("limit exceeded");
		}
	}

	

}
