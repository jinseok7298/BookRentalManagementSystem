
public class Customer {
	
	String name; //customer의 정보로 입력한 값들을 저장받기 위한 변수들을 선언.
	int id;
	String phone;
	String book;
	String period;
	
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
	
	public void printInfo() {//CustomerManager class의 view customer에서 불러오기 위한 함수 선언.
		System.out.println("name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period);
	}
}
