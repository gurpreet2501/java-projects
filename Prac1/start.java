import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

class Start{

	public static void main(String args[]){

		Start obj = new Start();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 to add Laptop and 2 for Phone: ");

		int choice = sc.nextInt();
		switch(choice){
			case 1:
					obj.laptopMenu();
					break;
			case 2:
					obj.phoneMenu();
					break;
			default:
				System.exit(0);
				  		
		} //switch ends
		

	} //main ends
	void laptopMenu(){

		System.out.println("**************************");
		System.out.println("Asset Tracker System");
		System.out.println("**************************");
		System.out.println("Please select an option:");
		System.out.println("1) Add Laptop");
		System.out.println("2) Delete Laptop");
		System.out.println("3) List Assigned Laptops");
		System.out.println("4) Assign Laptop");
		System.out.println("5) Return Laptop");
		System.out.println("6) Search Laptops");
		System.out.println("7) Exit");
		System.out.println("**************************");

	}

	void phoneMenu(){

		System.out.println("**************************");
		System.out.println("Asset Tracker System");
		System.out.println("**************************");
		System.out.println("Please select an option:");
		System.out.println("1) Add Phone");
		System.out.println("2) Delete Phone");
		System.out.println("3) List Assigned Phones");
		System.out.println("4) Assign Phone");
		System.out.println("5) Return Phone");
		System.out.println("6) Search Phones");
		System.out.println("7) Exit");
		System.out.println("**************************");

	}


}