package springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springboot.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

	private String title;
	private String content;
	private String author;
	private int viewcount;
	
	@Builder
	public PostsSaveRequestDto(String title, String content, String author, int viewcount) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.viewcount = viewcount;
	}
	
	public Posts toEntity() {
		return Posts.builder().title(this.title).content(this.content).author(this.author).viewcount(this.viewcount).build();
	}
}
