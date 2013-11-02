package validation.services;

import javax.ejb.Local;

import validation.domain.A;

@Local
public interface ServiceALocal {
	void addA(A a);
}
