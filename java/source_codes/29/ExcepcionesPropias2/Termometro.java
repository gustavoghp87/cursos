package ExcepcionesPropias2;

public class Termometro {
	
	private float temperatura;
	
	public Termometro() {
		 this.temperatura = 0;
	}
	
	public Termometro(float temperatura) throws TemperaturaFueraRangoException {
		 if (temperatura < -192 || temperatura > 100)
			 throw new TemperaturaFueraRangoException("La temperatura esta fuera del rango [-192, 100]");
		 this.temperatura = temperatura;
	}
	
	public void cambiarTemperatura(float temperatura) throws TemperaturaFueraRangoException {
		 if (temperatura < -192 || temperatura > 100)
			 throw new TemperaturaFueraRangoException("La temperatura esta fuera del rango [-192, 100]");
		 this.temperatura = temperatura;
	}
	
	public void imprimir() {
		System.out.println("La temperatura actual del termometro es " + temperatura);
	}

	public static void main(String[] args) {
		try {
			 Termometro termometro1 = new Termometro();
			 termometro1.imprimir();
			 termometro1.cambiarTemperatura(50);
			 termometro1.imprimir();
			 termometro1.cambiarTemperatura(90);
			 termometro1.imprimir();
			 
			 Termometro termometro2 = new Termometro(-80);
			 termometro2.imprimir();
			 termometro2.cambiarTemperatura(-100);
			 termometro2.imprimir();
			 termometro2.cambiarTemperatura(-250);
			 termometro2.imprimir();
			 
		} catch (TemperaturaFueraRangoException ex) {
			 System.out.println(ex.getMessage());
		}
	}

}

// Plantear una clase llamada 'Termometro' que defina un atributo llamado temperatura. Lanzar una
//  excepción propia llamada 'TemperaturaFueraRangoException' si se intenta fijar una temperatura
//  con un valor menor a -192 o superior a 100.