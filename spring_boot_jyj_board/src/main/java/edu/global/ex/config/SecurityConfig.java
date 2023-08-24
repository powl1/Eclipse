package edu.global.ex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.global.ex.security.CustomUserDetailsService;

@Configuration // @Component+설정
@EnableWebSecurity // 스프링시큐리티필터가 스프링 필터체인에 등록됨 
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Bean // PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	// 빈을 해줘야 ioc 안에 넣을 수 있다.
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		// web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
		web.ignoring().antMatchers("/css/**", "/fonts/**", "/js/**", "/img/**", "/lib/**");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       auth.inMemoryAuthentication()
//       		.withUser("user").password("{noop}user").roles("USER").and() // user 아이디로 로그인
//   			.withUser("admin").password("{noop}admin").roles("ADMIN");
		auth.userDetailsService(customUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
   }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 우선 CSRF설정을 해제한다. Cross-Site Request Forgery 공격 방지 기능 비활성화
		// 초기 개발시만 해주는게 좋다.
		http.csrf().disable();
		
		// 시큐리티란? = 인증과 권한
		// 권한 = 리소스 접근 권한
		http.authorizeRequests()
		.antMatchers("/user/**").hasAnyRole("USER") // 경로 패턴을 지정, 권한 있는 자만 접근 가능하게,
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/**").permitAll();
		
		// http.formLogin(); // 스프링 시큐리티에 있는 기본 로그인 폼을 사용하겠다. // 기본 로그인 폼
		http.formLogin()
			.loginPage("/login") // loginPage() 는 말그대로 로그인할 페이지 url 이고
			.defaultSuccessUrl("/") // 로그인이 완료 되면 어떤 url 로 넘어갈 것인지 지정
			.permitAll(); // 모든 유저가 로그인 화면은 볼 수 있게 한다.
		
		// http.exceptionHandling() // 예를 들면 404 오류가 발생시 넘어가는 페이지 지정
   }
	
}