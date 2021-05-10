package eCommerceSystem.core.concretes;

import eCommerceSystem.core.abstracts.LoggerService;

public class MailLogManager implements LoggerService{

	@Override
	public void log(String email, String password) {
		System.out.println("Email ile loglandý : " + email);
		
	}

}
