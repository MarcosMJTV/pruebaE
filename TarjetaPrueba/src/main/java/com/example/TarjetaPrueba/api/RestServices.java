package com.example.TarjetaPrueba.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestServices {

	@GetMapping("/importe")
	@ResponseBody
	public String consulta(@RequestParam(value = "marca") String marca,@RequestParam(value = "importe") float importe) {
		float tasa = TasaOperacion.obtenerTasa(marca);
		if(tasa == -1) {
			return "Marca de tarjeta no esta registrada";
		}else {
			return "la marca es: " +marca+", el importe es: " + importe + " y la tasa de operacion es: " + tasa;
		}		
	}		
	
}
