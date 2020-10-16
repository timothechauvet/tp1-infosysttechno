package models;
import javax.persistence.*;

@Entity
public class Car extends Vehicule{
	private int numberOfSeats;

	public Car(int nbrSeats) {
		this.numberOfSeats = nbrSeats;
	}

}
