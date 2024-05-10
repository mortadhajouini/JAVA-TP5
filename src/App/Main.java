package App;

import java.io.File;
import java.io.IOException;

import static java.lang.System.*;
import java.util.Date;
public class Main {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Répertoire courant : "+ System.getProperty("user.dir"));
		File rep = new File(".");
		System.out.println("Chemin relatif : "+ rep.getPath());
		System.out.println("Chemin absolu : "+ rep.getAbsolutePath());
		for (File élément: rep.listRoots())
		System.out.println("Racine : "+élément);
		 
		for (File élément :rep.listFiles())
		 if (élément.isDirectory()) {
		 System.out.print(élément.getName()+"\t");
		 if (élément.getName().length()<8) { 
		 System.out.print("\t");
		System.out.println("<REP>");
		}
		 }
		 
		for (File élément : rep.listFiles())
		if (élément.isFile()){
		 out.print(élément.getName()+"\t");
		if (élément.getName().length()<8) out.print("\t");
		 out.printf("%tc", new Date(élément.lastModified()));
		 out.printf("\t%10d octets\n", élément.length());
		 }
		 }
		}

