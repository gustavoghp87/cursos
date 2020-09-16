
public class Cuadrado {
	
	 private int lado;
	 
	 public Cuadrado(int lado) {
		 super();
		 this.lado = lado;
	 }
	 
	 public int getLado() {
		 return lado;
	 }
	 
	 public void setLado(int lado) {
		 this.lado = lado;
	 }
	 
	 @Override
	 public String toString() {
		 return "Cuadrado [lado=" + lado + "]";
	 }
	 
	 @Override
	 public int hashCode() {
		 final int prime = 31;
		 int result = 1;
		 result = prime * result + lado;
		 return result;
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;
		 if (getClass() != obj.getClass())
			 return false;
		 
		 Cuadrado other = (Cuadrado) obj;
		 if (lado != other.lado)
			 return false;
		 
		 return true;
	 }
	 
	 public static void main(String[] args) {
		 Cuadrado cuadradito = new Cuadrado(20);
		 System.out.println("El cuadrado tiene " +cuadradito.getLado()*cuadradito.getLado() + " metros cuadrados");
		 cuadradito.setLado(18);
		 System.out.println("El cuadrado tiene " +cuadradito.getLado()*cuadradito.getLado() + " metros cuadrados");
		 
		 Cuadrado cuadr2 = new Cuadrado(15);
		 System.out.println(cuadr2.equals(cuadradito));
		 
		 cuadr2.setLado(18);
		 System.out.println(cuadr2.equals(cuadradito));
		 
		 System.out.println(cuadr2.toString());
		 
		 System.out.println(cuadr2.hashCode());
	 }
}
