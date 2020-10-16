package model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {
	private Date beginRent,endRent;
	public Rent(Date begin,Date end) {
		this.beginRent=begin;
		this.endRent=end;
	}

}
