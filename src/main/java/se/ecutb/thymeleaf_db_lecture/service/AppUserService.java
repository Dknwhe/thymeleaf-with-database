package se.ecutb.thymeleaf_db_lecture.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import se.ecutb.thymeleaf_db_lecture.entity.AppUser;

import java.time.LocalDate;

public interface AppUserService{
    AppUser registerAppUser(String firstName, String lastName, String email, String password, LocalDate regDate, boolean isAdmin);
}
