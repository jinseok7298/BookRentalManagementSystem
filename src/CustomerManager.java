import java.util.ArrayList;
import java.util.Scanner;

import customer.Customer;
import customer.CustomerKind;
import customer.NonMemberCustomer;
import customer.VipCustomer;


public class CustomerManager {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	Scanner input;
	CustomerManager(Scanner input){// MenuManager class���� �����ߴ�  Scanner input���� �ҷ��´�.
		this.input = input; //�ҷ��� input�� this.input���� ���� �� ���� ����� input������ �Ű���. 
	}                       //���� Scanner input = new Scanner(System.in)�� ���� �����ִ� ���� �� �ϰԵ�.
	
	public void addCustomer() { //Scanner�� ������ ���������Ƿ� �ٽ� �� �ᵵ �ȴ�.
		int kind = 0;
		Customer customer;
		while(kind != 1 && kind != 2) { //Customer Ŭ������ ���� �Է�����, NonMemberCustomer Ŭ������ �Է����� ����.
			System.out.println(" 1 for Member");
			System.out.println(" 2 for Non-Member");
			System.out.println(" 3 for Vip");
			System.out.print("Select num 1, 2, or 3 for Customer kind : ");
			kind = input.nextInt();
			if (kind == 1) { //1�� ���ý� kind�� member�� customer Ŭ������ ����
				customer = new Customer(CustomerKind.Member);
				customer.getUserInput(input);
				customers.add(customer); //�Է��� customer ���� �迭 customers�� ����.
				break;
			}
			else if(kind == 2) { //2�� ���ý� kind�� nonmember�� nonmembercustomer Ŭ���� ����.
				customer = new NonMemberCustomer(CustomerKind.Nonmember);
				customer.getUserInput(input);
				customers.add(customer);
				break;
			}
			else if(kind == 3) { 
				customer = new VipCustomer(CustomerKind.Vip);
				customer.getUserInput(input);
				customers.add(customer);
				break;
			}
			else {
				System.out.print("Select num for Customer kind between 1 and 2 : ");
			}
		}
	}
	public void deleteCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();//���ο� �Է��� ���� ����
		int index = -1; //index�� ����.
		for (int i = 0; i<customers.size(); i++) {
			if (customers.get(i).getId() == customerid) { //�Է� ���� �߰��ߴ� �� id ��ġ�� index�� i�� ���� //getId()�Լ� ���.
				index = i;
				break;
			}
		}
		if (index >= 0) { //�Է��ߴ� ���� id�� ��ġ�ؼ� index�� i�� ���� ����� �� �����Ͽ� id��ġ�ϴ� �� ����.
			customers.remove(index);
			System.out.println("the customer" + customerid + "is deleted");
		}
		else {
			System.out.println("the customer has not been registered");
			return;
		}
	}
	public void editCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt(); //���� �Է��� ���� ����.
		for (int i = 0; i<customers.size(); i++) { //�迭 ũ�⸸ŭ �ݺ��� ����.
			Customer customer = customers.get(i); //������ ������ customer�� customers�迭�� i��°�� customer�� ����.
			if (customer.getId() == customerid) {
				int num = -1;
				while(num != 6) {
					System.out.println("~ Customer Info Edit Menu ~");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Phone");
					System.out.println(" 4. Edit Book");
					System.out.println(" 5. Edit Period");
					System.out.println(" 6. Exit");
					System.out.println("Select one menu between 1 - 6 : ");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Customer ID : ");
						int id = input.nextInt(); //Customer class�ҷ��� id���� �ٽ� �Է��Ͽ� ���� add���� �����ߴ� ���� �ٲ۴�.
						customer.setId(id);
					}
					else if(num == 2) {
						System.out.print("Customer Name : ");
						String name = input.next();
						customer.setName(name);
					}
					else if(num == 3) {
						System.out.print("Phone number : ");
						String phone = input.next();
						customer.setPhone(phone);
					}
					else if(num == 4) {
						String js = input.nextLine();
						System.out.print("Borrowed Book Name : ");
						String book = input.nextLine();
						customer.setBook(book);
					}
					else if(num == 5) {
						String js = input.nextLine();
						System.out.print("Loan Period : ");
						String period = input.nextLine();
						customer.setPeriod(period);
					}
					else {
						continue;
					}
				}
			break;	
			}	
		}
	}
	public void viewCustomers() {
//		System.out.print("Customer ID : ");
//		int customerid = input.nextInt(); //���ο� ���� �� �Է�.
		System.out.println("# of registered customers : " + customers.size());
		for (int i = 0; i<customers.size(); i++) {
			customers.get(i).printInfo(); //�迭�ȿ� �ִ� customer�� �������� ���.
		}
	}

}
