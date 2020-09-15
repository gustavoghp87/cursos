import java.util.Scanner;
public class java009_4 {
	Scanner keyboard;
	int[] sueldos;
	public java009_4() {        // mismo nombre que la clase
		keyboard = new Scanner(System.in);
		sueldos = new int[5];
		for (int f=0; f<sueldos.length; f++) {
			System.out.print("Ingrese valor de sueldo: ");
			sueldos[f] = keyboard.nextInt();
		}
	}
	void imprimir() {
		for (int f=0; f<sueldos.length; f++) {
			System.out.print(sueldos[f] + " ");
		}
	}
	public static void main(String[] ar) {
		java009_4 op=new java009_4();
		op.imprimir();            // no se llama a la función cargar
		}
}

//Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación y carga del vector
//en el constructor.

//Como la clase se llama Operarios el constructor tiene el mismo nombre, no disponemos la
//palabra clave void ya que el constructor no puede retornar datos.

//La ventaja de plantear un constructor en lugar de definir un método con cualquier nombre es
//que se llamará en forma automática cuando se crea un objeto de esta clase.