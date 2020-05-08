import java.util.ArrayList;
import java.util.Scanner;

import customer.Customer;
import customer.CustomerInput;
import customer.CustomerKind;
import customer.MemberCustomer;
import customer.NonMemberCustomer;
import customer.VipCustomer;


public class CustomerManager {
	ArrayList<CustomerInput> customers = new ArrayList<CustomerInput>();
	Scanner input;
	CustomerManager(Scanner input){// MenuManager class���� �����ߴ�  Scanner input���� �ҷ��´�.
		this.input = input; //�ҷ��� input�� this.input���� ���� �� ���� ����� input������ �Ű���. 
	}                       //���� Scanner input = new Scanner(System.in)�� ���� �����ִ� ���� �� �ϰԵ�.
	
	public void addCustomer() { //Scanner�� ������ ���������Ƿ� �ٽ� �� �ᵵ �ȴ�.
		int kind = 0;
		CustomerInput customerInput;
		while(kind != 1 && kind != 2) { //Customer Ŭ������ ���� �Է�����, NonMemberCustomer Ŭ������ �Է����� ����.
			System.out.println(" 1 for Member");
			System.out.println(" 2 for Non-Member");
			System.out.println(" 3 for Vip");
			System.out.print("Select num 1, 2, or 3 for Customer kind : ");
			kind = input.nextInt();
			if (kind == 1) { //1�� ���ý� kind�� member�� customer Ŭ������ ����
				customerInput = new MemberCustomer(CustomerKind.Member);
				customerInput.getUserInput(input);
				customers.add(customerInput); //�Է��� customer ���� �迭 customers�� ����.
				break;
			}
			else if(kind == 2) { //2�� ���ý� kind�� nonmember�� nonmembercustomer Ŭ���� ����.
				customerInput = new NonMemberCustomer(CustomerKind.Nonmember);
				customerInput.getUserInput(input);
				customers.add(customerInput);
				break;
			}
			else if(kind == 3) { 
				customerInput = new VipCustomer(CustomerKind.Vip);
				customerInput.getUserInput(input);
				customers.add(customerInput);
				break;
			}
			else {
				System.out.print("Select num for Customer kind between 1 and 2 : ");
			}
		}
	}
	public void deleteCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		int index = findIndex(customerid);
		removefromCustomers(index, customerid);
	}
	
	public int findIndex(int customerid) {
		int index = -1;
		for (int i = 0; i<customers.size(); i++) {
			if (customers.get(i).getId() == customerid) { 
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromCustomers(int index, int customerid) {
		if (index >= 0) { //�Է��ߴ� ���� id�� ��ġ�ؼ� index�� i�� ���� ����� �� �����Ͽ� id��ġ�ϴ� �� ����.
			customers.remove(index);
			System.out.println("the customer" + customerid + "is deleted");
			return 1;
		}
		else {
			System.out.println("the customer has not been registered");
			return -1;
		}
	}
	
	public void editCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt(); //���� �Է��� ���� ����.
		for (int i = 0; i<customers.size(); i++) { //�迭 ũ�⸸ŭ �ݺ��� ����.
			CustomerInput customer = customers.get(i); //������ ������ customer�� customers�迭�� i��°�� customer�� ����.
			if (customer.getId() == customerid) {
				int num = -1;
				while(num != 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						customer.setCustomerID(input);
						break;
					case 2:
						customer.setCustomerName(input);
						break;
					case 3:
						customer.setCustomerPhone(input);
						break;
					case 4:
						customer.setCustomerBook(input);
						break;
					case 5:
						customer.setCustomerPeriod(input);
						break;
					default:
						continue;
					}
				}
			break;	
			}	
		}
	}
	public void viewCustomers() {
		System.out.println("# of registered customers : " + customers.size());
		for (int i = 0; i<customers.size(); i++) {
			customers.get(i).printInfo(); //�迭�ȿ� �ִ� customer�� �������� ���.
		}
	}
	
	public void showEditMenu() {
		System.out.println("~ Customer Info Edit Menu ~");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Phone");
		System.out.println(" 4. Edit Book");
		System.out.println(" 5. Edit Period");
		System.out.println(" 6. Exit");
		System.out.println("Select one menu between 1 - 6 : ");
	}

}
