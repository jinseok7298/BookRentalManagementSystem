import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerManager customerManager = new CustomerManager(input);
		int num = -1;

		while(num != 5) {
			System.out.println("~ Book Rental Management System ~");
			System.out.println(" 1. Add Customer");
			System.out.println(" 2. Delete Customer");
			System.out.println(" 3. Edit Customer");
			System.out.println(" 4. View Customer");
			System.out.println(" 5. Exit");
			System.out.println("Select one menu between 1 - 5 : ");
			num = input.nextInt();
			if(num == 1) {
				customerManager.addCustomer();
			}
			else if(num == 2) {
				customerManager.deleteCustomer();
			}
			else if(num == 3) {
				customerManager.editCustomer();
			}
			else if(num == 4) {
				customerManager.viewCustomer();
			}
			else {
				continue;
			}
		}
	}
}	
