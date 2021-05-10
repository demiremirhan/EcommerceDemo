package eCommerceSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.UserCheckService;
import eCommerceSystem.dataAccess.concretes.InMemoryCustomerDao;
import eCommerceSystem.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	private User user;
	private InMemoryCustomerDao inMemoryCustomerDao;
	
	public UserCheckManager() {
		super();
	}
	
	public UserCheckManager(User user, InMemoryCustomerDao inMemoryCustomerDao) {
		super();
		this.user = user;
		this.inMemoryCustomerDao = inMemoryCustomerDao;
	}

	String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	Pattern pattern = Pattern.compile(regex);
	
	
	@Override
	public boolean passCheck(String password) {
		if (user.getPassword().length()<6) {
			System.out.println("password ust be more than 6 char");
			return false;
		}else {
			System.out.println("true pass ");
			return true;
		}
		
	}

	@Override
	public boolean emailCheck(String email) {
		Matcher matcher = pattern.matcher(email);
	    if(matcher.matches()) {
	    	System.out.println("True email addresss");
	    	return true;
	    }else {
	    	System.out.println("email address must be true combination");
	    	return false;
	    }
		
		
	}

	@Override
	public boolean emailUnusedCheck(String email) {
	if(inMemoryCustomerDao.checkmail(email) ) {
		return true;
	}else {
		
		System.out.println("try again wrong input");
		return false;
	}
		
	}

	@Override
	public boolean nameCheck(String firstName, String lastName) {
		if(firstName.length()>2||lastName.length()>2) {
			return true;
		}else {
			System.out.println("your name must be more than 2 chars");
			return false;
		}
		
	}

	
}
