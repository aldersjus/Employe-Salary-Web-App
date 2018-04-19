package com.justin.spring.web.app.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Security settings
 * Uses JDBC for authenticating users.
 * @author Justin Alderson
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	       auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
	    		   "select username, password, enabled" + " from users where username=?")
	       .authoritiesByUsernameQuery("select username, authority" + " from authorities where username=?");
	       
	    }

	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("EMPLOYEE").and().formLogin()
        .loginPage("/").permitAll();
     }
  
   
}