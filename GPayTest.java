package Encapsulation;

public class GPayTest {

	public static void main(String[] args) {
	GPay bill=new GPay();
	bill.billPayment(06474011207, 670);
	bill.billPayment(9008765390l, 599);
	bill.billPayment("Gayathri", 500);
	bill.billPayment("gayathri","1234 5678 0978", 5000);

	}

}
