package springResttt.service;

import springResttt.model.User;

public class RegistrationService {

	public RegistrationService() {
		// TODO Auto-generated constructor stub
	}

	public boolean RegistrationLogic(User user) {
		if (user.getUserName() != "") {
			return true;
		}
		return false;

	}
}
