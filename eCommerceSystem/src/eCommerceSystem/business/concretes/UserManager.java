package eCommerceSystem.business.concretes;

import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.UserCheckService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.core.abstracts.LoggerService;
import eCommerceSystem.dataAccess.abstracts.CustomerDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	private CustomerDao customerDao;
	private LoggerService loggerService;

	public UserManager(UserCheckService userCheckService, CustomerDao customerDao, LoggerService loggerService
			) {
		this.userCheckService = userCheckService;
		this.customerDao = customerDao;
		this.loggerService = loggerService;
	}

	

	@Override
	public void register(User user) {
		if(		userCheckService.emailCheck(user.getEmail())||
				userCheckService.emailUnusedCheck(user.getEmail())||
				userCheckService.nameCheck(user.getFirstName(), user.getLastName())||
				userCheckService.passCheck(user.getPassword())||customerDao.checkmail(user.getEmail())) {
			
			System.out.println("registered.");
			
		}else {
			System.out.println("check your data");
		}
		
	}

	@Override
	public void logIn(String email, String password) {
		 
		if(email.length()==0||password.length()==0) {
			System.out.println("error check your account input");
			return;
		}
		loggerService.log(email,password);
	}
	
	
}
