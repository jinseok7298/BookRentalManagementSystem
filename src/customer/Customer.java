package customer;

import java.util.Scanner;

import exception.PeriodFormatException;

public abstract class Customer implements CustomerInput{
	protected CustomerKind kind = CustomerKind.Member; 
	protected String name;
	protected int id;
	protected String phone;
	protected String book;
	protected String period;
	
	public Customer() { 
	}
	
	public Customer(CustomerKind kind) { 
		this.kind = kind;
	}
	
	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Customer(CustomerKind kind, String name, int id, String phone, String book, String period) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.book = book;
		this.period = period;
	}
	
	public CustomerKind getKind() { 
		return kind;
	}

	public void setKind(CustomerKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) throws PeriodFormatException {
		if(!period.contains("~")) {
			throw new PeriodFormatException();
		}
		this.period = period;
	}

	public abstract void printInfo();
	
	
	public void setCustomerID(Scanner input) {
		System.out.print("Customer ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setCustomerName(Scanner input) {
		System.out.print("Customer Name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setCustomerPhone(Scanner input) {
		System.out.print("Customer Phone Number : ");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public void setCustomerBook(Scanner input) {
		String js = input.nextLine();
		System.out.print("Borrowed Book Name : ");
		String book = input.nextLine();
		this.setBook(book);
	} 
	
	public void setCustomerPeriod(Scanner input) {
		String period = "";
		while (!period.contains("~")) {
			System.out.print("Loan Period : ");
			period = input.nextLine();
			try {
				this.setPeriod(period);
			} catch (PeriodFormatException e) {
				System.out.println("Incorrect Period Format. Put the loan period that contains '~'");
			}
		}
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Member:
			skind = "Member";
			break;
		case Nonmember:
			skind = "Nonmember";
			break;
		case Vip:
			skind = "Vip";
			break;
		case Family:
			skind = "Family";
			break;
		default :
		}
		return skind;
	}
}
