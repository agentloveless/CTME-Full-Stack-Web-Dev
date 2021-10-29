package LockedMe;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Desktop;
import java.awt.List;

public class FileOperations {

ArrayList<String> retrieve = new ArrayList<String>();
File[] files = new File("C:\\Users\\qqq\\Lockedme.com").listFiles();
	
	public void ShowMeFiles() {
		for(File file:files) {
			if(file.isFile()) {
					retrieve.add(file.getName());
			}
		}
		retrieve.forEach(System.out::println);
	}
	public void AddFile() {
		System.out.println("Enter the file which you want to add: ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		File F = new File(filename);
		try {
			if(F.createNewFile()) {
				System.out.println(filename +" file is added to the directory");
				Desktop.getDesktop().edit(F);
				}
			else {
				System.out.println(filename +" file is already there");
				}
		}catch	(IOException e) {
			e.printStackTrace();
		}
	}
	public void DeleteFile() {
		System.out.println("Enter the file which you want to delete: ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		File F = new File(filename);
		if(F.delete()) {
			System.out.println(filename + " got Deleted");
		}
		else {
			System.out.println("File Not Found");
		}
	
	}

	public void SearchFile() {
	try {	
		Scanner scan= new Scanner(System.in);
		File directory = new File("C:\\Users\\qqq\\Lockedme.com");
		System.out.println("Enter the file name you want to search: ");
		String SearchFile=scan.nextLine();
        File[] files=directory.listFiles();
        Boolean FNF = true ;
        for (File file : files) {
            String name = file.getName();
            if (name.equals(SearchFile)) {
    				File f= new File(SearchFile);
    				Scanner sc1 = new Scanner(f);
    				while(sc1.hasNextLine()) {
    				System.out.println(sc1.nextLine());
    				}
    			FNF = false;	
            }
		}
    if(FNF == true) {
    	System.out.println("File Not Found");
    }
    	
	}catch(FileNotFoundException e) {
		System.out.println("file not found");
	}
	
}

}
