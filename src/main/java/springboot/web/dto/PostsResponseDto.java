package springboot.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import springboot.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsResponseDto {

	private Long id;
	private String title;
	private String content;
	private String author;
	private int viewcount;

	public PostsResponseDto(Posts entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
		this.viewcount = entity.getViewcount();
	}
		
}
