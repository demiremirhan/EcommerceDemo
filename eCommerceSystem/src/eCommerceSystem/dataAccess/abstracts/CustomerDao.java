package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface CustomerDao {

	public void add(User user);
	public void delete (User user);
	public void update (User user);
	public User getById(User user);
	List<User> getAll();
	public boolean checkmail(String email);

}
