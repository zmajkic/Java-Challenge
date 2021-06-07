package de.telekom.sea.javaChallenge.javaAufgabe4;

public class Main {

	public static void main(String[] args) {

//	Schreibe eine Methode, welche für einen beliebigen Text ermittelt, 
//	wie häufig die einzelnen Buchstaben von A bis Z in diesem Text vorkommen. 
//	Groß- und Kleinbuchstaben werden zusammengezählt.

		String poem = String.join("", "Whose woods these are I think I know.", "His house is in the village, though;",
				"He will not see me stopping here", "To watch his woods fill up with snow.", "",
				"My little horse must think it's queer", "To stop without a farmhouse near",
				"Between the woods and frozen lake", "The darkest evening of the year.", "",
				"He gives his harness bells a shake", "To ask if there's some mistake.",
				"The only other sound's the sweep", "Of easy wind and downy flake.", "",
				"The woods are lovely, dark, and deep,", "But I have promises to keep,",
				"And miles to go before I sleep,", "And miles to go before I sleep.");

		System.out.println("Testprint: " + poem); // Testprint
		int laenge = poem.length(); // String-Länge bestimmen
		System.out.println("Stringlänge: " + laenge + " Zeichen"); // String-Länge ausgeben

		String uppercase = poem.toUpperCase(); // in Grossbuchstaben umwandeln
		System.out.println("Testprint: " + uppercase); // Testprint

		
		
		char buchstabe = 65; // erster Buchstabe A = 65

		
		
		for (int a = 65; a <= 90; a++) { // A bis Z A = 65 ... Z = 90

			int buchstabenAnzahl = 0; // Buchstabenzähler

			
			
			for (int i = 0; i < poem.length(); i++) { // für die Gesamtlänge des Textes x529 mal

				if (uppercase.charAt(i) == buchstabe) // vergleiche Buchstabe mit Zeichen an Stelle i
					buchstabenAnzahl++;

			}

			System.out.print(buchstabe + " : ");
			System.out.print(buchstabenAnzahl);
			System.out.print(" ");

			while (buchstabenAnzahl > 0) { // solange * printen bis buchstabenAnzahl 0
				System.out.print("*");
				buchstabenAnzahl--;
			}
			System.out.println();

			buchstabe++;

		}

	}

}