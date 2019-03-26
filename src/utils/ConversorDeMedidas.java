package utils;

public class ConversorDeMedidas {
	
	
	public String converterMassa(Medidas medida1, Medidas medida2) {
		String result = "";
		
		double massa1 = medida1.getMassa();
		
		if("kg".equals(medida1.getUnidadeDeMassa())) {
			result = String.valueOf(massa1*2.2046) + " lb";
		}else {
			result = String.valueOf(massa1/2.2046) + " kg";
		}
	
		return result;
	}
	
	public String converterTemperatura(Medidas medida1, Medidas medida2) {
		String result = "";
		
		int temp1 = medida1.getTemperatura();
		
		if("C".equals(medida1.getUnidadeDeTemperatura())) {
			result = String.valueOf(temp1*1.8+32) + " F";
		}else {
			result = String.valueOf((temp1 - 32)/1.8 ) + " C";
		}
	
		return result;
	}
	
	public String converterDistancia(Medidas medida1, Medidas medida2) {
		String result = "";
		
		double dist1 = medida1.getDistancia();
		
		if("m".equals(medida1.getUnidadeDeDistancia())) {
			result = String.valueOf(dist1*1.609) + " km";
		}else {
			result = String.valueOf(dist1/1.609 ) + " m";
		}
	
		return result;
	}
}
