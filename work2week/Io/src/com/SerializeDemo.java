package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	

	public static void main(String[] args) {
		try {
			Person p1= new Person();
			p1.name="subhash";
			p1.age=25;
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.per"));
			oos.writeObject(p1);
			oos.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
