import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerManager customerManager = new CustomerManager(input); //CustomerManager class를 불러오기 위해 customerManager변수를 선언하고 new를 사용해 객체가 생성될 때 생성자가 호출되게 한다. input변수를 넣어 Scanner를 매개변수로 선언하여 CustomerManager class에서도 쓸 수 있게 한다.
		int num = -1;

		while(num != 5) {
			System.out.println("~ Book Rental Management System ~");
			System.out.println(" 1. Add Customer");
			System.out.println(" 2. Delete Customer");
			System.out.println(" 3. Edit Customer");
			System.out.println(" 4. View Customers");
			System.out.println(" 5. Exit");
			System.out.println("Select one menu between 1 - 5 : ");
			num = input.nextInt();
			if(num == 1) {
				customerManager.addCustomer(); //CustomerManager class의 addCustomer을 실행한다.
			}
			else if(num == 2) {
				customerManager.deleteCustomer();
			}
			else if(num == 3) {
				customerManager.editCustomer();
			}
			else if(num == 4) {
				customerManager.viewCustomers();
			}
			else {
				continue;
			}
		}
	}
}	
