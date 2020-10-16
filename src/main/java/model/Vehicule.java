package model;

import javax.persistence.*;

@Entity
public class Vehicule {
	private long plateNumber;

	public Vehicule() {
		super();
	}
	public Vehicule(int platenbr) {
		this.plateNumber = platenbr;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getPlatenbr() {
		return this.plateNumber;
	}
	public void setPlatenbr(long plateNumber) {
		this.plateNumber = plateNumber;
	}

}
