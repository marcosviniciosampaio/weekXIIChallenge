package marcos.filho.CompassAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CompassApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompassApiApplication.class, args);
	}

}
