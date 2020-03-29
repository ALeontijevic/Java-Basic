package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_02_0206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite pun naziv meseca: ");
		String mesec = sc.nextLine();
		int n = 0;
		switch (mesec) {
		case "januar": case "Januar":
		case "jun": case "Jun":
		case "jul": case "Jul":
			n=3;
			break;
		case "februar": case "Februar":
			n=1;
			break;
		case "maj": case "Maj":
		case "mart": case "Mart":
			n=2;
			break;
		case "april": case "April":
		case "avgust": case "Avgust":
			n=2;
			break;
		case "septembar": case "Septembar":
			n=1;
			break;
		case "oktobar": case "Oktobar":
			n=1;
			break;
		case "novembar": case "Novembar":
			n=1;
			break;
		case "decembar": case "Decembar":
			n=1;
			break;
		default: System.out.println("Unesite pun naziv meseca.");
		}
		switch(n) {
		case 3: 
		case 2: System.out.println("U godini ima "+ n + " meseca koji pocinju istim slovom.");
		break;
		case 1: System.out.println("U godini ima "+ n + " mesec koji pocinje istim slovom.");
		break;
		}
	}

}
