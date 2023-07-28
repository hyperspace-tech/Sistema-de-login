
public class Main {

	public static void main(String[] args) {
		
		IDandPassword IDandPassword = new IDandPassword();
		
		LoginPage LoginPage = new LoginPage(IDandPassword.getlogininfo());
	}

}
