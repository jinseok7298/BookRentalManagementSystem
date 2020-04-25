package customer;

import java.util.Scanner;

public class NonMemberCustomer extends Customer { //Customer 클래스의 자식클래스를 만들어서 부모클래스의 내용들을 상속 받는다.
	
	public NonMemberCustomer(CustomerKind kind) { 
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Customer ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Customer Name : ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x'; //부모클래스와 차이점을 주기위해 만든 부분이다.
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { //핸드폰 번호를 입력할지 말지 정한다.
			System.out.print("Do you want to enter your phone number ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Phone number : ");
				String phone = input.next();
				this.setPhone(phone);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}
		}
		
		String js = input.nextLine();
		System.out.print("Borrowed Book Name : ");
		String book = input.nextLine();
		this.setBook(book);
		
		System.out.print("Loan Period : ");
		String period = input.nextLine();
		this.setPeriod(period);
	}
}
