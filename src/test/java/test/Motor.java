package test;

public class Motor {
	
	//Attributes
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	//methods
	
	void cambiarRegistro(int newregistro) {
		this.registro = newregistro;
	}

	void asignarTipo(String newtipo) {
		
		String[] validTipos = {"electrico","gasolina"};
		
		boolean valid = false;
		
		for (String i : validTipos) {
			if (i.equals(newtipo)) {
				
				valid=true;
				this.tipo = newtipo;
				break;
			}
			
			if (!valid) {
				System.out.println(newtipo + "no es un tipo válido");
			}
		}
		
	}
}
