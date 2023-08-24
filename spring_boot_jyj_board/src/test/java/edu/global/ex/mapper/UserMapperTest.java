package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.global.ex.vo.UserVO;

@SpringBootTest
class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	// UserVO(username=admin, password=admin,
	// enabled=1, authList=[AuthVO(username=admin, authority=ROLE_ADMIN),
	// 						AuthVO(username=admin, authority=ROLE_MANAGER)]) : [] 배열로 , authList 두개를 가지고 있다.

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	void testGetList() {
		UserVO user = userMapper.getUser("admin");
		System.out.println(user);
	}

	/*@Test
	void testInsertUser() {
		UserVO user = new UserVO();
		user.setUsername("user2");
		user.setPassword(new BCryptPasswordEncoder().encode("user2"));
		user.setEnabled(1);

		userMapper.insertUser(user);
		userMapper.insertAuthorities(user);
	}*/
	
	// 암호 체크 방법
	@Test
	void testMatchUser() {
		UserVO user = new UserVO();
		user.setUsername("user2"); // 이름은 user2 로 넣고
		user.setPassword(passwordEncoder.encode("user2")); // 비밀번호를 user2로 암호화해서 인코드 시킨것
		user.setEnabled(1);

		System.out.println(user);
		
		boolean bool = passwordEncoder.matches("user2", user.getPassword());
		
		System.out.println(bool);
		
		bool = passwordEncoder.matches("user2", "$2a$10$QmmLNKRRqNAOKIh7XkiGMOQanbWTl55qZUPU9LxpoJ8of12uK2FK6");
		
		System.out.println(bool);
	}

}
