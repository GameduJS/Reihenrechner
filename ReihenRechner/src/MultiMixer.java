import java.util.Random;
import java.util.Scanner;

public class MultiMixer {
	int auf;
	Scanner s = new Scanner(System.in);
	
	public void MultiGes() {
		System.out.println("Willkommen beim MultiMixer\n\n");
		time();
		System.out.println("Anleitung:\n");
		time();
		System.out.println("Es kommen 10 mal verschiede generierte Zahlen die du zusammen rechnen sollst!\n");
		time();
		System.out.println( "Let's Go.\n");
		
		Random rnd = new Random();
		Random rnd2 = new Random();
		
		for(int i = 1; i<= 10; i++) {
			int x = rnd.nextInt(8)+1;
			int y = rnd2.nextInt(8)+1;
			x=x+2; y=y+2;
			int t = x*y;
			
			System.out.println("Was ergibt " + x + "*" +y);
			int ein = s.nextInt();
			if(i == 10) {
				if(ein != t) {
					System.out.println("\nGeschafft!");
					System.out.println("Du hast " + auf + " Aufgaben geschafft");
				}else {
				System.out.println("\nGeschafft!");
				System.out.println("Du hast " + auf + " Aufgaben geschafft");
				}
			}
			else {
				if(ein == t) {
					System.out.println("\nRichtig [" + x + "*" + y +" ist " + t + "]\n");
					auf = auf+1;
					time();
					
				
				}else {
					System.err.println("Leider FALSCH! Das Ergebnis wäre " + t);
					time();
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
