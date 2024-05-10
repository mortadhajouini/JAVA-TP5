package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class TestEx4 {
	
	public static void main(String[]args) {
		
		File f1 = new File("C:\\Users\\morta\\OneDrive\\Documents\\2éme année\\Java Avencée\\tp5\\Users.txt");
		File f2 = new File("C:\\Users\\morta\\OneDrive\\Documents\\2éme année\\Java Avencée\\tp5\\Users.txt");
		try {
		FileReader r = new FileReader(f1);
		FileWriter w = new FileWriter(f2);
		int caractere;
		int x=0;
		while ((caractere = r.read()) != -1) {
			
		w.write(caractere); 
		}
		r.close();
		w.close();
		}
		catch (IOException e) {
		e.printStackTrace();
		}

}
}