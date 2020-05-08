package customer;

import java.util.Scanner;

public class NonMemberCustomer extends SomeCustomer { 
	
	public NonMemberCustomer(CustomerKind kind) { 
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setCustomerID(input);
		setCustomerName(input);
		setCustomerPhonewithYN(input);
		setCustomerBook(input);
		setCustomerPeriod(input);
	}

}
