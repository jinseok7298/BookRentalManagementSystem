package customer;

import java.util.Scanner;

public class Customer {
	protected CustomerKind kind = CustomerKind.Member;
	protected String name; //customer�� ������ �Է��� ������ ����ޱ� ���� �������� ����.
	protected int id;
	protected String phone;
	protected String book;
	protected String period;
	
	public Customer() { //CustomerManager class���� customer = new Customer();�� �Ἥ �Է��� ������ �����ϱ� ���� ����.
		               // �����ڸ� ������ ����.
	}
	
	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Customer(String name, int id, String phone, String book, String period) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.book = book;
		this.period = period; //���� �̸��� �����Ͽ� thisŰ���� ��� �޼ҵ� ���� ������ �ƴ� Ŭ������ ������ ȣ���ϱ� ���� ����Ѵ�.this Ű����� ����� Ŭ���� �ڽ��� ����Ŵ.
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

	public void setPeriod(String period) {
		this.period = period;
	}

	
	public void printInfo() {//CustomerManager class�� view customer���� �ҷ����� ���� �Լ� ����.
		System.out.println("name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Customer ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Customer Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Phone number : ");
		String phone = input.next();
		this.setPhone(phone);
		
		String js = input.nextLine();
		System.out.print("Borrowed Book Name : ");
		String book = input.nextLine();
		this.setBook(book);
		
		System.out.print("Loan Period : ");
		String period = input.nextLine();
		this.setPeriod(period);
	}
}
