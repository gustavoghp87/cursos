import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionLecturaArchivoTXT {
	
	public static void main(String[] ar) {
		 FileWriter fw = null;
		 BufferedWriter bw = null;
		 try {
			 fw = new FileWriter(new File("datos2.txt"));
			 bw = new BufferedWriter(fw);
			 bw.write("Línea 1 datos2");
			 bw.newLine();
			 bw.write("Línea 2 datos2");
		 } catch (IOException ex) {
			 System.out.println("Problemas en la creación del archivo");
			 System.out.println(ex.getMessage());
		 } finally {
			 try {
				 if (bw != null)
					 bw.close();
				 if (fw != null)
					 fw.close();
			 } catch (IOException ex) {
				 System.out.println(ex.getMessage());
			 }
		 }
		 
		 FileReader fr = null;
		 BufferedReader br = null;
		 try {
			 fr = new FileReader(new File("datos2.txt"));
			 br = new BufferedReader(fr);
			 String linea = br.readLine();
			 while (linea != null) {
				 System.out.println(linea);
				 linea = br.readLine();
			 }
		 } catch (IOException ex) {
			 System.out.println("Problemas con la lectura del archivo");
			 System.out.println(ex.getMessage());
		 } finally {
			 try {
				 if (br != null)
					 br.close();
				 if (fr != null)
					 fr.close();
			 } catch (IOException ex) {
				 System.out.println(ex.getMessage());
			 }
		 }
	}
}
