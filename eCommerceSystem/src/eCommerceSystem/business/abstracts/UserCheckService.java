package eCommerceSystem.business.abstracts;

public interface UserCheckService {

	public boolean passCheck(String password);
	public boolean emailCheck(String email);
	public boolean emailUnusedCheck(String email);
	public boolean nameCheck(String firstName, String lastName);
	
}
