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
		char answer = 'x'; //�θ�Ŭ������ �������� �ֱ����� ���� �κ��̴�.
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { //�ڵ��� ��ȣ�� �Է����� ���� ���Ѵ�.
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
