package utils;

public class Medidas {
	private String unidadeDeDistancia;
	private double distancia;
	private String unidadeDeMassa;
	private double massa;
	private String unidadeDeTemperatura;
	private int temperatura;
	
	
	public Medidas() {
		
	}
	
	
	public Medidas(String unidadeDeDistancia, double distancia, String unidadeDeMassa, double massa,
			String unidadeDeTemperatura, int temperatura) {
		super();
		
		try {
			checkUnidadeDeMassa(unidadeDeMassa);
			checkUnidadeDeTemperatura(unidadeDeTemperatura);
			checkUnidadeDeDistancia(unidadeDeDistancia);
		}catch(Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException();
		}
		
		this.unidadeDeDistancia = unidadeDeDistancia;
		this.distancia = distancia;
		this.unidadeDeMassa = unidadeDeMassa;
		this.massa = massa;
		this.unidadeDeTemperatura = unidadeDeTemperatura;
		this.temperatura = temperatura;
	}
	
	
	
	public String getUnidadeDeDistancia() {
		return unidadeDeDistancia;
	}
	public void setUnidadeDeDistancia(String ud) {
		try {
			checkUnidadeDeDistancia(ud);
		}catch(Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException();
		}
		
		this.unidadeDeDistancia = ud;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public String getUnidadeDeMassa() {
		return unidadeDeMassa;
	}
	public void setUnidadeDeMassa(String um) {
		try {
			checkUnidadeDeMassa(um);
		}catch(Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException();
		}
		
		this.unidadeDeMassa = um;
	}
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public String getUnidadeDeTemperatura() {
		return unidadeDeTemperatura;
	}
	public void setUnidadeDeTemperatura(String ut) {
		try {
			checkUnidadeDeMassa(ut);
		}catch(Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException();
		}
		
		this.unidadeDeTemperatura = ut;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
	
	
	public void checkUnidadeDeMassa(String a) throws Exception {
		a = a.toLowerCase();
		if(!"kg".equalsIgnoreCase(a) && !"lb".equalsIgnoreCase(a)) {
			throw new Exception("Unidade de massa invalida");
		}
	}
	
	public void checkUnidadeDeTemperatura(String a) throws Exception {
		if(!"c".equalsIgnoreCase(a) && !"f".equalsIgnoreCase(a)) {
			throw new Exception("Temperatura invalida: "+a);
		}
	}
	
	public void checkUnidadeDeDistancia(String a) throws Exception {
		a = a.toLowerCase();
		if(!"km".equalsIgnoreCase(a) && !"mi".equalsIgnoreCase(a)) {
			throw new Exception("Unidade de distancia invalida");
		}
	}
	
	
	
}
