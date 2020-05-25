import java.util.Scanner;
//import javax.swing.*;


public class Reihenauswahl extends GUI{
	int auf;
	GUI gui = new GUI();
	
	
	public void Reihe() {
		time();
		auf = 0;
		System.out.println("\nWelche der folgenden Reihen möchtest du durchgehen?\n");
		System.out.println(" -01 - Die 1-er Reihe");
		System.out.println(" -02 - Die 2-er Reihe");
		System.out.println(" -03 - Die 3-er Reihe");
		System.out.println(" -04 - Die 4-er Reihe");
		System.out.println(" -05 - Die 5-er Reihe");
		System.out.println(" -06 - Die 6-er Reihe");
		System.out.println(" -07 - Die 7-er Reihe");
		System.out.println(" -08 - Die 8-er Reihe");
		System.out.println(" -09 - Die 9-er Reihe");
		System.out.println(" -10 - Die 10-er Reihe");
		System.out.println(" -11 - Multimixer");
		
		time();
		System.out.println("\nSchreibe für die jeweillige Reihe die Zahl 1, 2, 3 usw. und drücke dann ENTER.");
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		int z = x.nextInt();
		rechne(z);
		
	}
	
	@SuppressWarnings("preview")
	public void rechne(int z) {
		switch(z) {
		case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:{
			test(z);
			break;
		}
		case 11:{
			MultiMixer MM = new MultiMixer();
			MM.MultiGes();
			Reihe();
		}
		default:{
			System.out.println("Wähle eine Reihe von [1-10] oder den MultiMixer [11] mit der entsprechenden Zahl\n");
			time();
			System.out.println("Gebe nun eine gültige Zahl ein! [1-11]");
			Scanner Wied = new Scanner(System.in);
			rechne(Wied.nextInt());
		}
		
		}
		
	}
	public void test(int z) {
		Scanner zahl = new Scanner(System.in);
		for(int w = 1; w <= 11; w++) {
			if(w == 11) {
				System.out.println("Glückwunsch du hast die " + z + "-er Reihe abgeschlossen!\n");
				System.out.println("Du hast " + auf + " Aufgaben absolviert");
				Reihe();
			}else{
			System.out.println("Was ist " + z + "*" + w);
			int n = zahl.nextInt();
			int t = z*w;
			if(n == t) {
				System.out.println("Das ist richtig\n");
				auf = auf+1;
				time();
			}else {
				System.out.println("\nLeider falsch, mache weiter\n\nDas Ergebnis wäre " + t + "\n");
			}
			}
		}
	}
	
	private void time() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		  }
	}
	
}