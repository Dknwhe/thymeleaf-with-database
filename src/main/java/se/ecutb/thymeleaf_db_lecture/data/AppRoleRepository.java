package se.ecutb.thymeleaf_db_lecture.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.ecutb.thymeleaf_db_lecture.entity.AppRole;

import java.util.Optional;

public interface AppRoleRepository extends CrudRepository<AppRole, Integer> {
    @Query("SELECT r FROM AppRole r WHERE UPPER(r.role) = UPPER(:role)")
    Optional<AppRole> findByRole(@Param("role") String role);
}
