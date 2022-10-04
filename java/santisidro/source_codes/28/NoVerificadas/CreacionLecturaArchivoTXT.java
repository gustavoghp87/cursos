package NoVerificadas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionLecturaArchivoTXT {
	public static void main(String[] ar) {
		 
		try {
			 FileWriter fw = new FileWriter(new File("datos.txt"));
			 BufferedWriter bw = new BufferedWriter(fw);
			 bw.write("Línea 1 del archivo");
			 bw.newLine();
			 bw.write("Línea 2 del archivo");
			 bw.close();
			 fw.close();
		 } catch (IOException ex) {
			 System.out.println("Problemas en la creación del archivo");
			 System.out.println(ex.getMessage());
		 }
		 
		 try {
			 FileReader fr = new FileReader(new File("datos.txt"));
			 BufferedReader br = new BufferedReader(fr);
			 String linea = br.readLine();
			 while (linea != null) {
				 System.out.println(linea);
				 linea = br.readLine();
			 }
			 br.close();
			 fr.close();
		 } catch (IOException ex) {
			 System.out.println("Problemas con la lectura del archivo");
			 System.out.println(ex.getMessage());
		 }
	}
}

// Crear un archivo de texto con dos líneas. Luego proceder a leer el contenido
//  del archivo de texto y mostrarlo por pantalla.