package feignClientCRUD.feignclientAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "feignClientCRUD.feignclientAPI.feign")

@SpringBootApplication
public class FeignclientCrudapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientCrudapiApplication.class, args);
	}

}
