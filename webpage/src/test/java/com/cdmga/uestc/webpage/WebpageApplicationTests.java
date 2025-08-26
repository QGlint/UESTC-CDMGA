// package com.cdmga.uestc.webpage;

// import static org.junit.jupiter.api.Assertions.*;
// import java.time.LocalDateTime;
// import java.util.List;
// import java.time.format.DateTimeFormatter;

// import com.cdmga.uestc.webpage.Entity.Course;
// import com.cdmga.uestc.webpage.Entity.Identity;
// import com.cdmga.uestc.webpage.Entity.Score;

// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.cdmga.uestc.webpage.Controller.HelloController;
// //import com.cdmga.uestc.webpage.Repository.CourseRepository;
// import com.cdmga.uestc.webpage.Repository.IdentityRepository;
// import com.cdmga.uestc.webpage.Service.CourseService;
// import com.cdmga.uestc.webpage.Service.IdentityService;
// import com.cdmga.uestc.webpage.Service.ScoreService;

// @SpringBootTest
// class WebpageApplicationTests {

// 	@Test
// 	void contextLoads() {
// 	}
// 	@Autowired
// 	private HelloController helloController;

// 	@Autowired
// 	private IdentityRepository identityRepository;

// 	/*@Autowired
// 	private CourseRepository courseRepository;*/

// 	@Autowired
// 	private CourseService courseService;

// 	@Autowired
// 	private ScoreService scoreService;

// 	@Test
// 	public void helloControllerTest(){
// 		String hello = helloController.Sayhello();
// 		System.out.println(hello);
// 	}

// 	@Test
// 	public void getIdentityByAccountTest(){
// 		// 创建一个模拟的 IdentityRepository
//         IdentityRepository mockRepository = Mockito.mock(IdentityRepository.class);

//         // 创建一个假数据模拟返回的用户信息
//         String account = "testUser";
//         Identity mockUser = new Identity();
//         mockUser.setAccount(account);
//         mockUser.setPassword("admin");

//         // 模拟 repository 调用返回预设的 mockUser
//         Mockito.when(mockRepository.findByAccount(account)).thenReturn(mockUser);

//         // 调用要测试的方法
// 		IdentityService identityService = new IdentityService(mockRepository);
//         Identity identity = identityService.getIdentityByAccount(account);

//         // 验证结果
//         assertEquals("admin", identity.getPassword(), "Identity should be 'admin' for account 'testUser'");

//         // 验证 repository 方法是否被调用
//         Mockito.verify(mockRepository).findByAccount(account);
// 	}

// 	@Test
// 	public void getAccountAllTest(){
// 		Identity identity = identityRepository.findByAccount("taiyehu");
// 		System.out.println(identity);
// 	}

// 	@Test
//     void testGetAllCourse() {
//         List<Course> courses = courseService.getAllCourse();
// 		System.out.println(courses);
//     }

// 	@Test
// 	void testPostNewCourse() {
// 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm");

// 		Course course = courseService.postNewCourse("测试课题2", "arc", 
// 			LocalDateTime.parse("2025-07-14 20:37", formatter), 
// 			LocalDateTime.parse("2025-08-01 00:00", formatter), 
// 			"用于测试的课题2", "NULL",
// 			LocalDateTime.parse("2025-07-14 20:37", formatter),
// 			LocalDateTime.parse("2025-07-14 20:41", formatter));

// 		assertNotNull(course, "The course should not be null");
// 	}

// 	@Test
// 	void testFindAllAccount(){
// 		List<Identity> identity = identityRepository.findAllAccount();
// 		System.out.println(identity);
// 	}

// 	@Test
// 	void testPostNewScore(){
// 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm");
		
// 		Score score = scoreService.postNewScore(2,
// 		20, LocalDateTime.parse("2025-07-28 16:42", formatter),
// 		"null", 0, false, null, 
// 		LocalDateTime.parse("2025-07-28 16:42", formatter),
// 		LocalDateTime.parse("2025-07-28 16:42", formatter));

// 		assertNotNull(score, "the score should not be null");
// 	}
// }
