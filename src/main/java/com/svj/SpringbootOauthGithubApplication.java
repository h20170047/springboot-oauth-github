package com.svj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringbootOauthGithubApplication {

	@GetMapping
	public String getUserInfoFromGitHub(Principal principal) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(principal);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOauthGithubApplication.class, args);
	}

}
