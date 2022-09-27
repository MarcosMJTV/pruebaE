package tv.marcos.ejercicio1eldar;

import java.time.LocalDate;

public class TarjetaNara extends Tarjeta{
	
	public TarjetaNara(long numeroTarjeta, String nombre, String apellido, int mes, int año) {
		super(numeroTarjeta, nombre, apellido, mes, año);
		tipo = "nara";
	}

	@Override
	public float obtenerTasa() {
		float tasa;
		tasa = LocalDate.now().getDayOfMonth() * 0.5f;
		tasa = Math.max(0.3f, Math.min(5, tasa));		
		return tasa;
	}
}
