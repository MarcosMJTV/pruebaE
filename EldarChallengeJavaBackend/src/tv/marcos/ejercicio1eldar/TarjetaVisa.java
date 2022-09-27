package tv.marcos.ejercicio1eldar;

import java.time.LocalDate;


public class TarjetaVisa extends Tarjeta {

	public TarjetaVisa(long numeroTarjeta, String nombre, String apellido, int mes, int a�o) {
		super(numeroTarjeta, nombre, apellido, mes, a�o);
		tipo = "visa";
	}

	@Override
	public float obtenerTasa() {
		float tasa;
		int a�oActual = LocalDate.now().getYear() % (100);
		tasa = (float)a�oActual / LocalDate.now().getMonthValue();
		tasa = Math.max(0.3f, Math.min(5, tasa));		
		return tasa;
	}
}
