package models;

@Entity
public class Vehicule {
	private int plateNumber;

	public Vehicule() {
		super();
	}
	public Vehicule(int platenbr) {
		this.plateNumber = platenbr;
	}
	
	@Id
	public int getPlatenbr() {
		return this.plateNumber;
	}

}
