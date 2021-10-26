package Encapsulation;

public class HDTest {
	public static void main(String[] args) {
		HardDisk harddisk = new HardDisk();
		harddisk.dispInfo();
		harddisk.setBrnd("hp");
		harddisk.setCapacity("1 TB");
		harddisk.setConnectivity("Wireless");
		harddisk.setPrice(4000);
		System.out.println("Brand is" + harddisk.getBrand());
		System.out.println("Capacity of Harddisk  is" + harddisk.getCapacity());
		System.out.println("Connectivity is" + harddisk.getConnectivity());
		System.out.println("price of HardDisk is" + harddisk.getPrice());

	}
}
