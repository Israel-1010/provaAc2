package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeAc2 {
	
	@RequestMapping(value = "/api1/{valor1}", method = RequestMethod.GET)
	public String somar(@PathVariable Integer valor1) {
		
		String par = "par";
		String impar ="impar";
		Integer resultado;	
	    Integer var1 = 2; 
	    
		 resultado = valor1  % var1;  
		 
		 if (resultado == 0)
		
	    return par;		
	    
		 else
			 
			 return impar;
	
	}
}