package examples.interfaces;
// Note: while create class we use 'interface' keyword instead of 'class'
public interface User {
	public abstract boolean login(String username, String role);
	
	public abstract boolean isActive(String username);
}
