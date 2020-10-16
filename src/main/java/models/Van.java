package models;

import javax.persistence.*;

@Entity
public class Van extends Vehicule {
	private long maxWeight;

	public Van(long max) {
		this.maxWeight =max;
	}

}
