package tv.marcos.ejercicio1eldar;

import java.time.LocalDate;

public class TarjetaAmex extends Tarjeta{
	
	public TarjetaAmex(long numeroTarjeta, String nombre, String apellido, int mes, int año) {
		super(numeroTarjeta, nombre, apellido, mes, año);
		tipo = "amex";
	}

	@Override
	public float obtenerTasa() {
		float tasa;
		tasa = LocalDate.now().getMonthValue() * 0.1f;
		tasa = Math.max(0.3f, Math.min(5, tasa));
		return tasa;
	}
}
