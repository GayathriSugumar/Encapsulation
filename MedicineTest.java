package Encapsulation;

public class MedicineTest {
	public static void main(String[] args) {
		Medicine medicine = new Medicine();
		medicine.setExp("03/10/2022");
		medicine.setName("DOLO");
		medicine.setMfDate("01/10/2021");
		medicine.setMg(50.0);
		medicine.setPrice(28);
		System.out.println("name of medicine is"+medicine.getName());
		System.out.println("Medicine  content in gm is"+medicine.getMg());
		System.out.println("Manufacturing date of medicine is"+medicine.getMfDate());
		System.out.println("Expiry date of medicine is"+medicine.getExp());
		System.out.println("price of Medicine is"+medicine.getPrice());
		medicine.medCure();
		
	}
}
