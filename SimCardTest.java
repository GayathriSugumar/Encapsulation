package Encapsulation;

public class SimCardTest {
	public static void main(String[] args) {
		SimCard SIM=new SimCard();
		SIM.setSubscriber("Airtel");
		SIM.setprice(300);
		SIM.setType("Nano SIM");
		SIM.setValidity("01/01/2030");
		System.out.println("SIM card subecriber is"+SIM.getSubscriber());
		System.out.println("Price of SIMr is"+SIM.getPrice());
		System.out.println("Type of SIM card is"+SIM.getType());
		System.out.println("Validity of SIM card  is"+SIM.getValidiyt());
		SIM.activation();
		SIM.block();
		SIM.port();
	}
}
