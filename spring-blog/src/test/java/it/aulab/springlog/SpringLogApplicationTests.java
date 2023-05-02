package it.aulab.springlog;



// import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
// import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import it.aulab.springlog.model.Author;
import it.aulab.springlog.model.Comment;
import it.aulab.springlog.model.Post;
import it.aulab.springlog.repository.AulabAuthorRepository;
// import it.aulab.springlog.repository.AuthorRepository;
import it.aulab.springlog.repository.CrudAuthorRepository;
import it.aulab.springlog.repository.JpaAuthorRepository;
import it.aulab.springlog.repository.PagingAndSortingRepository;
// import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class SpringLogApplicationTests {


	@Autowired
	private EntityManager entityManager;
	


	@Autowired
	private CrudAuthorRepository crudauthorRepository;
	@Autowired
	private JpaAuthorRepository jpaauthorRepository;
	@Autowired
	private PagingAndSortingRepository pagingAndSortingRepository;

	@Autowired
	private AulabAuthorRepository authorRepository;

	@BeforeEach
	public void createData(){

		Author a1 = new Author();
		a1.setFirstname("Davide");
		a1.setLastname("Semenzato");
		a1.setEmail("davidesemenzato27@gmail.com");
		
		entityManager.persist(a1);
		
		Author a2 = new Author();
		a2.setFirstname("Giacomo");
		a2.setLastname("Sala");
		a2.setEmail("giacomosala@gmail.com");
		
		entityManager.persist(a2);

		Post p1 = new Post();
		p1.setAuthor(a1);
		p1.setTitle("il nuovo iphon");
		p1.setBody("Lorem ipsum");
		p1.setPublishDate("20230411");
		entityManager.persist(p1);


		Post p2 = new Post();
		p2.setAuthor(a2);
		p2.setTitle("il nuovo samsung");
		p2.setBody("Lorem ipsum");
		p2.setPublishDate("20230411");

		entityManager.persist(p2);

		Comment c1 = new Comment();
		c1.setEmail("anonimo@gmail.com");
		c1.setPost(p1);
		c1.setBody("Non mi piace");
		c1.setPublishDate("20230412");
		entityManager.persist(c1);


		Comment c2 = new Comment();
		c2.setEmail("anonimo@gmail.com");
		c2.setPost(p2);
		c2.setBody("Non mi piace");
		c2.setPublishDate("20230412");
		entityManager.persist(c2);



	}


	/* @Test
	void authorCheck() {
		List<Author> authors = entityManager.createQuery("SELECT a From Author a", Author.class).getResultList();

		
		assertThat(authors).hasSize(1);
	} */

	/* @Test
	void commentCheck() {
		List<Comment> commentPost1 = entityManager
		.createQuery("SELECT c From Comment c WHERE c.post.id = ?1", Comment.class)
		.setParameter(1, posts.get(0).getId())
		.getResultList();

		
		assertThat(commentPost1).hasSize(2);

		List<Comment> commentPost2 = entityManager
		.createQuery("SELECT c From Comment c WHERE c.post.id = ?1", Comment.class)
		.setParameter(1, posts.get(1).getId())
		.getResultList();

		
		assertThat(commentPost2).hasSize(0);
	} */

	/* @Test
	void queryCheck() {
		List<Comment> commentPost1 = entityManager
		.createQuery("SELECT c From Comment c WHERE c.post.id = :id AND c.email = :email", Comment.class)
		.setParameter("id", 1)
		.setParameter("email", "anonimo@gmail.com")
		.getResultList();

		
		assertThat(commentPost1).hasSize(0);

	} */

	/* @Test
	void postCheck() {
		List<Post> posts = entityManager.createQuery("SELECT a From Post a", Post.class).getResultList();

		
		assertThat(posts).hasSize(2);
	} */


	/* @Test
	void authorRepositoryCheck(){
		assertThat(authorRepository.count()).isEqualTo(1);

		assertThat(authorRepository.findAll()).first().extracting("firstname").isEqualTo("Davide");
		Author a = authorRepository.findAll().get(0);
		assertThat(authorRepository.findById(a.getId()).get()).isNotNull().extracting("lastname").isEqualTo("Semenzato");
	} */


	/* @Test
	void findByLastname(){
		assertThat(authorRepository.findByLastname("Semenzato"))
		.first().extracting("lastname").isEqualTo("Semenzato");
	} */

	/* @Test
	void findByFirstnameAndLastname(){
		assertThat(authorRepository.findByFirstnameAndLastname( "Giacomo","Semenzato"))
		.hasSize(0);
	} */

	/* @Test
	void findByFirstnameOrLastname(){
		assertThat(authorRepository.findByFirstnameOrLastname( "Giacomo","Semenzato"))
		.hasSize(2);
	} */


	/* @Test
	void findByLastnameNotIgnoreCase(){
		assertThat(authorRepository.findByLastnameNotIgnoreCase( "semenzato"))
		.hasSize(0);
		
	}
 */
	/* @Test
	void findByFirstnameEquals(){
		assertThat(authorRepository.findByFirstnameEquals( "davide")).first().extracting("firstname")
		.isEqualTo("Davide");

		//assertThat(authorRepository.findByFirstnameContain("d")).hasSize(2);
		
	} */

	/* @Test
	void createCrud(){
		Author a = new Author();
		a.setFirstname("Antonio");
		a.setLastname("Trani");
		a.setEmail("attrani@gmail.com");
		crudauthorRepository.save(a);

		assertThat(crudauthorRepository.findAll()).hasSize(3);
	} */

	/* @Test
	void createJpa(){
		Author a = new Author();
		a.setFirstname("Antonio");
		a.setLastname("Trani");
		a.setEmail("attrani@gmail.com");
		jpaauthorRepository.save(a);

		assertThat(crudauthorRepository.findAll()).hasSize(3);
	} */
	
	

	@Test
	void sorting2(){
		Author a1 = new Author();
		a1.setFirstname("Giulia");
		a1.setLastname("Semenzato");
		a1.setEmail("giusemenzato27@gmail.com");
		
		entityManager.persist(a1);

		assertThat(pagingAndSortingRepository.findAll(Sort.by("lastname", "firstname")))
		.extracting("first")
		.contains("Davide" , atIndex(0))
		.contains("Giulia" , atIndex(1))
		.contains("Giacomo" , atIndex(2));
	}


	@Test
	void paging(){
		/* authorRepository.deleteAll(); */
		for (int i = 0; i < 100; i++) {
			Author a = new Author();
			a.setFirstname(String.valueOf(i));
			a.setLastname(String.valueOf(i));
			a.setEmail(String.valueOf(i));

			authorRepository.save(a);


		}
		assertThat(authorRepository.findAll()).hasSize(100);

		//! questa è piu veloce 
		//? assertThat(authorRepository.count()).isEqualTo(100);
		int pageSize = 10;
		assertThat(pagingAndSortingRepository.findAll(PageRequest.of(0, pageSize)).getContent())
		.extracting("firstname")
		.contains("0", atIndex(0))
		.contains("1", atIndex(1));

		assertThat(pagingAndSortingRepository.findAll(PageRequest.of(0, pageSize)).getContent())
		.extracting("lastname")
		.contains("10", atIndex(0))
		.contains("11", atIndex(1));

		assertThat(pagingAndSortingRepository.findAll(PageRequest.of(0, pageSize)).getContent())
		.extracting("email")
		.contains("90", atIndex(0))
		.contains("99", atIndex(1));
	}


	@Test
	void findQualcosa(){
		List<Author> find = authorRepository.findQualcosa("sa");
		assertThat(find).hasSize(1);

		assertThat(authorRepository.findQualcosa("sa")).first()
		.extracting("firstname").isEqualTo("Giacomo");
	}

	@Test
	void sorting3(){
		Author a1 = new Author();
		a1.setFirstname("Giulia");
		a1.setLastname("Semenzato");
		a1.setEmail("giusemenzato27@gmail.com");
		
		entityManager.persist(a1);

		List<Author>sort = authorRepository.findAll(Sort.by("lastname").descending()
		.and(Sort.by("firstname").ascending()));
		for(Author a :sort){
			System.out.println("Nome: " . a1.getFirstname());
			System.out.println("Cognome: " . a1.getLastname());
			System.out.println("Email: " . a1.getEmail());
		}
		assertThat(sort).extracting();

	}







}
