package rekuirsion;

public class methoden {

	// main Methoden -ist die Methode
	// die beim Start des Programmes / der Klasse
	// aufgerufen wird
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addiere(10, 5);
		//
		System.out.println(mult(8, 7));
	}

	// eine "normale Methode"
	// dei erst - wenn sie aufgerufen wird - "durchlaufen" wird
	public static void spezielleMethode() {
		System.out.println("Ich bin speziell");
	}

	public static void addiere(int zahlA, int zahlB) {
		System.out.println(zahlA + zahlB);
	}

	public static int mult(int zahlA, int zahlB) {
		int ergebnis = zahlA * zahlB;
		return ergebnis;
	}
}
