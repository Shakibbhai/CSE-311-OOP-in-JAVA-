package a_simple_password_manager;

public class EncryptionUtil {
	public static String encrypt(String password,int n) {
		char[]encryptedPassword=new char[password.length()];
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt((i+n)% password.length());
			encryptedPassword[i]=ch;
		}
		return new String(encryptedPassword);
	}
	
	public static String decrypt(String encryptedPassword,int n) {
		char[]decryptedPassword=new char[encryptedPassword.length()];
		int length=encryptedPassword.length();
		for(int i=0;i<length;i++) {
			char ch=encryptedPassword.charAt((i+n-length)% length);
			decryptedPassword[i]=ch;
		}
		return new String(decryptedPassword);
	}
	

}
