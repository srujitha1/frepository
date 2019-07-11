package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IODemo {

	public IODemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter file name:");
			String fname=br.readLine();
			File f =new File(fname);
			if(f.exists())
			{
				BufferedReader fr=new BufferedReader(new FileReader(fname));
				String line=null;
				while((line=fr.readLine())!=null)
				{
					System.out.println(line);
				}
				fr.close();
			}
			else
			{
				System.out.println("file doesnot exists");
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
