package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface UserService {

	public void register(User user);
	public void logIn(String email, String password);
}
