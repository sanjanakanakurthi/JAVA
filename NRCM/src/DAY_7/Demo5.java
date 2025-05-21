package DAY_7;
import java.io.*;
import java.util.Scanner;
public class Demo5 {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File obj = new File("C:\\Users\\sanja\\OneDrive\\Documents\\Desktop\\Sample234.txt");
		Scanner Reader = new Scanner(obj);
		while(Reader.hasNextLine()) {
			String data = Reader.nextLine();
			System.out.println(data);
			throw new FileNotFoundException("File ledhu");
		}
		Reader.close();
		
	}

}
