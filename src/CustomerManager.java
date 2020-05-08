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
	CustomerManager(Scanner input){// MenuManager class에서 선언했던  Scanner input값을 불러온다.
		this.input = input; //불러온 input을 this.input으로 넣은 후 위에 선언된 input변수로 옮겨줌. 
	}                       //따라서 Scanner input = new Scanner(System.in)을 새로 적어주는 일을 안 하게됨.
	
	public void addCustomer() { //Scanner을 위에서 선언했으므로 다시 안 써도 된다.
		int kind = 0;
		CustomerInput customerInput;
		while(kind != 1 && kind != 2) { //Customer 클래스에 고객을 입력할지, NonMemberCustomer 클래스에 입력할지 결정.
			System.out.println(" 1 for Member");
			System.out.println(" 2 for Non-Member");
			System.out.println(" 3 for Vip");
			System.out.print("Select num 1, 2, or 3 for Customer kind : ");
			kind = input.nextInt();
			if (kind == 1) { //1번 선택시 kind가 member인 customer 클래스를 선택
				customerInput = new MemberCustomer(CustomerKind.Member);
				customerInput.getUserInput(input);
				customers.add(customerInput); //입력한 customer 값을 배열 customers에 저장.
				break;
			}
			else if(kind == 2) { //2번 선택시 kind가 nonmember인 nonmembercustomer 클래스 선택.
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
		if (index >= 0) { //입력했던 고객의 id가 일치해서 index에 i의 값이 저장될 시 실행하여 id일치하는 고객 삭제.
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
		int customerid = input.nextInt(); //새로 입력할 변수 선언.
		for (int i = 0; i<customers.size(); i++) { //배열 크기만큼 반복문 실행.
			CustomerInput customer = customers.get(i); //정보를 편집할 customer를 customers배열의 i번째의 customer로 저장.
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
			customers.get(i).printInfo(); //배열안에 있는 customer의 정보들을 출력.
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
