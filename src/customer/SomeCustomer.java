package customer;

import java.util.Scanner;

public abstract class SomeCustomer extends Customer {

	public SomeCustomer(CustomerKind kind) { 
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + " name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period);
	}

	public void setCustomerPhonewithYN(Scanner input) {
		char answer = 'x'; //부모클래스와 차이점을 주기위해 만든 부분이다.
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { //핸드폰 번호를 입력할지 말지 정한다.
			System.out.print("Do you want to enter your phone number ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setCustomerPhone(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}
		}
	}
	
}
