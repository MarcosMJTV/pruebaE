package tv.marcos.ejercicio1eldar;

import java.time.LocalDate;


public class TarjetaVisa extends Tarjeta {

	public TarjetaVisa(long numeroTarjeta, String nombre, String apellido, int mes, int año) {
		super(numeroTarjeta, nombre, apellido, mes, año);
		tipo = "visa";
	}

	@Override
	public float obtenerTasa() {
		float tasa;
		int añoActual = LocalDate.now().getYear() % (100);
		tasa = (float)añoActual / LocalDate.now().getMonthValue();
		tasa = Math.max(0.3f, Math.min(5, tasa));		
		return tasa;
	}
}
