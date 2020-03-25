package se.ecutb.thymeleaf_db_lecture.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

    //AppUser uppfylla krav. UserDetails (interface) Skapa Principal.

    // Skapa en bean som implementerar UserDetailsService - viktig del när man loggar in

    // Skapa en bean av en password krypterare - klar

    //Deinera funktionalitet i MySecurityConfiguration - grundläggande

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    .antMatchers("/**").permitAll()
                .and()
                    .formLogin()
                        .usernameParameter("email")
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .permitAll();
    }
}
