package customer;

import java.util.Scanner;

public class Customer {
	protected CustomerKind kind = CustomerKind.Member;
	protected String name; //customer의 정보로 입력한 값들을 저장받기 위한 변수들을 선언.
	protected int id;
	protected String phone;
	protected String book;
	protected String period;
	
	public Customer() { //CustomerManager class에서 customer = new Customer();를 써서 입력한 값들을 저장하기 위해 써줌.
		               // 생성자를 선언한 것임.
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
		this.period = period; //변수 이름이 동일하여 this키워드 사용 메소드 내의 변수가 아닌 클래스의 변수를 호출하기 위해 사용한다.this 키워드는 선언된 클래스 자신을 가리킴.
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

	
	public void printInfo() {//CustomerManager class의 view customer에서 불러오기 위한 함수 선언.
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
