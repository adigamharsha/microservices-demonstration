//package com.javaadmirer.users.api.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.javaadmirer.users.api.service.UserService;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private Environment environment;
//
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private BCryptPasswordEncoder bcrypt;
//
////	@Autowired
////	private AuthenticationFilter authenticationFilter;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/**").hasIpAddress(environment.getProperty("gateway.ip").toString()).and()
//				.addFilter(getAuthenticationFilter());
//		http.headers().frameOptions().disable();
//	}
//
//	private AuthenticationFilter getAuthenticationFilter() throws Exception {
//		// TODO Auto-generated method stub
//		AuthenticationFilter authenticationFilter = new AuthenticationFilter(userService, environment,
//				authenticationManager());
//		authenticationFilter.setAuthenticationManager(authenticationManager());
//		authenticationFilter.setFilterProcessesUrl(environment.getProperty("login.url.path"));
//		return authenticationFilter;
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userService).passwordEncoder(bcrypt);
//	}
//
//}
