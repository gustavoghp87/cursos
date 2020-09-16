
public class GenerarEstados {

	
    
    public static void main(String[] args) {
 
    	String[] alumnos = { "juan", "ana", "luis", "carla", "pedro", "laura", "maria" };
        int[] notas = { 3, 7, 10, 9, 2, 8, 5 };
        String[] libres = new String[notas.length];
        
        
    	for (int i = 0; i < alumnos.length; i++) {
    		if (notas[i] >= 4)
    			libres[i] = "regular";
    		else
    			libres[i] = "libre";
    		System.out.println(alumnos[i] + " tiene una nota " + notas[i] + " está " + libres[i]);
    	}

    	for (int f = 0; f < alumnos.length; f++) {
    		libres[f] = notas[f] >= 4 ? "regular" : "libre";
    		System.out.println(alumnos[f] + " tiene una nota " + notas[f] + " está " + libres[f]);
    	}
    
    }
}

// Se tienen los siguientes vectores paralelos con las notas y nombres de alumnos:
//  String[] alumnos = { "juan", "ana", "luis", "carla", "pedro", "laura", "maria" };
//  int[] notas = { 3, 7, 10, 9, 2, 8, 5 };
// Generar otro vector paralelo con el String "libre" si la nota es menor a 4 y la cadena "regular" si la nota es
//  mayor o igual a cuatro.
// Emplear el operador condicional para cargar el vector paralelo.