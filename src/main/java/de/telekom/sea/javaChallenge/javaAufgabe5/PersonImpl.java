package de.telekom.sea.javaChallenge.javaAufgabe5;

public class PersonImpl implements Person {

	private String vorname;
	private String nachname;

	public PersonImpl() {
	}

	public PersonImpl(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return this.vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

}
