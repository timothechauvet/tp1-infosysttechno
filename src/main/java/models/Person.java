package models;

@Entity
public class Person {
	
	private String name;
	
	public Person(String givenName) {
		this.name = givenName;
	}

}
