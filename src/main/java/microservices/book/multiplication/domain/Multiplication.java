package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor	// generates a constructor taking all the final fields
@Getter						// generates all the getters for our fields
@ToString					// includes a human-friendly toString() method
@EqualsAndHashCode			// creates the equals(0 and hashCode() methods
public final class Multiplication {
	private final int factorA;
	private final int factorB;


	//empty constructor for JSON (de)serialization
	public Multiplication() {
		this(0, 0);
	}

}
