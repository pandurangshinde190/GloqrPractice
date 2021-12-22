package com.learn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.learn.services.CustomUserDetailService;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private CustomUserDetailService customUserDetailService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
//			.csrf().disable()
			.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
			.and()
			.authorizeHttpRequests()
//			.antMatchers("/home","/login","/register").permitAll()
//			.antMatchers("/public/**").permitAll()
//			.antMatchers(HttpMethod.GET,"/public/**").permitAll()
			.antMatchers("/signin").permitAll()
			.antMatchers("/public/**").hasRole("NORMAL")
			.antMatchers("/users/**").hasRole("ADMIN")
			.anyRequest()
			.authenticated()
			.and()
//			.httpBasic()
			.formLogin()
			.loginPage("/signin")
			.loginProcessingUrl("/doLogin")
			.defaultSuccessUrl("/users/");
		
	}

	//ROLE :-High level overview->NORMAL :READ
	//Authority -permission->READ\
	//ADMIN-READ,WRITE,UPDATE
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		
////		auth.inMemoryAuthentication().withUser("pandurang").password("@123").roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("pandurang").password(this.passwordEncoder().encode("pandurang@123")).roles("NORMAL");
//		System.out.println(this.passwordEncoder().encode("pandurang@123"));
//		auth.inMemoryAuthentication().withUser("om").password(this.passwordEncoder().encode("om@12")).roles("ADMIN");
//	}
	
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
////		return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder(10);
//		
//	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder(10);
		
	}
	

}
