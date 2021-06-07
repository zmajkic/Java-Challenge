package de.telekom.sea.javaChallenge.javaAufgabe5;


public interface PersonenSchlange {
	
	    public void add(Person person);

	    public Person head();

	    public Person remove();

	    public void reset();

	    public boolean empty();

	    public int search(Person person) throws Exception;

}