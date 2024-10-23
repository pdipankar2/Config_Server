package in.ashokIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer107Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer107Application.class, args);
	}

}
