package DomaciZadaci;

public class Zadatak_02_0221 {

	public static void main(String[] args) {
		// Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.
		int sum = 0;
		for (int i=9; i<=250; i++) {
			if (i%3==0) sum +=1;
		}
		System.out.println("Izmedju 9 i 250, nalazi se ukupno "+sum+" brojeva deljivih sa 3.");
	}

}
