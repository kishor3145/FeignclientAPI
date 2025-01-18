package feignClientCRUD.feignclientAPI.service;

import feignClientCRUD.feignclientAPI.entity.User;
import feignClientCRUD.feignclientAPI.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public List<User> fetchAllUsers() {
        return userFeignClient.getAllUsers();
    }

    public User fetchUserById(Long id) {
        return userFeignClient.getUserById(id);
    }
}
