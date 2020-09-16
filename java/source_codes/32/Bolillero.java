public class Bolillero {

	 private int[] vec;
	 
	 public Bolillero() {
		 vec = new int[50];
		 generar();
	 }
 
	 public void generar() {
		 for (int f = 0; f < vec.length; f++) {
			 vec[f] = 1 + (int) (Math.random() * 50);
			 
			 for (int k = 0; k < f; k++)
				 if (vec[f] == vec[k]) {
					 f--;
					 break;
				 }
		 }
	 }
 
	 public String toString() {
		 String cad = "[";
		 for (int f = 0; f < vec.length; f++)
			 cad += vec[f] + " ";
		 cad += "]";
		 return cad;
	 }
 
	 public static void main(String[] ar) {
		 Bolillero bolillero1 = new Bolillero();
		 System.out.println(bolillero1);
	 }

}