package de.telekom.sea.javaChallenge.javaAufgabe;

public class Main {

	public static void main(String[] args) {

		
		
		
		
		/** Zählschleife **/
		System.out.println("***** for *****");
		for (int i = 0; i < 8; i++) {
			System.out.println(i);
		}

		
		
		
		/** Zählschleife Version a **/
		// a) ausschließlich while () {} only while
		System.out.println("***** while *****");
		int i = 0;
		while (i <= 8) {
			System.out.println(i);
			i++;
		}
		
		
		
		
		/** Zählschleife Version b **/
		// b) ausschließlich do {} while () only do while
		System.out.println("***** do while *****");
		
		int b =1;
		
		do
		   {
		      System.out.println(b);
		      if (b == 9) System.out.println();
		      b++;
		   }
		   while (b < 9);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
