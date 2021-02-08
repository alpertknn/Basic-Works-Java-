import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionEx {

	public static void main(String[] args) {
		try{
			File file =new File("E://text.txt");
			
			FileReader fr= new FileReader(file);
		}
		catch(FileNotFoundException e){
			System.out.println("File doesnt exist.");
		}
	}

}
