package springboot.web.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import springboot.domain.posts.Posts;

@Getter
public class PostsListResponseDto {

	private Long id;
	private String title;
	private String content;
	private String author;	
//	private LocalDateTime modifiedDate;
	private String modifiedDate;
	private int viewcount;
	
	public PostsListResponseDto(Posts entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
		this.modifiedDate = entity.getModifiedDate();
		this.viewcount = entity.getViewcount();	
		
	}
	
}