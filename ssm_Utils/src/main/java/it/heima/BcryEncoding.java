package it.heima;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryEncoding {

	public static String encoding(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(password);
	}
	
	public static void main(String[] args) {
		System.out.println(encoding("123"));
	}
	
}
