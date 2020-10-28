package config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer{

}

/*
AbstractSecurityWebApplicationInitializer
 : 이 클래스는 내부적으로 DelegatingFilterProxy를 스프링에 등록하는데 이 작업은 별도의 구현없이 클래스를 추가하는 것만으로도 설정이 완료된다.
 */
