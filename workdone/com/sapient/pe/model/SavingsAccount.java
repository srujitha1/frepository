package com.sapient.pe.model;

import com.sapient.pe.client.Person;

public class SavingsAccount {
	public enum Account{
		SAVINGS,
		CURRENT,
	SALARY;
	}
	private final long id;
	Account account;
	protected double balance;
	
	private static long count=0;
	private final Person person;
	public SavingsAccount(Person person,Account account) {
		this.account=account;
		this.person=person;
		id=++count;

	}
	public void viewAccount()
	{
		System.out.println("Account exists");
		System.out.println(id);
		
	}
	
	public void deposit(double amount)
	{
		this.balance+=amount;
	}
	public double withdraw(double amount)
	{
		
		balance-=amount;
		
		
		
			
		return amount;
	}
  public void checkBalance()
  {
	  System.out.println("balance is " + balance);
  }
public long getId() {
	return id;
}



public static long getCount() {
	return count;
}

public Person getPerson() {
	return person;
}



}
