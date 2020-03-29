package DomaciZadaci;

import java.util.Scanner;

public class Zadatak_03_0221 {

	public static void main(String[] args) {
		/* 	Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
			Hint: koristiti dve for petlje;
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite prvi broj: ");
		int h = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int l = sc.nextInt();
		
		for (int i=0; i<h; i++) {
			for (int j=0; j<l; j++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		
			}
		

	}
