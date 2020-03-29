package DomaciZadaci;

public class Zadatak_03_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci
		 * promenljive a, b, c koje su i deklarisane i definisane (kao sto smo na tabli
		 * vezbali na casu)
		 */
		int a = 23;
		int b = 77;
		int c = 90;

		System.out.println("Pre dekrement (--i), primer 1:");
		b = --a + --c;
		System.out.println(a + " " + b + " " + c);
		/*
		 * a se umanjuje za 1 (ucitavamo a=22) 
		 * c se umanjuje za 1 (ucitavamo c=89) 
		 * b se dodeljuje vrednost: 22 + 89 = 111;
		 * konacno: a=22, b = 111, c=89;
		 */
		System.out.println();
		System.out.println("Pre dekrement (--i), primer 2:");
		b = --a + --c - --a + --b;
		System.out.println(a + " " + b + " " + c);
		/*
		 * a se umanjuje za 1 (ucitava se a=21); c se umanjuje za 1 (ucitava se c=88); a se ponovo umanjuje za 1
		 * (ucitava se a=20); b se umanjuje za 1 (ucitava se b=110); 
		 * b se dodeljuje vrednost: 21+88-20+110 = 199
		 * konacno: a = 20, b = 199, c = 88
		 */
		System.out.println();
		System.out.println("Post dekrement (i--), primer 1:");
		b = a-- + b-- - c-- - a--;
		System.out.println(a + " " + b + " " + c);
		/*
		 * a se ucitava (20), a zatim umanjuje za 1 (a=19); b se ucitava (199), a zatim umanjuje za 1
		 * (b=198); c se ucitava (88), a zatim umanjuje za 1 (c=87); a se ucitava (19), a zatim umanjuje za 1 (a=18)
		 * b se dodeljuje vrednost: 20+199-88-19 = 112
		 * konacno: a = 18, b = 112, c = 87
		 * */
		System.out.println();
		System.out.println("Post dekrement (i--), primer 2:");
		b = b-- + c-- + b-- - a--;
		System.out.println(a + " " + b + " " + c);
		/*
		 * b se ucitava (112), zatim se umanjuje za 1 (111); c se ucitava (87), zatim se umanjuje za 1 (86);
		 * b se ucitava (111), zatim se umanjuje za 1 (110); a se ucitava (18), zatim umanjuje za 1 (17)
		 * b se dodeljuje vrednost: 112 + 87 + 111 - 18 = 292
		 * konacno: a = 17, b = 292, c = 86
		 * */
		System.out.println();
		System.out.println("Pre inkrement (++i), primer 1:");
		b = ++c + ++a - ++c + ++b;
		System.out.println(a + " " + b + " " + c);
		/*
		 * c se uvecava za 1, a zatim ucitava (87); a se uvecava za 1, a zatim ucitava (18); c se uvecava za 1,
		 * a zatim ucitava (88); b se uvecava za 1, a zatim ucitava (293)
		 * b se dodeljuje vrednost: 87 + 18 - 88 + 293 = 310
		 * konacno: a = 18, b = 310, c = 88
		 * */
		System.out.println();
		System.out.println("Pre inkrement (++i), primer 2:");
		b = ++b - ++c - ++c + ++a;
		System.out.println(a + " " + b + " " + c);
		/*
		 * b se uvecava za 1, zatim ucitava (311); c se uvecava za 1, zatim ucitava (89); c se uvecava za 1, 
		 * zatim ucitava (90); a se uvecava za 1, zatim ucitava (19)
		 * b se dodeljuje vrednost: 311 - 89 - 90 + 19 = 151
		 * konacno: a = 19, b = 151, c = 90
		 * */
		System.out.println();
		System.out.println("Post inkrement (i++), primer 1:");
		b = b++ - a++ + a++ - c++;
		System.out.println(a + " " + b + " " + c);
		/*
		 * b se ucitava(151), zatim uvecava za 1 (152); a se ucitava(19), zatim uvecava za 1 (20); a se ucitava (20),
		 * zatim uvecava za 1 (21); c se ucitava (90), zatim uvecava za 1 (91);
		 * b se dodeljuje vrednost: 151 - 19 + 20 - 90 = 62
		 * konacno: a = 21, b = 62, c = 91
		 * */
		System.out.println();
		System.out.println("Post inkrement (i++), primer 2:");
		b = c++ + b++ - a++ - c++;
		System.out.println(a + " " + b + " " + c);
		/*
		 * c se ucitava (91), zatim uvecava za 1 (92); b se ucitava (62), zatim uvecava za 1 (63); a se ucitava (21), 
		 * zatim uvecava za 1 (22); c se ucitava (92), zatim uvecava za 1 (93);
		 * b se dodeljuje vrednost: 91 + 62 - 21 - 92 = 40
		 * konacno: a = 22, b = 40, c = 93
		 * */
	}

}
