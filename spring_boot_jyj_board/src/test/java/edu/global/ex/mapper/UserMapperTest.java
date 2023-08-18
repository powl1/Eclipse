package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.global.ex.vo.UserVO;

@SpringBootTest
class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	// UserVO(username=admin, password=admin,
	// enabled=1, authList=[AuthVO(username=admin, authority=ROLE_ADMIN),
	// 						AuthVO(username=admin, authority=ROLE_MANAGER)]) : [] 배열로 , authList 두개를 가지고 있다.

	@Test
	void testGetList() {
		UserVO user = userMapper.getUser("admin");
		System.out.println(user);
	}

	@Test
	void testInsertUser() {
		UserVO user = new UserVO();
		user.setUsername("user2");
		user.setPassword(new BCryptPasswordEncoder().encode("user2"));
		user.setEnabled(1);

		userMapper.insertUser(user);
		userMapper.insertAuthorities(user);
	}

}
