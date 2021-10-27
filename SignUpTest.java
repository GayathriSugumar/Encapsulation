package Encapsulation;

public class SignUpTest {

	public static void main(String[] args) {
		SignUp user=new SignUp();
		user.userSignUp("g3123@", 1234);
		user.userSignUp(123456789L, 123);
	}
	
}
