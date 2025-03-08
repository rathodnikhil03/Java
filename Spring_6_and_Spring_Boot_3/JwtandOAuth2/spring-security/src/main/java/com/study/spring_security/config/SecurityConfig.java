package com.study.spring_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(userDetailService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		
		return provider;
		
	}
	
	
	
	@Bean
	public AuthenticationManager autheticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		
		
		
		http
		     .csrf(customizer -> customizer.disable())
		     .authorizeHttpRequests(request -> request
		    		 .requestMatchers("register","login")
		    		 .permitAll()
		    		 .anyRequest()
		    		 .authenticated())
	         .httpBasic(Customizer.withDefaults())
		     .sessionManagement(session -> session
		    		 .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
		//http.formLogin(Customizer.withDefaults());  when you have stateless you don't want formLogin() method
		
		
		/*
		 * Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new
		 * Customizer<CsrfConfigurer<HttpSecurity>>() {
		 * 
		 * @Override public void customize(CsrfConfigurer<HttpSecurity> configurer) {
		 * 
		 * configurer.disable(); } };
		 * 
		 * Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.
		 * AuthorizationManagerRequestMatcherRegistry> custHttp = new
		 * Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.
		 * AuthorizationManagerRequestMatcherRegistry>() {
		 * 
		 * @Override public void customize(
		 * AuthorizeHttpRequestsConfigurer<HttpSecurity>.
		 * AuthorizationManagerRequestMatcherRegistry registry) {
		 * registry.anyRequest().authenticated();
		 * 
		 * } };
		 * 
		 * http.authorizeHttpRequests(custHttp); http.csrf(custCsrf);
		 */
		return http.build();
	}
	
	/*
	 * @Bean public UserDetailsService userDetailssService() {
	 * 
	 * UserDetails user =User .withDefaultPasswordEncoder() .username("study")
	 * .password("130603") .roles("USER") .build();
	 * 
	 * UserDetails admin = User .withDefaultPasswordEncoder() .username("admin")
	 * .password("123") .roles("ADMIN") .build(); return new
	 * InMemoryUserDetailsManager(user,admin);
	 * 
	 * }
	 */
}
