package test;

public class Auto {
	
	//Attributes
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;

	//Methods
	
	int cantidadAsientos() {
		
		int count = 0;
		
		for (Asiento i : this.asientos) {
			if (i != null) {
				count++;
			}
		}
		
		return count;
	}
	
	String verificarIntegridad() {
	    for (Asiento i : this.asientos) {
	        if (i != null) {
	            if ((i.registro != this.registro)) {                    
	                return "Las piezas no son originales";
	            }
	        }
	    }
	    
	    if (this.registro == this.motor.registro) {
	        return "Auto original";
	    }
	    
	    return "Las piezas no son originales";
	}	

}
