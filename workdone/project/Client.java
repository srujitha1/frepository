package project;

public class Client {
	
	public static void main(String[] args) {
		Employee srujitha = new Employee(1, "Sruji" ,90_000);
		System.out.println("initial vacation days " + srujitha.getVacationDays());
		srujitha.applyForLeave(5);
		System.out.println("after applying for leaves "+ srujitha.getVacationDays());
		srujitha.applyForLeave(10);
	}

}
