package customer;

import java.util.Scanner;

public class MemberCustomer extends Customer{

	public MemberCustomer(CustomerKind kind) { 
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setCustomerID(input);
		setCustomerName(input);
		setCustomerPhone(input);
		setCustomerBook(input);
		setCustomerPeriod(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + " name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period);
	}
}
