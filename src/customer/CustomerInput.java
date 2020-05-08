package customer;

import java.util.Scanner;

public interface CustomerInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setPhone(String phone);
	
	public void setBook(String book);
	
	public void setPeriod(String period);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setCustomerID(Scanner input);
	
	public void setCustomerName(Scanner input);
	
	public void setCustomerPhone(Scanner input);
	
	public void setCustomerBook(Scanner input);
	
	public void setCustomerPeriod(Scanner input);
	
}
