
package com.sapient.pe.model;
import com.sapient.pe.client.Person;

public class Current extends SavingsAccount{
	
private final double MIN_BALANCE=25000;
	public Current(Person person) {
		// TODO Auto-generated constructor stub
		super(person,SavingsAccount.Account.CURRENT);
	}


	public double withdraw(double amount) {
		// TODO Auto-generated method stub
	
		
			if(balance-amount>=MIN_BALANCE)
			{
				return super.withdraw(amount);
			}
			else {
				System.out.println("insufficient balance");
			}
		
		return 0;
	}
	
	

}