package se.ecutb.thymeleaf_db_lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se.ecutb.thymeleaf_db_lecture.data.AppRoleRepository;
import se.ecutb.thymeleaf_db_lecture.data.AppUserRepository;
import se.ecutb.thymeleaf_db_lecture.entity.AppRole;
import se.ecutb.thymeleaf_db_lecture.entity.AppUser;
import se.ecutb.thymeleaf_db_lecture.service.AppUserService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class Seeder implements CommandLineRunner {

    private AppUserService appUserService;
    private AppRoleRepository appRoleRepository;

    @Autowired
    public Seeder(AppUserService appUserService, AppRoleRepository appRoleRepository) {
        this.appUserService = appUserService;
        this.appRoleRepository = appRoleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        appRoleRepository.save(new AppRole("USER"));
        appRoleRepository.save(new AppRole("ADMIN"));

        appUserService.registerAppUser("Peter", "Sundberg", "peter@admin.com", "admin", LocalDate.now(), true);
        appUserService.registerAppUser("Erik", "Svensson", "erik@user.com", "user", LocalDate.now(), false);


    }
}
