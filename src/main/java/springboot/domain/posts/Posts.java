package springboot.domain.posts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(updatable = false)
	private String createdDate;
	
	@Column
	private String modifiedDate;
	
	@Column(length = 500, nullable = false)
	private String title;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	
	@Column
	private String author;
	
	@Column
	private int viewcount;
		
	@Builder
	public Posts(String createdDate, String modifiedDate, String title, String content, String author, int viewcount) {
		this.createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.modifiedDate = this.createdDate;
		this.title = title;
		this.content = content;
		this.author = author;
		this.viewcount = 0;
	}
	
	public void update(String modifiedDate, String title, String content) {
		this.modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.title = title;
		this.content = content;
	}
	
	public void updateViewCount(int viewcount) {
		this.viewcount += 1;
	}

}
