package springboot.config.auth.dto;

import java.io.Serializable;

import lombok.Getter;
import springboot.domain.user.User;

@Getter
//Serializable 직렬화
//자바시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바시스템에서 사용할 수 있도록 바이트(byte)형태로 변환
public class SessionUser implements Serializable {
	private String name;
	private String email;
	private String picture;
	
	public SessionUser(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
		this.picture = user.getPicture();
	}
}
