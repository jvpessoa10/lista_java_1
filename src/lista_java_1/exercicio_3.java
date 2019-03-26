package lista_java_1;

import utils.ConversorDeMedidas;
import utils.Medidas;

public class exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Medidas test = new Medidas(
					"km",
					3.0,
					"kg",
					3.2,
					"C",
					2
				);
		
		Medidas test2 = new Medidas(
				"km",
				3.0,
				"kg",
				3.2,
				"f",
				2
			);
		
		ConversorDeMedidas conv =  new ConversorDeMedidas();
		
		System.out.println(conv.converterTemperatura(test, test2));

	}

}
