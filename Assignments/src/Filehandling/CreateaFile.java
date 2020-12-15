package Filehandling;

import java.io.File;
import java.util.Scanner;

public class CreateaFile {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=input.nextLine();
		Createfile(filename+".txt");
		// TODO Auto-generated method stub

	}
	public static void Createfile(String file) {
		File filename=new File(file);
		try {
			if(filename.createNewFile()) {
				System.out.println("file created  the name is"+" "+filename.getName());
			}
			else {
				System.out.println("file already created  the name is"+" "+filename.getName());	
			}
		}
			
		 catch (Exception e) {
			// TODO: handle exception
		 }
		}

}
