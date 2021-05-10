package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.CustomerDao;
import eCommerceSystem.entities.concretes.User;

public class HipernateCustomerDao implements CustomerDao {


	ArrayList<User> user;
	
	public HipernateCustomerDao() {
		user = new ArrayList<User>();
	}
	@Override
	public void add(User user) {
		System.out.println("added with hipernate");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("deleted with hipernate");
		
	}

	@Override
	public void update(User user) {
		System.out.println("updated with hipernate");
		
	}

	@Override
	public User getById(User user) {
		System.out.println("getby id with hipernate");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("get all with hipernate");
		return null;
	}
	
	public boolean checkmail(String email) {
		if(user.contains(email)) {
			System.out.println("email has been used then before");
			return true;
			
		}else {	
			return false;
		}
		
		
	}

	
	
}
