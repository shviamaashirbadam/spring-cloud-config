package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@SpringBootApplication
@RestController
public class CloudConfig {
	@GetMapping (path ="cloud")
	public String message() {
		return "Not Authorized";
	}
	
	public static void main (String[] args) {
		SpringApplication.run(CloudConfig.class);
	}

}
