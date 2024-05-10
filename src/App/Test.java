package App;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Login= ");
    String login = scanner.nextLine();
    System.out.println("Mot de Passe= ");
    String mdp = scanner.nextLine();
    boolean okmdp=false;
    boolean oklogin=false;
    
    try (
    		BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\morta\\OneDrive\\Documents\\2éme année\\Java Avencée\\tp5\\in.txt")))
    		 {
    		String line;
    		while ((line = bReader.readLine()) != null) {
        	String[]ch=line.split(" ");
    		if(login.equals(ch[0])) {
    			oklogin=true;
    		}
    		if(mdp.equals(ch[1])) {
    			okmdp=true;
    		}
    		
    		if((okmdp==true)&&(oklogin==true)) {
    		    System.out.println("Authentification réussi ");
    		    break;
    		}
    		}
    		if((okmdp==false)&&(oklogin==false)) {
    		    System.out.println("PB Authentification ");
    		}
    		 }
    		catch (IOException e) { e.printStackTrace(); }
    		
}
}