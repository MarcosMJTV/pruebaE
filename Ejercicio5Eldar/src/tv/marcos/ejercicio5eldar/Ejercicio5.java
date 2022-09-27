package tv.marcos.ejercicio5eldar;

public class Ejercicio5 {	
	
	public static void main(String[] args) {
		String[] example = new String[]{"JKHK","JHKJHKJ","LKJKLKL"};		
		System.out.println(arrayJoin(example));
		
		String[] example2 = new String[]{"FirstWord","SecondWord","THIRDWORD"};		
		System.out.println(arrayJoin(example2));
	}
	
	public static String arrayJoin(String[] array) {		
		String str = String.join(" ", array).toLowerCase();
		return str;
	}
}
