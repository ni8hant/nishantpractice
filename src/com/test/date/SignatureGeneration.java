package com.test.date;

import java.nio.charset.Charset;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class SignatureGeneration {

	public static void main(String[] args) {

		String result = "";
		try {
			Date date = new Date();
			String sent_at = Long.toString(date.getTime() / 1000);
			System.out.println(sent_at);
//			String apiKey = "b7268ae3-71a1-4fc2-8826-99fb1e3acba4";
			String apiKey = "21b6aa20-65f7-4b91-a886-e104f4fc6bd2";
			String apiSalt = "uat";
			String apiUrl = "https://api-uat.arthimpact.com/v1/msewa/cohorts?sent_at=" + sent_at;
			String message = apiSalt + "|" + apiKey + "|" + apiUrl;
			System.out.println("message::" + message);

			final Charset asciiCs = Charset.forName("US-ASCII");
			final Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
			final SecretKeySpec secret_key = new javax.crypto.spec.SecretKeySpec(asciiCs.encode(apiKey).array(),
					"HmacSHA256");
			sha256_HMAC.init(secret_key);
			final byte[] mac_data = sha256_HMAC.doFinal(asciiCs.encode(message).array());

			for (final byte element : mac_data) {
				result += Integer.toString((element & 0xff) + 0x100, 16).substring(1);
			}
			System.out.println("Result:[" + result + "]");

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
