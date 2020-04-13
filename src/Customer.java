
public class Customer {
	
	String name; //customer�� ������ �Է��� ������ ����ޱ� ���� �������� ����.
	int id;
	String phone;
	String book;
	String period;
	
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
	
	public void printInfo() {//CustomerManager class�� view customer���� �ҷ����� ���� �Լ� ����.
		System.out.println("name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period);
	}
}
