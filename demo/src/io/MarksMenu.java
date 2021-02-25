package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MarksMenu {

	public static void addMarks(RandomAccessFile raf)
	{
		
	}
	
	public static void listMarks(RandomAccessFile raf)
	{
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		RandomAccessFile raf = 
				  new RandomAccessFile("d:\\classroom\\jan22\\marks.dat","rw");
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("**** Marks Menu *****");
			System.out.println("1. Add Marks");
			System.out.println("2. List Marks");
			System.out.println("3. Update Marks");
			System.out.println("4. Exit");
			System.out.println("Enter Choice [1-4] :");
			
			int choice = s.nextInt();
			
			switch(choice)
			{
			  case 1 :  addMarks(raf);
			            break;
			  case 2 :  listMarks(raf);
	            		break;			            
			  case 4 :  System.exit(0);
			}
		}

	}

}
