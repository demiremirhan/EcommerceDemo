package eCommerceSystem;

import eCommerceSystem.business.concretes.UserCheckManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.core.concretes.MailLogManager;
import eCommerceSystem.dataAccess.concretes.HipernateCustomerDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new UserCheckManager(),
													new HipernateCustomerDao(), 
													new MailLogManager());
		
		User user1 =new User(1, "emirhan", "demir", "emirhandemir@aol.com", "123456789");
		User user2 =new User(2, "dene", "me","deneme@dene.com", "987654321");
		
		userManager.register(user1);
		userManager.register(user2);
		
		MailLogManager logManager =new MailLogManager();
		logManager.log(user1.getEmail(), user1.getPassword());
		logManager.log(user2.getEmail(), user2.getPassword());
	}

}
