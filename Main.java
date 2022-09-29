import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {

	public static void main(String[] args) throws IOException {
		
		User1 user = new User1();
		
		user.name = "Marouane";
		user.password = "3>Mobi?ko";
		
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\Serializer2\\userInfood.ser");
		
	   ObjectOutputStream object = new ObjectOutputStream(fileOut);
	   
	   object.writeObject(user);
	   
	   fileOut.close();
	   object.close();
	   
	   System.out.println("file saved ! :)");
	   
	   long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
	   
	   System.out.println(serialVersionUID);

	}

}
