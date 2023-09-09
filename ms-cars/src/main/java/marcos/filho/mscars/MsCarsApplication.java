package marcos.filho.mscars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class MsCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCarsApplication.class, args);
	}

}
