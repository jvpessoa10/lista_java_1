package lista_java_1;

import java.util.Scanner;

import utils.Comparador;

public class exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		int a;
		int b;
		int c;
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		Comparador comparador = new Comparador(a, b, c);
		
		System.out.println("RESULTADO:"+ String.valueOf(comparador.getMaior()));
		
		
		
		
		
		
	}
	
	
	
}
