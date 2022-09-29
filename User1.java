import java.io.Serializable;

public class User1 implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	String name;
	String password;

	
	public void sayHello() {
		System.out.println("Hello "+name);
	}
}
