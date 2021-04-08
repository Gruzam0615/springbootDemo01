package springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
	private String modifiedTime;
	private String title;
	private String content;
	
	@Builder
	public PostsUpdateRequestDto(String modifiedTime, String title, String content) {
		this.modifiedTime = modifiedTime;
		this.title = title;
		this.content = content;
	}

	
}

