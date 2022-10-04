package Mes;

public class PruebaEnum {

	public static void main(String[] ar) {
		 Mes mes1 = Mes.AGOSTO;
		 System.out.println(mes1 +" " +mes1.retornarNumero() +"\n"); // AGOSTO 8
		 
		 for (Mes mes : Mes.values())
			 System.out.println(mes + " " + mes.retornarNumero());
		 
	 }

}


// Cuando se declara un enum heredamos un método llamado values que nos retorna un arreglo
//  con todos los valores enumerados de la declaración.


// public static void main(String[] ar) {
//     Mes[] meses = Mes.values();
//         for (int f = 0; f < meses.length; f++)
//             System.out.println(meses[f] + " " + meses[f].retornarNumero());
// }