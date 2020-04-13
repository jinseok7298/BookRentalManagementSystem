import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	Scanner input;
	CustomerManager(Scanner input){// MenuManager class���� �����ߴ�  Scanner input���� �ҷ��´�.
		this.input = input; //�ҷ��� input�� this.input���� ���� �� ���� ����� input������ �Ű���. 
	}                       //���� Scanner input = new Scanner(System.in)�� ���� �����ִ� ���� �� �ϰԵ�.
	
	public void addCustomer() { //Scanner�� ������ ���������Ƿ� �ٽ� �� �ᵵ �ȴ�.
		Customer customer = new Customer(); //Customer class �ҷ��ͼ� ���ο� �� �����ϱ� ���Ͽ� ���.
		System.out.print("Customer ID : ");
		customer.id = input.nextInt(); //Customer class ���� id �������� �Է��� ���� ������.
		
		System.out.print("Customer Name : ");
		customer.name = input.next();
		
		System.out.print("Phone number : ");
		customer.phone = input.next();

		String js = input.nextLine();
		//String js = input.nextLine();�� �Է��� ������ nextLine �̿�� ����Ű�� �������� �νĵǴ� ���� ��������.
		System.out.print("Borrowed Book Name : ");
		customer.book = input.nextLine();
		System.out.print("Loan Period : ");
		customer.period = input.nextLine();
		
		customers.add(customer); //�Է��� customer ���� �迭 customers�� ����.
	}
	public void deleteCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();//���ο� �Է��� ���� ����
		int index = -1; //index�� ����.
		for (int i = 0; i<customers.size(); i++) {
			if (customers.get(i).id == customerid) { //�Է� ���� �߰��ߴ� �� id ��ġ�� index�� i�� ����
				index = i;
				break;
			}
		}
		if (index >= 0) { //�Է��ߴ� ���� id�� ��ġ�ؼ� index�� i�� ���� ����� �� �����Ͽ� id��ġ�ϴ� �� ����.
			customers.remove(index);
			Customer.numcustomersRegistered--;
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
			if (customer.id == customerid) {
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
						customer.id = input.nextInt(); //Customer class�ҷ��� id���� �ٽ� �Է��Ͽ� ���� add���� �����ߴ� ���� �ٲ۴�.
					}
					else if(num == 2) {
						System.out.print("Customer Name : ");
						customer.name = input.next();
					}
					else if(num == 3) {
						System.out.print("Phone number : ");
						customer.phone = input.next();
					}
					else if(num == 4) {
						String js = input.nextLine();
						System.out.print("Borrowed Book Name : ");
						customer.book = input.nextLine();
					}
					else if(num == 5) {
						String js = input.nextLine();
						System.out.print("Loan Period : ");
						customer.period = input.nextLine();
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
		System.out.println("# of registered customers : " + Customer.numcustomersRegistered);
		for (int i = 0; i<customers.size(); i++) {
			customers.get(i).printInfo(); //�迭�ȿ� �ִ� customer�� �������� ���.
		}
	}

}
