package com;

import java.io.File;
import java.io.IOException;

public class Io3 {

	public Io3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir1 = new File("abc.txt");
		dir1.mkdir();
		File dir2 =new File(dir1,"xyz.txt");
		dir2.mkdir();
		File f= new File(dir2,"c.txt");
		f.createNewFile();
		

	}

}
