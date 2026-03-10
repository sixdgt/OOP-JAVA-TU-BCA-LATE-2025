package examples.interfaces;
// Note: interface in java is extended using 'implements' keyword
public class Admin implements User{
	public String db_username = "davadmin";
	public String db_role = "admin";
	
	@Override
	public boolean login(String param_username, String param_role) {
		if(this.db_username.equals(param_username) &&
				this.db_role.equals(param_role)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isActive(String param_username) {
		if(this.db_username.equals(param_username)) {
			return true;
		}
		return false;
	}
}
