package de.telekom.sea.javaChallenge.javaAufgabe5;

	public class JavaChallenge_part5 {

		private PersonenSchlange personenSchlange = new PersonenSchlangeImpl();

	/** Personen in die Liste einpflegen  **/
		
		public void addPerson() {

			Person person1 = new PersonImpl("Hans",   "Maier");
			Person person2 = new PersonImpl("Hansi",  "Maierle");
			Person person3 = new PersonImpl("Gustl",  "Gans");
			Person person4 = new PersonImpl("Gerda",  "Schmid");
			Person person5 = new PersonImpl("Erika",  "Keller");
			Person person6 = new PersonImpl("Susi",   "Niklax");
			Person person7 = new PersonImpl("Harry",  "Treter");
			Person person8 = new PersonImpl("Elke",   "Luckert");

			personenSchlange.add(person1);
			personenSchlange.add(person2);
			personenSchlange.add(person3);
			personenSchlange.add(person4);
			personenSchlange.add(person5);
			personenSchlange.add(person6);
			personenSchlange.add(person7);
			personenSchlange.add(person8);
//			personenSchlange.add(person8);

		}

		public void showPerson() {
			Person person = new PersonImpl();
			person = personenSchlange.head();
			System.out.println(person.getVorname() + "     " + person.getNachname());
		}

		public void removePerson() {
			personenSchlange.remove();
		}
		public void resetListePerson() {
			personenSchlange.reset();
		
		}
		public void emptyListePerson() {
			System.out.println("Die Liste ist leer: " + personenSchlange.empty());
			
		}
		public void searchListePerson() {
			Person person = new PersonImpl("Elke",   "Luckert");
			
	/**		Falsche Person suchen die es nicht gibt    **/
//			Person person = new PersonImpl("Elkennn",   "Luckert");

			try {
				int number = personenSchlange.search(person);
				System.out.println("Elke Luckert ist an der stelle number: " + number);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
