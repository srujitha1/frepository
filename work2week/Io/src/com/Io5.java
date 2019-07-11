package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Io5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		
			ObjectInputStream o=new ObjectInputStream(new FileInputStream("person.per"));
			Person p= (Person) o.readObject();
			o.close();
			System.out.println("name:"+p.name);
			System.out.println("age is:"+p.age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


