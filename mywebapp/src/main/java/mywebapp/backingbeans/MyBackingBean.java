package mywebapp.backingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MyBackingBean {

	public String getWelcomeText() {
		return "HELLO from " + this;
	}

}
