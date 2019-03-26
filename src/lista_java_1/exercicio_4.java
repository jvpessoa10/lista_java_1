package lista_java_1;

import utils.Estatistica;

public class exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estatistica est = new Estatistica(5);
		
		
		est.printValues();
		
		System.out.println(est.somatorio());
		
		System.out.println(est.media());
	}

}
