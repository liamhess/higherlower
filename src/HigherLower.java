import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HigherLower {

	public void higherlower() throws InterruptedException {
		// Deklarieren der Variablen und Instanzen von benötigten Klassen
		int lives = 3;
		Wuerfel w = new Wuerfel();
		Scanner scan = new Scanner(System.in);
		int wurf1 = w.wuerfeln() + w.wuerfeln();
		int wurf2 = 0;
		
		// Ein Durchlauf der Schleife stellt eine Runde im Spiel dar
		// Die Schleife läuft bis der Spieler keine Leben mehr hat
		while (lives>0) {
			System.out.println("Sie haben noch " + lives + " Leben.");
			System.out.println("Die Augenzahl beträgt " + wurf1 + ", glauben Sie der nächste Wurf ist höher, niedriger oder gleich?");
			
			String userInput = scan.nextLine();
			wurf2 = w.wuerfeln() + w.wuerfeln();
			
			boolean equal = wurf2==wurf1;
			boolean higher = wurf2>wurf1;
			boolean lower = wurf2<wurf1;
			
			// Spiellogik
			if (userInput.equals("gleich")) {
				if (equal) {
					System.out.println("Gewonnen! Sie haben meine Liebe gebonen! Die zweite Augenzahl betrug " + wurf2);
				} else if (!equal) {
					lives--;
					System.out.println("Verloren :[ Die zweite Augenzahl betrug " + wurf2);
				}
			}	else if (userInput.equals("höher")) {
					if (higher) {
						System.out.println("Gewonnen! Sie haben meine Liebe gebonen! Die zweite Augenzahl betrug " + wurf2);
					} else if (lower) {
						lives--;
						System.out.println("Verloren :[ Die zweite Augenzahl betrug " + wurf2);
					}
				} else if (userInput.equals("niedriger")) {
					if (lower) {
						System.out.println("Gewonnen! Sie haben meine Liebe gebonen! Die zweite Augenzahl betrug " + wurf2);
					} else if (higher) {
						lives--;
						System.out.println("Verloren :[ Die zweite Augenzahl betrug " + wurf2);
					}
				} else {
					System.out.println("Sie haben sich wohl vertippt, Sie Narr ahahaha!!1111!!!11!");
				}
			
			// wurf2 wird an wurf1 weitergegeben, um den zweiten Wurf für die nächste Runde zu behalten
			wurf1 = wurf2;
			
			// Ladebalken
			System.out.print("\n[");
			for (int i = 0; i<100; i++) {
				System.out.print("=");
				TimeUnit.MILLISECONDS.sleep(10);
			}
			System.out.print("]\n\n");
		
		}
		
		System.out.println("Sie haben keine Leben mehr, das Spiel ist leider vorbei - Sie Penis!");
		scan.close();
	}
	 
}
