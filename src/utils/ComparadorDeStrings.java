package utils;

public class ComparadorDeStrings {

	public static boolean compara(String a, String b) {
		
		if(a.length() != b.length())return false;
			
		
		int i = 0;
		while(i<a.length()) {
			if(a.charAt(i) != b.charAt(a.length()-i-1)) return false;
			i++;
		}
		
		return true;
	}
}
