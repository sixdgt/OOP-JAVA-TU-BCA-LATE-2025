package examples.interfaces;

public class Staff implements User{
	public String db_username = "davastaff";
	public String db_role = "staff";
	
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
