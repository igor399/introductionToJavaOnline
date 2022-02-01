package by.epam.task6.library.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {
	public static boolean verifyUserPassword(String inPassword, String encryptedPassword) {

		return encryptedPassword.equals(md5Custom(inPassword));
	}

	public static String md5Custom(String st) {
		MessageDigest messageDigest = null;
		byte[] digest = new byte[0];

		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(st.getBytes());
			digest = messageDigest.digest();

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}

		BigInteger bigInt = new BigInteger(1, digest);
		String md5Hex = bigInt.toString(16);

		while (md5Hex.length() < 32) {
			md5Hex = "0" + md5Hex;
		}

		return md5Hex;
	}

	public static void main(String[] args) {
		System.out.println(md5Custom("1111"));
	}

}
