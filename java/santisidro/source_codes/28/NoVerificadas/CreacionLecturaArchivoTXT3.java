package NoVerificadas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionLecturaArchivoTXT3 {
	
	public static void crear() throws IOException {
		 
		 FileWriter fw = new FileWriter(new File("datos.txt"));
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write("Línea 1 finalmente");
		 bw.newLine();
		 bw.write("Línea 2 finalmente");
		 bw.close();
		 fw.close();
	}
		 
	public static void leer() throws IOException {
		 FileReader fr = new FileReader(new File("datos.txt"));
		 BufferedReader br = new BufferedReader(fr);
		 String linea = br.readLine();
		 while (linea != null) {
			 System.out.println(linea);
			 linea = br.readLine();
		 }
		 br.close();
		 fr.close();
	}
		 
	public static void main(String[] ar) throws IOException {
		crear();
		leer();
	}
}
