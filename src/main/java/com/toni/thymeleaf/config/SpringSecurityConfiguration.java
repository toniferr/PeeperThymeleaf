package com.toni.thymeleaf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{

	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
                .inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").roles("ADMIN", "USER")
                .and().withUser("user").password("{noop}user").roles( "USER");
	    }
	    
//	    @Bean
//	    public UserDetailsService userDetailsService() {
//
//	        User.UserBuilder users = User.withDefaultPasswordEncoder();
//	        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//	        manager.createUser(users.username("user").password("password").roles("USER").build());
//	        manager.createUser(users.username("admin").password("password").roles("USER", "ADMIN").build());
//	        return manager;
//
//	    }
	    
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().antMatchers("/", "/index/**", "/project/**", "/checkout", "/docheckout","/login","logout", "/css/**", "/js/**", "/images/**", "/locale").permitAll()
					 .and().formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll()
					 .and().logout()
                     .deleteCookies("remove")
                     .invalidateHttpSession(true)
                     .logoutUrl("/logout")
                     .logoutSuccessUrl("/logout-success")
                     .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
		}

//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http.authorizeRequests().antMatchers("/", "/index/**", "/product/**", "/checkout", "/docheckout").permitAll()
//	                .and().authorizeRequests().antMatchers("/login","logout").permitAll()
//	                .and().authorizeRequests().antMatchers("/static/css/**","/js/**", "/images/**", "/**/favicon.ico").permitAll()
//	                .and().formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll()
//	                .and().logout()
//	                        .deleteCookies("remove")
//	                        .invalidateHttpSession(true)
//	                        .logoutUrl("/logout")
//	                        .logoutSuccessUrl("/logout-success")
//	                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//	               ;
//	    }
	}