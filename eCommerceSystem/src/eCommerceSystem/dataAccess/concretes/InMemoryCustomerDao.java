package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.CustomerDao;
import eCommerceSystem.entities.concretes.User;

public class InMemoryCustomerDao implements CustomerDao{

	ArrayList<User> _user;
	
	public InMemoryCustomerDao() {
		_user = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		_user.add(user);
		System.out.println("listeye eklendi." + user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		_user.remove(user);
		System.out.println("listeden silindi.");
		
	}

	@Override
	public void update(User user) {
		_user.set(_user.indexOf(user), user);
		System.out.println("updated on list");
		
	}

	@Override
	public User getById(User user) {
		return _user.get(_user.indexOf(user));
		
	}

	@Override
	public List<User> getAll() {
		
		return _user;
	}
	
	public boolean checkmail(String email) {
		if(_user.contains(email)) {
			System.out.println("email has been used then before");
			return true;
			
		}else {	
			return false;
		}
		
		
	}

}
