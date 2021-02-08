import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class File {

	public static void main(String[] args) {
		String line;
		try {
			
			FileReader fileReader = new FileReader("a.txt");
			BufferedReader br = new BufferedReader(fileReader);

				while ((line = br.readLine()) != null) {
				 System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}


	}

}
