package validation.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.facelets.FaceletContext;

import validation.domain.A;
import validation.services.ServiceALocal;

@ManagedBean
@SessionScoped
public class IncidentCtr {
	private A a = new A();
	private String name = "";
	@EJB
	private ServiceALocal serviceALocal;

	public String doSay() {
		serviceALocal.addA(a);
		return "/index.html";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public ServiceALocal getServiceALocal() {
		return serviceALocal;
	}

	public void setServiceALocal(ServiceALocal serviceALocal) {
		this.serviceALocal = serviceALocal;
	}

}
