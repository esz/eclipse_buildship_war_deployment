package mylibrary.beackingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LibraryBackingBean {

	public String getWelcomeText() {
		return "HELLO from " + this;
	}

}
