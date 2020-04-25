package customer;

import java.util.Scanner;

public class Customer {
	protected CustomerKind kind = CustomerKind.Member; //�θ� Ŭ���� customer�� ������ member�� ����.
	protected String name; //protected�� ����Ͽ� �ڽ� Ŭ�������� �� �������� ����� �� �ְ��Ѵ�.
	protected int id;
	protected String phone;
	protected String book;
	protected String period; //customer�� ������ �Է��� ������ ����ޱ� ���� �������� ����.
	
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
		this.period = period; //���� �̸��� �����Ͽ� thisŰ���� ��� �޼ҵ� ���� ������ �ƴ� Ŭ������ ������ ȣ���ϱ� ���� ����Ѵ�.this Ű����� ����� Ŭ���� �ڽ��� ����Ŵ.
	}
	
	public CustomerKind getKind() { //������ ������ ���� ĸ��ȭ�� ���� getters�� setters�� ������ش�. 
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
		System.out.println("kind : " + skind + " name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period);
	}
	public void getUserInput(Scanner input) { //������ �Է¹��� �Լ� ����
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
