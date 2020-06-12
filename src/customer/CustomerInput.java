package customer;

import java.util.Scanner;

import exception.PeriodFormatException;

public interface CustomerInput {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getPhone();
	
	public void setPhone(String phone);
	
	public String getBook();
	
	public void setBook(String book);
	
	public String getPeriod();
	
	public void setPeriod(String period) throws PeriodFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setCustomerID(Scanner input);
	
	public void setCustomerName(Scanner input);
	
	public void setCustomerPhone(Scanner input);
	
	public void setCustomerBook(Scanner input);
	
	public void setCustomerPeriod(Scanner input);
	
}
