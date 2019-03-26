package lista_java_1;

import java.util.Scanner;

import utils.Calculadora;

public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a;
		double b;
		char op;
		
		a = in.nextDouble();
		b = in.nextDouble();
		op = in.next().charAt(0);
		
		Calculadora calc = new Calculadora();
		
		
		double output= 0;
		
		switch(op) {
		case '+':
			output = calc.somar(a, b);
			break;
		case '-':
			output = calc.subtrair(a, b);
			break;
		case '*':
			output = calc.multiplicar(a, b);
			break;
		case '/':
			output = calc.dividir(a, b);
			break;
		}
		
		System.out.println("RESULTADO: " + String.valueOf(output));
		
		
		

	}
	
	

}
