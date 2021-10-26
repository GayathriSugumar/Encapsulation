package Encapsulation;

public class PhonePe {
	String name;
	long mobile_no;
	int amount;
	
	public PhonePe() {
		
	}
	
	public void recharge(long mobile_no,int amount) {
		System.out.println("mobile recharge "+amount +" is successfully");
	}
	
	public void recharge(String name,String DTH_name,int amount) {
		System.out.println("DTH recharge "+amount +" is paid successfully");
	}
	
}
