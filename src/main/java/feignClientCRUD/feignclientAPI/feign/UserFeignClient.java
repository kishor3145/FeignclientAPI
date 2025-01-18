package feignClientCRUD.feignclientAPI.feign;

import feignClientCRUD.feignclientAPI.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "userApi", url = "https://jsonplaceholder.typicode.com")
public interface UserFeignClient {

    @GetMapping("/users/")
    List<User> getAllUsers();

    @GetMapping("users/{id}")
    User getUserById(@PathVariable ("id")Long id);


    // DTO to map the response
    record UserDTO(Long id, String name, String email) {}
}
