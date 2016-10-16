package exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person Person;
	public PersonException(Person Person) {
		this.Person = Person;
	}

}
