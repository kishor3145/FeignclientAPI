package feignClientCRUD.feignclientAPI.repo;

import feignClientCRUD.feignclientAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
