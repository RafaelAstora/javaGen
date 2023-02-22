package atvd4;

import java.util.ArrayList;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia f1 = new Farmacia(1, 10.0 ,"dipirona","novalgina","-","NeoQuimica");	
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>(); 
		
		medicamentos.add(f1);
		
		for (var med : medicamentos) {
			med.visualizar();
		}

	}

	
	
}
