package com.magalhaes_andre.coder.base64;

import java.util.Base64;

public class Decoder {
	private String image64;

	public Decoder(String image64) {
		this.image64 = image64;
	}

	public byte[] decode() {
		return Base64.getDecoder().decode(image64);
	}
}