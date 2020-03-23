package se.ecutb.thymeleaf_db_lecture;

import org.springframework.data.repository.CrudRepository;
import se.ecutb.thymeleaf_db_lecture.entity.AppUser;

import java.util.Optional;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
    Optional<AppUser> findByEmailIgnoreCase(String email);
}
