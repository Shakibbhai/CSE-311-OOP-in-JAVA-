package encrypted_decrepted_java;

public class encrypted {
	public static void main(String []args) {
		String value="Gain knowledge";
		int secret_key=8;
		System.out.println("orginal value:"+value);
		
		String encrypt=getEncryptedValue(value,secret_key);
		System.out.println("Encrypted value is:"+encrypt);
		
		String decrypt=getdecryptedValue(encrypt,secret_key);
		System.out.println("decrypted value is:"+decrypt);
	}
	private static String getEncryptedValue(String value,int secret_key) {
		String encrypted="";
		for(int i=0;i<value.length();i++) {
			char ch=value.charAt(i);
			ch+=secret_key;
			encrypted+=ch;
		}
		return encrypted;
		
	}
	
	private static String getdecryptedValue(String encrypt,int secret_key) {
		String decrypted="";
		for(int i=0;i<encrypt.length();i++) {
			char ch=encrypt.charAt(i);
			ch-=secret_key;
			decrypted+=ch;
		}
		return decrypted;
		
	}
	

}
