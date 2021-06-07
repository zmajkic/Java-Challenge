package de.telekom.sea.javaChallenge.javaAufgabe5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**		    challenge_Part_5   **/	
		
		JavaChallenge_part5 javaChallenge_part5 = new JavaChallenge_part5();
	
/** Acht pesonen hinzugefügt   **/
		
		javaChallenge_part5.addPerson();
		
///** Acht pesonen entnommer und head angezeigt   **/	
//		
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // einer gelöscht summe 7
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // zweiter gelöscht summe 6
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // dritter gelöscht summe 5
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // vierter gelöscht summe 4
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // fünfter gelöscht summe 3
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // sechster gelöscht summe 2
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // siebter gelöscht summe 1
//		javaChallenge_part5.showPerson();
//		javaChallenge_part5.removePerson(); // letzter gelöscht summe 0
//		javaChallenge_part5.showPerson();
		
/**  ein zusätzlicher für die Fehlerbehandlung **/
		
////		javaChallenge_part5.removePerson(); // letzter gelöscht summe 0
	
/** die personenListe reseten   **/
		
		javaChallenge_part5.resetListePerson();
//		javaChallenge_part5.showPerson();	
		
/** die pesonenListe empty ja oder nein   **/
		
		javaChallenge_part5.emptyListePerson();
		javaChallenge_part5.addPerson();
		javaChallenge_part5.emptyListePerson();
		
/** eine Person in  personenListe suchen  **/
		
		javaChallenge_part5.searchListePerson();
		
	}		
}