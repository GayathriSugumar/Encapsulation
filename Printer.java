package Encapsulation;

public class Printer {
 
	public Printer() {
		System.out.println("Inside Printer");
	}
	
	public void print()
	{
		System.out.println("Inside print method");
		System.out.println("Print the document in default setting");
		
	}
	public void print(String size) {
		System.out.println("Print the document based on size "+size);
	}
	public void print(int startindex,int lastindex)
	{
		System.out.println("Print the document from "+startindex+" to"+lastindex);
	}
}
