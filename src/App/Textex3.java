package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Textex3 {
	
	public static void main(String[]args) {
	int x=0;
	int x1=0;
	int x2=0;
	File f = new File("C:\\Users\\morta\\OneDrive\\Documents\\2éme année\\Java Avencée\\tp5\\in.txt");
try(
	BufferedReader bReader = new BufferedReader(new FileReader(f)))
{
	String line;
while ((line = bReader.readLine()) != null) {
	x=x+1;
	x1=x1+line.length();
	StringTokenizer tokenizer = new StringTokenizer(line);
    x2 =x2+ tokenizer.countTokens();
}
System.out.println("Le nombre de Ligne: "+x);
System.out.println("Le nombre de caracteres: "+x1);
System.out.println("Le nombre de mots: "+x2);

}
catch (IOException e) { e.printStackTrace(); }

}
}