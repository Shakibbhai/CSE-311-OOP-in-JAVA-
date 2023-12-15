package a_simple_password_manager;

public class AuthenticationInfo {
	private String url;
	private String username;
	private String password;
	
	
	public AuthenticationInfo(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
