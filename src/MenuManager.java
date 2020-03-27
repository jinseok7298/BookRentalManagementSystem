import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while(num != 6) {
			System.out.println("~ Book Rental Management System ~");
			System.out.println(" 1. Add Customer");
			System.out.println(" 2. Delete Customer");
			System.out.println(" 3. Edit Customer");
			System.out.println(" 4. View Customer");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one menu between 1 - 6 : ");
			num = input.nextInt();
			if(num == 1) {
				addCustomer();
			}
			else if(num == 2) {
				deleteCustomer();
			}
			else if(num == 3) {
				editCustomer();
			}
			else if(num == 4) {
				viewCustomer();
			}
			else {
				continue;
			}
		}
	}
	public static void addCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		System.out.print("Customer Name : ");
		String customerName = input.next();
		System.out.print("Email address : ");
		String customerEmail = input.next();
		System.out.print("Phone number : ");
		String customerPhone = input.next();
	}
	public static void deleteCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		
	}
	public static void editCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		
	}
	public static void viewCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		
	}

}	
