package tv.marcos.ejercicio1eldar;

import java.time.LocalDate;

public abstract class Tarjeta {

	public long numeroTarjeta;
	public String nombre;
	public String apellido;
	public int mes;
	public int a�o;
	public String tipo;
	
	public Tarjeta(long numeroTarjeta,String nombre,String apellido, int mes, int a�o) {
		this.numeroTarjeta = numeroTarjeta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mes = mes;
		this.a�o = a�o;
	}
	
	public long getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
		
	public void ImprimirInfo() {
		System.out.println("Marca de la tarjeta: " + tipo);
		System.out.println("Numero de la tarjeta: " + numeroTarjeta);
		System.out.println("Cardholder: " + nombre + " " + apellido);
		System.out.println("Fecha de vencimiento: " + mes + "/" + a�o);
	}
	
	public boolean validarTarjeta() {
		if(a�o > LocalDate.now().getYear() % (100)) {
			return true;
		}else if(a�o == LocalDate.now().getYear() % (100)) {
			if(mes <= LocalDate.now().getMonthValue()) {
				return false;
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
	
	public boolean validarOperacion(int operacion) {
		if(operacion >= 1000 ) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public boolean equals(Object e) {
		Tarjeta t = (Tarjeta)e;
		if(t.getNumeroTarjeta() == numeroTarjeta && t.nombre.equals(nombre) && t.apellido.equals(apellido) &&
				t.mes == mes && t.a�o == a�o && t.tipo.equals(tipo)) {
			return true;
		}else {
			return false;
		}
	}
	
	public abstract float obtenerTasa();
}
