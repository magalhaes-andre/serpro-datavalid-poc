package com.magalhaes_andre.coder.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.magalhaes_andre.coder.model.*;

@RestController
@RequestMapping("/datavalid")
public class Datavalid {
	private final String DATAVALID_URI = "https://apigateway.serpro.gov.br/datavalid-trial/vbeta1/validate/pf";
	private final String TOKEN = "4e1a1858bdd584fdc077fb7d80f39283";

	@PostMapping("/pf")
	public String validatePfFace(@RequestBody ApiRequest apiRequest) {
		RestTemplate template = new RestTemplate();
		HttpEntity<ApiRequest> request = new HttpEntity<>(apiRequest, setHeaders());
		return template.postForObject(DATAVALID_URI, request, String.class);
	}

	private HttpHeaders setHeaders() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		header.set("Authorization", "Bearer " + TOKEN);
		return header;
	}
}
