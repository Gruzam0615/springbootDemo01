# springbootDemo01
Springboot EC2 exercise

#application-oauth.properties
spring.security.oauth2.client.registration.google.client-id=419725406061-bocgb0b73siqe91f6o2ij9r63snrp4au.apps.googleusercontent.com
spring.security.oauth2.client.registration.google.client-secret=t2afgVE-qs80wwYe26i9lFCi
spring.security.oauth2.client.registration.google.scope=profile,email


spring.security.oauth2.client.registration.naver.client-id=9wBET7O4Pr1XB3l4Wxbr
spring.security.oauth2.client.registration.naver.client-secret=G1xbMk8uIJ
spring.security.oauth2.client.registration.naver.scope=name,email,profile_image
spring.security.oauth2.client.registration.naver.redirect-uri={baseUrl}/{action}/oauth2/code/{registrationId}
spring.security.oauth2.client.registration.naver.authorization-grant-type=authorization_code
spring.security.oauth2.client.registration.naver.client-name=Naver

spring.security.oauth2.client.provider.naver.authorization-uri=https://nid.naver.com/oauth2.0/authorize
spring.security.oauth2.client.provider.naver.token-uri=https://nid.naver.com/oauth2.0/token
spring.security.oauth2.client.provider.naver.user-info-uri=https://openapi.naver.com/nid/me
spring.security.oauth2.client.provider.naver.user-name-attribute=response

#application-real-db.properties
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:mariadb://springboot-webservice.cnyklbhoykgx.ap-northeast-2.rds.amazonaws.com:3306/springboot-webservice
spring.datasource.username=admin
spring.datasource.password=springboot-abc123
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

해당프로젝트는 위와 같은 두개의 프로퍼티 파일이 디렉터리 루트에 포함되어야 한다.
