package grundlagen.rechner.OO;

public class RechnerOO {

	public static void additionUndAusgabe(int z1, int z2) {
		int ergebnis = z1 + z2;
		System.out.println("Addition von " + z1 + " und " + z2 + " ergibt = " + ergebnis);
		
	}

	public static void substraktionUndAusgabe(int z1, int z2) {
		int ergebnis = z1 - z2;
		System.out.println("Substraktion von "+ z1 +" und " + z2 + " ergibt = " + ergebnis);
		
	}
	
	public static void multiplizierenUndAusgeben(int z1, int z2) {
		int ergebnis = z1 * z2;
		System.out.println("Multiplikation von "+ z1 +" und " + z2 + " ergibt = " + ergebnis);
	}
	
	public static void dividierenUndAusgeben(int z1, int z2) {
		if(z2 != 0) {
			double ergebnis = z1 / z2;
			System.out.println("Division von " + z1 + " und " + z2 + " ergibt = " + ergebnis);
		}else {
			System.out.println("Division durch 0 ist nicht erlaubt");
		}
	
		
	}
	
	public static void main(String[] args) {
		additionUndAusgabe(23, 24);
		substraktionUndAusgabe(2,5);
		multiplizierenUndAusgeben(3, 7);
		dividierenUndAusgeben(3, 6);
	}
}	
	

