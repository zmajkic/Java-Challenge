package de.telekom.sea.javaChallenge.javaAufgabe5;

public class PersonenSchlangeImpl implements PersonenSchlange {

	private int maxAnzahl = 8;
	private Person[] personenSchlange = new Person[maxAnzahl];
	private int anzahl;

/** mit add mit eigener Fehlerbehandlung **/
	public void add(Person person) {
		if  ( anzahl <= (maxAnzahl -1)) {
			this.personenSchlange[anzahl] = person;
			anzahl++;
		} else
			throw new ArrayIndexOutOfBoundsException(
					" ArrayIndex ausserhalb der Groesse fuer das Array, es kann nichts mehr angelegt werden. "
					+ " Die Anzahl der elemente = " + anzahl);
	}

/** mit head mit eigener Fehlerbehandlung **/	
	public Person head() {
		if ((this.personenSchlange[0] == null)) {
			throw new NullPointerException("Warteschlange ist aktuell leer, es kann kein head ausgegeben werden.");
		} else {
			return this.personenSchlange[0];
		}
	}
	
	
/** der nächste in der Schlange **/
	public Person remove() {
		if ((this.personenSchlange[0] == null)) {
			throw new NullPointerException("Warteschlange ist aktuell leer, es kann kein weiterer Teilnehmer entfernt werden.");
		} else {
			int i = 0;
			while ((i < anzahl) && i < (maxAnzahl - 1)) {
				personenSchlange[i] = personenSchlange[++i];
			}
			personenSchlange[--anzahl] = null;
		}
		return personenSchlange[0]; 
	}
	

/**  zurücksetzen Schlange  **/	
	public void reset() {
		personenSchlange = null;
		anzahl = 0;
		personenSchlange = new Person[maxAnzahl];
	}
	
	
/** ist nicht leer  **/
	public boolean empty() {
		if ((this.personenSchlange[0] == null)) {
			return true;
		} else {
			return false; }
		}
	
	
/**  nach einer Person Suchen  **/
public int search(Person person) throws Exception {
	String vorname = person.getVorname();
	String nachname = person.getNachname();
	int ergebnis = -1;

	if ((this.personenSchlange[0] == null)) {
		throw new NullPointerException("Warteschlange ist aktuell leer");
	} else {
		int i = 0;
		while ((i < anzahl) && i <= (maxAnzahl - 1)) {
			if (vorname.equals(personenSchlange[i].getVorname())
					&& (nachname.equals(personenSchlange[i].getNachname()))) {
				if (ergebnis == -1) {
					ergebnis = i + 1;
				} else {
					throw new Exception("Es gibt mehr als einen Teilnehmer in der Schlange mit dem Namen");
				}
			}
			i++;
		}
		if (ergebnis != -1) {
			return ergebnis;
		} else {
			throw new Exception("Es gibt keinen Teilnehmer in der Schlange mit dem Namen");
		}
	}
}
}
	