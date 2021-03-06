package springboot.domain.posts;

import java.time.LocalDateTime;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

	@Autowired
	PostsRepository postsRepository;
	
	@After
	public void cleanup() {
		postsRepository.deleteAll();
	}
	
	@Test
	public void 게시글저장_불러오기() {
		String title = "테스트 제목2";
		String content = "테스트 내용2";
		
		//저장
		postsRepository.save(Posts.builder().title(title).content(content).author("gruzam0615").build());
		List<Posts> postsList = postsRepository.findAll();
		
		Posts posts = postsList.get(0);
		
		Assertions.assertThat(posts.getTitle()).isEqualTo(title);
		Assertions.assertThat(posts.getContent()).isEqualTo(content);
	}	
	
	
//	BaseTimeEntity.class를 활용하지 않기 때문에 주석처리
//	@Test
//	public void BaseTimeEntity_등록() {
//		// given
//		// 1) 현재(등록 시점)의 시간
//		LocalDateTime now = LocalDateTime.now();
//		// 등록 --> 2) 데이터가 저장(생성)되는 시간이 DB에 기록
//		postsRepository.save(Posts.builder().title("title").content("content").author("author").build());
//		
//		// when
//		List<Posts> postsList = postsRepository.findAll();
//		
//		//then
//		// 1) 시간 보다 2) 시간이 이후인지 확인
//		Posts posts = postsList.get(0);
//		Assertions.assertThat(posts.getCreatedDate()).isAfter(now);
//		Assertions.assertThat(posts.getModifiedDate()).isAfter(now);
//		
//	}

}
