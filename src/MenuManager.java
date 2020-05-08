import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerManager customerManager = new CustomerManager(input); //CustomerManager class�� �ҷ����� ���� customerManager������ �����ϰ� new�� ����� ��ü�� ������ �� �����ڰ� ȣ��ǰ� �Ѵ�. input������ �־� Scanner�� �Ű������� �����Ͽ� CustomerManager class������ �� �� �ְ� �Ѵ�.
		int num = -1;

		while(num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				customerManager.addCustomer();
				break;
			case 2:
				customerManager.deleteCustomer();
				break;
			case 3:
				customerManager.editCustomer();
				break;
			case 4:
				customerManager.viewCustomers();
				break;
			default:
				continue;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("~ Book Rental Management System ~");
		System.out.println(" 1. Add Customer");
		System.out.println(" 2. Delete Customer");
		System.out.println(" 3. Edit Customer");
		System.out.println(" 4. View Customers");
		System.out.println(" 5. Exit");
		System.out.println("Select one menu between 1 - 5 : ");
	}
}	
