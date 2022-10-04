public class Punto {

	 private int x, y;
	 
	 public Punto(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 public boolean equals(Object obj) {
		 Punto punto = (Punto) obj;
		 if (x == punto.x && y == punto.y)
			 return true;
		 else
			 return false;
	 }
	 
	 public static void main(String[] ar) {
		 Punto punto1 = new Punto(10, 2);
		 Punto punto2 = new Punto(10, 2);
		 Punto punto3 = new Punto(20, 4);
		 if (punto1.equals(punto2))
			 System.out.println("punto1 y punto2 pertenecen al mismo punto en el plano.");
		 if (punto1.equals(punto3))
			 System.out.println("punto1 y punto3 pertenecen al mismo punto en el plano.");
		 else
			 System.out.println("punto1 y punto3 no pertenecen al mismo punto en el plano.");
	 }
}
