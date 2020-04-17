import java.util.ArrayList;
import java.util.Scanner;

import customer.Customer;
import customer.NonMemberCustomer;

public class CustomerManager {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	Scanner input;
	CustomerManager(Scanner input){// MenuManager class에서 선언했던  Scanner input값을 불러온다.
		this.input = input; //불러온 input을 this.input으로 넣은 후 위에 선언된 input변수로 옮겨줌. 
	}                       //따라서 Scanner input = new Scanner(System.in)을 새로 적어주는 일을 안 하게됨.
	
	public void addCustomer() { //Scanner을 위에서 선언했으므로 다시 안 써도 된다.
		int kind = 0;
		Customer customer;
		while(kind != 1 && kind != 2) {
			System.out.print("1 for Member,");
			System.out.print(" 2 for Non-Member,");
			System.out.print(" Select num for Customer kind between 1 and 2 : ");
			kind = input.nextInt();
			if (kind == 1) {
				customer = new Customer();
				customer.getUserInput(input);
				customers.add(customer); //입력한 customer 값을 배열 customers에 저장.
				break;
			}
			else if(kind == 2) {
				customer = new NonMemberCustomer();
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
		int customerid = input.nextInt();//새로운 입력할 변수 선언
		int index = -1; //index값 설정.
		for (int i = 0; i<customers.size(); i++) {
			if (customers.get(i).getId() == customerid) { //입력 값과 추가했던 고객 id 일치시 index엔 i값 저장
				index = i;
				break;
			}
		}
		if (index >= 0) { //입력했던 고객의 id가 일치해서 index에 i의 값이 저장될 시 실행하여 id일치하는 고객 삭제.
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
		int customerid = input.nextInt(); //새로 입력할 변수 선언.
		for (int i = 0; i<customers.size(); i++) { //배열 크기만큼 반복문 실행.
			Customer customer = customers.get(i); //정보를 편집할 customer를 customers배열의 i번째의 customer로 저장.
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
						int id = input.nextInt(); //Customer class불러서 id값을 다시 입력하여 위의 add에서 저장했던 값을 바꾼다.
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
//		int customerid = input.nextInt(); //새로운 변수 값 입력.
		System.out.println("# of registered customers : " + customers.size());
		for (int i = 0; i<customers.size(); i++) {
			customers.get(i).printInfo(); //배열안에 있는 customer의 정보들을 출력.
		}
	}

}
