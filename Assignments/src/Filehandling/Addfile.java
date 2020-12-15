package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Addfile {
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=input.nextLine();
		
		System.out.println("enter data to insert file"+" "+ filename);
		
		String data=input.nextLine();
		
		Createfile(filename,data);

	}
	
public static void Createfile(String file,String data) throws IOException {
	File filename=new File(file);
	FileWriter filewriter=null;
	
	try {
		filename.createNewFile();
		if(filename.exists()) {
			filewriter=new FileWriter(filename);
			filewriter.write(data);
			filewriter.append(data);
		}
		else {
		throw new FileNotFoundException("file is not available"+" "+filename.getName())
		;}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		filewriter.close();
	}
	
}
}
