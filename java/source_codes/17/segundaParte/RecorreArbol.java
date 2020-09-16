package segundaParte;
import java.io.File; 

public class RecorreArbol {

	 public void leer(String inicio,String altura) {
		 File ar = new File(inicio);
		 String[] dir = ar.list();
		 for (int f=0; f<dir.length; f++) {
			 File ar2 = new File(inicio+dir[f]);
		     if (ar2.isFile())
		    	 System.out.println(altura+dir[f]);
		     if (ar2.isDirectory()) {
		    	 System.out.println(altura + "Directorio:"+dir[f].toUpperCase());
		    	 leer(inicio +dir[f] +"\\", altura +" ");
		     } 
		 }
	 }

	 public static void main(String[] arguments) {
		 RecorreArbol rec = new RecorreArbol();
		 rec.leer("C:\\","");
	 }
}

//Recorrer un árbol de directorios en forma recursiva. 