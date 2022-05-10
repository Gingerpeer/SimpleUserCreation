import javax.swing.JOptionPane;
public class NewUser {
	String username;
	String password;
	private NewUser(String name, String pass) {
		// TODO Auto-generated constructor stub
		username = name;
		password = pass;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Please fill in your Username");
		String pass = JOptionPane.showInputDialog("Please fill in your Password");
		NewUser user1 = new NewUser(name, pass);
		System.out.println(user1.password);
	}

}
