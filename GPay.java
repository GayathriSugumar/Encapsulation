package Encapsulation;

public class GPay {
	String name;
	long mobileNum;
	int amount;
	String creditNum;
	String UPINum;
	
	public GPay() {
		
	}
	public void billPayment(long mobilenum,int amount) {
		System.out.println("Recharge Successfull "+mobilenum);
	}
	public void billPayment(int electricity_no,int amount) {
		System.out.println("electricity bill amount "+amount+"paid successfully");
	}
	public void billPayment(String name,String creditCard_no,int amount) {
		System.out.println("credit card  "+creditCard_no+"payement "+amount+" paid successfully");
	}
	public void billPayment(String name,int amount) {
		System.out.println("Water bill amount "+amount+"paid successfully");
	}
	
	
}
