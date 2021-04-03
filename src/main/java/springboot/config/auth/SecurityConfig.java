//Using for OAuth2
//package springboot.config.auth;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import lombok.RequiredArgsConstructor;
//import springboot.domain.user.Role;
//
//// Spring Security 설정들을 활성
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private final CustomOAuth2UserService customOAuth2UserService;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		//.csrf : 크로스사이트요청위조가 가능하도록 설정
//		// h2-console 화면을 사용하기 위해서 설정을 해제 (개발 용도)
//		http.csrf().disable().headers().frameOptions().disable().and()
//		// URL 별로 권한 관리를 지정
//		.authorizeRequests()
//		// 권한 관리 대상을 지정
//		.antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**", "/profile").permitAll()
//		.antMatchers("/api/v1/**").hasRole(Role.USER.name())
//		// 설정된 값을 제외한 나머지에 대해서는 인증 받은 사용자만 허용
//		.anyRequest().authenticated()
//		.and()
//			.logout()
//				.logoutSuccessUrl("/")
//		.and()
//			// oauth2Login 기능에 대해서 정의
//			.oauth2Login()
//				// Oauth2 로그인에 성공했을 때 사용자 정보를 가져오는 방법을 설정
//				.userInfoEndpoint()
//					// 소셜 로그인에 성공했을 때 후속 조치를 구현한 구현체를 등록
//					.userService(customOAuth2UserService);
//	}
//	
//	
//}
