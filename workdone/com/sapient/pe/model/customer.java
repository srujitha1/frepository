package com.sapient.pe.model;

import com.sapient.pe.client.Person;
import java.util.*;
public class customer
{

	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	
		
		int flag=0;
		
		List<SavingsAccount> list=new ArrayList<>();
		Iterator<SavingsAccount> it=list.iterator();
		SavingsAccount holder=null;
		
		
		while(flag!=1)
		{
		
		
				System.out.println("enter person name ");
				String name=sc.nextLine();
				System.out.println("enter person age ");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.println("enter person gender ");
				String gender=sc.nextLine();
				System.out.println("enter street");
				String street=sc.nextLine();
				Address address = new Address("x",street,"z");
				Person person = new Person(name,age,gender,address);
				
			
				System.out.println("enter account type 1.savings 2.current 3.salary");
				int s;
				s=sc.nextInt();
		
					switch(s)
					{
	
		
						case 1:
						{
							holder=new Savings(person);
							list.add(holder);
							break;
						}
						case 2:
						{
							holder=new Current(person);
							list.add(holder);
							break;
						}
						case 3:
						{
			
							holder=new Salary(person);
							list.add(holder);
							break;
						}
						default:
							list.add(holder);
					}
		System.out.println("continue y/n");
		String q=sc.nextLine();
		if(q=="n")
			flag=1;
			
			}
		
		
			while(1!=0)
			{
				System.out.println("1.view an account 2. check account balance 3.deposit 4.withdraw");
				System.out.println("enter one option");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
					{
						System.out.println("enter account number");
						double acno=sc.nextDouble();
						while(it.hasNext())
						{
				
								holder=it.next();
								if(holder.getId()==acno)
								{
										break;
								}
						}
						holder.viewAccount();
			
					}
					case 2:
					{
						System.out.println("enter account number");
						double acno=sc.nextDouble();
						while(it.hasNext())
						{
					
							holder=it.next();
							if(holder.getId()==acno)
							{
								break;
							}
						}
						holder.checkBalance();break;
					}
					case 3:
					{
						System.out.println("enter account number");
						double acno=sc.nextDouble();
						while(it.hasNext())
						{
							
							holder=it.next();
							if(holder.getId()==acno)
							{
								break;
							}
						}
						double amount;
						System.out.println("enter deposit amount");
						amount=sc.nextDouble();
			    
						holder.deposit(amount);
						break;
					}
					case 4:
					{
						System.out.println("enter account number");
						double acno=sc.nextDouble();
						while(it.hasNext())
						{
				
							holder=it.next();
							if(holder.getId()==acno)
							{
								break;
							}
						}
						double amount;
						System.out.println("enter withdraw amount");
						amount=sc.nextDouble();
						holder.withdraw(amount);
						break;

		
					}
		
		
		
		
		
				}
		
		
		
		
			}
	
		
		}

	}
	

	

