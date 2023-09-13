package marcos.filho.mscars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MsCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCarsApplication.class, args);
	}

}
