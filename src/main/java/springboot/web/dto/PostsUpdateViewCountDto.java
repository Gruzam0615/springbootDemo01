package springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateViewCountDto {

	private int viewCount;
	
	@Builder
	public PostsUpdateViewCountDto(int viewCount) {
		this.viewCount = viewCount;
	}

}
