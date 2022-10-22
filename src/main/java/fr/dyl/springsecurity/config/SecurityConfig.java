package fr.dyl.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests((authorizeRequests) ->
                                       authorizeRequests
                                               .antMatchers("/api/v1/couscouses")
                                               .hasRole("ADMIN"))
            .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        var user = User.withDefaultPasswordEncoder()
                       .username("admin")
                       .password("admin")
                       .roles("ADMIN")
                       .build();
        return new InMemoryUserDetailsManager(user);
    }
}
