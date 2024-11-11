package test;

public class Asiento {
	
	//Attributes
	
	String color;
	int precio;
	int registro;
	
	//Methods
	
	void cambiarColor(String newColor){

		
		String[] validColors = {"rojo","verde","amarillo","negro","blanco"};
		
		boolean valid = false;
		
		for (String i : validColors) {
			if (i.equals(newColor)) {
				
			valid = true;
			this.color = newColor;
			break;
				
			}
			
			if (!valid) {
			System.out.println(newColor + "no es un color válido");
			}
		}
		
		
		
	}
}
	

