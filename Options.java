package LockedMe;
import java.util.Scanner;

public class Options {

	static int option1;
	static int option2;
	static Scanner sc = new Scanner(System.in);
	static Boolean exception1 = false;
	static Boolean exception2 = false;
	static FileOperations obj = new FileOperations();
	
	public static void main(String[] arg) {
	
	}
	
	public static void FirstLevel() {
		try {
		option1=sc.nextInt();
		} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		exception1 = true;
		}

		switch(option1) {
		
		case 1:
			//show all files
			obj.ShowMeFiles();
			System.out.println("");
			MenuScreen.FirstLevel();
			FirstLevel();
		
			break;
		case 2:
			//file operations menu
			MenuScreen.SecondLevel();
			SecondLevel();
			break;
		case 3:
			//
			System.out.println("Program exiting..........");
			sc.close();
			System.exit(0);
			break;
		default:
			System.out.println("");
			System.out.println("invalid Choice, please try again.");
			System.out.println("");
			if(exception1==false){
				MenuScreen.FirstLevel();
				FirstLevel();
				}
			else {
			}
			}
			}
			

		
	public static void SecondLevel() {
		try {
			option2=sc.nextInt();
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			exception2 = true;
			}

		switch(option2) {
		
		case 1:
			//add file
			obj.AddFile();
			System.out.println("");
			MenuScreen.SecondLevel();
			SecondLevel();
			break;
		case 2:
			//delete file
			obj.DeleteFile();
			System.out.println("");
			MenuScreen.SecondLevel();
			SecondLevel();
			break;
		case 3:
			//search file
			obj.SearchFile();
			System.out.println("");
			MenuScreen.SecondLevel();
			SecondLevel();
			break;
		case 4:
			//return to previous menu
			System.out.println("");
			MenuScreen.FirstLevel();
			FirstLevel();
			break;
		default:
			System.out.println("");
			System.out.println("invalid Choice, please try again.");
			System.out.println("");
			if(exception2==false){
				MenuScreen.SecondLevel();
				SecondLevel();
			}
			break;
	
		
	}
	
	}
	
}
