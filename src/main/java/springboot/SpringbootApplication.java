package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//exclude 부분은 @SpringBootApplication에서 SecurityAutoConfiguration 클래스를 불러오지 않게 하기위해 설정 Springboot security OFF
@SpringBootApplication(exclude={ SecurityAutoConfiguration.class })
public class SpringbootApplication {	
	public static void main(String[] args) {
		// SpringApplication.run(...) --> WAS
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
