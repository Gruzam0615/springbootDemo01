package springboot.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springboot.domain.BaseTimeEntity;

@Getter
@NoArgsConstructor
@Entity

public class Posts extends BaseTimeEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 500, nullable = false)
	private String title;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	
	@Column
	private String author;
	
	@Column
	private int viewcount;
	
	
	@Builder
	public Posts(String title, String content, String author, int viewcount) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.viewcount = 0;
	}
	
	public void update(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public void updateViewCount(int viewcount) {
		this.viewcount += 1;
	}
	
}
