package App;

import java.io.*;
public class TestCopy {
public static void main(String[] args) throws IOException {
File inputFile = new File("C:\\Users\\morta\\OneDrive\\Documents\\2éme année\\Java Avencée\\tp5\\in.txt");
File outputFile = new File("C:\\Users\\morta\\OneDrive\\Documents\\2éme année\\Java Avencée\\tp5\\out.txt");
try {
FileReader reader = new FileReader(inputFile);
FileWriter writer = new FileWriter(outputFile);
int caractere;
while ((caractere = reader.read()) != -1) {
writer.write(caractere); }
System.out.println("Copie terminée avec succès.");
reader.close();
writer.close();
}
catch (IOException e) {
e.printStackTrace();
}

}
}
