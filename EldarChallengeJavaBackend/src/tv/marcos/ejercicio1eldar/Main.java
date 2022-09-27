package tv.marcos.ejercicio1eldar;

public class Main {

	
	public static void main(String[] args) {
		TarjetaVisa visa = new TarjetaVisa(54545345, "Marcos", "vilchez", 10, 28);
		TarjetaAmex amex = new TarjetaAmex(543545423, "Daniel", "Arrieta", 4, 30);
		TarjetaNara nara = new TarjetaNara(53453046, "Diego", "Morales", 12, 26);
		
		visa.ImprimirInfo();
		amex.ImprimirInfo();
		nara.ImprimirInfo();
				
		System.out.println(validarOperacion(nara, 800));
		System.out.println(validarOperacion(amex, 1500));
		
		System.out.println(validarTarjeta(visa));
		System.out.println(validarTarjeta(amex));
		
		System.out.println(diferenciarTarjetas(visa, nara));
		
		System.out.println(obtenerTasa(visa));
		System.out.println(obtenerTasa(nara));
		System.out.println(obtenerTasa(amex));
	}

	public static String diferenciarTarjetas(Tarjeta tarjeta1, Tarjeta tarjeta2) {
		if(tarjeta1.equals(tarjeta2) ) {
			return "la tarjeta " + tarjeta1.tipo + " y la tarjeta " +tarjeta2.tipo+" son iguales";
		}else {
			return "la tarjeta " + tarjeta1.tipo + " y la tarjeta " +tarjeta2.tipo+ " no son iguales";
		}
	}
	
	public static String validarTarjeta(Tarjeta tarjeta) {
		if(tarjeta.validarTarjeta() == true) {
			return "la tarjeta " + tarjeta.tipo + " es valida";
		}else {
			return "la tarjeta " + tarjeta.tipo + " no es valida";
		}
	}
	
	public static String validarOperacion(Tarjeta tarjeta, int monto) {
		if(tarjeta.validarOperacion(monto) == true) {
			return  "la operacion de la tarjeta "+ tarjeta.tipo +" es valida";
		}else {
			return  "la operacion de la tarjeta "+ tarjeta.tipo +" no es valida";
		}
	}
	
	public static String obtenerTasa(Tarjeta t) {
		return "La marca de la tarjeta es "+ t.tipo +" y la tasa de operaciones es: "+ Math.round(t.obtenerTasa()*100d)/100d ;
	}
	
}
