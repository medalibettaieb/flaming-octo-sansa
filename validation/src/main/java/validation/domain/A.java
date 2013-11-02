package validation.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class A implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6317250886443421589L;
	@Id
	private int idA;

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}
}
