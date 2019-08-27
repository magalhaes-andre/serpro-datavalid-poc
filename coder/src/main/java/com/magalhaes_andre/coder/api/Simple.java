package com.magalhaes_andre.coder.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magalhaes_andre.coder.base64.Decoder;
import com.magalhaes_andre.coder.base64.Encoder;

@RestController
@RequestMapping("/simple")
public class Simple {
	
	@GetMapping("/encode/{imagePath}")
	public String encodeFromImage(@PathVariable String imagePath) {
		try {
			Encoder encoder = new Encoder(imagePath);
			return encoder.encode();
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@GetMapping(path = "/decode", produces = "image/jpeg")
	public byte[] decodeToImage(@RequestBody String image64) {
		Decoder decoder = new Decoder(image64);
		return decoder.decode();		
	}
}
