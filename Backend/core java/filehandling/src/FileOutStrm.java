import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStrm {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream f1= new FileOutputStream("harshi.txt");
			
			String s1= "suraj khan";
			
			byte b1[] = s1.getBytes();
			f1.write(b1);
			
			System.out.println("success.....");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
