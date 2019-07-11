package com;

import java.io.RandomAccessFile;

public class IoDemo2 {

	public IoDemo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile rf = new RandomAccessFile("abc.txt","rw");
			//rf.seek(5);
			System.out.println(rf.readLine());
			rf.writeBytes("adgyugayu");
			rf.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
