package com.magalhaes_andre.coder.base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;

public class Encoder {
	private File image;
	
	public Encoder(String imagePath) {
		try {
			this.image = new File("/home/ilegra0478/projects/serpro-datavalid-poc/images/"+imagePath);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public String encode() throws Exception{
		byte[] imageBytes = FileUtils.readFileToByteArray(image);
		return Base64.getEncoder().encodeToString(imageBytes); 
	}
}
