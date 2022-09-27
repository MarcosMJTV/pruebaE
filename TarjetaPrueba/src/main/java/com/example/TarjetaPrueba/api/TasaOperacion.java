package com.example.TarjetaPrueba.api;

import java.time.LocalDate;

public final class TasaOperacion {
	
	private TasaOperacion() {
		
	}
	
	public static float obtenerTasa(String marca) {
		if(marca.toLowerCase().equals("visa")) {
			return obtenerTasaVisa();	
		}else if(marca.toLowerCase().equals("nara")) {
			return obtenerTasaNara();
		}else if(marca.toLowerCase().equals("amex")){
			return obtenerTasaAmex();
		}else {
			return -1;
		}
	}
	
	private static float obtenerTasaAmex() {
		float tasa;
		tasa = LocalDate.now().getMonthValue() * 0.1f;
		tasa = Math.max(0.3f, Math.min(5, tasa));
		return tasa;
	}
	
	private static float obtenerTasaNara() {
		float tasa;
		tasa = LocalDate.now().getDayOfMonth() * 0.5f;
		tasa = Math.max(0.3f, Math.min(5, tasa));		
		return tasa;
	}
	
	private static float obtenerTasaVisa() {
		float tasa;
		int añoActual = LocalDate.now().getYear() % (100);
		tasa = (float)añoActual / LocalDate.now().getMonthValue();
		tasa = Math.max(0.3f, Math.min(5, tasa));		
		return tasa;
	}

}
