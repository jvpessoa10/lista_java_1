package utils;

public class Estatistica {
	private int  maiorValor;


	
	public Estatistica(int maiorValor) {
		this.maiorValor = maiorValor;
		
	}
	
	
	public int somatorio() {
		int result = 0;
		
		for (int i  = 0; i <=maiorValor;i++) {
			result +=i;
		}
		return result;
	}
	
	public double media() {
		double result = 0.0;
		
		result = somatorio()/this.maiorValor;
		
		return result;
	}
	
	
	public double variancia() {
		double result = 0.0;
		
		result = (somatorio() - media())/(this.maiorValor -1);
		return result;
	}
	
	public void printValues() {
		int i = 1;
		
		do {
			System.out.println(i +" é " +((i%2 == 0)?"par":"impar"));
			
			i++;
		}while(i<=this.maiorValor);
			
			
	}
}
