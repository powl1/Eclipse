package edu.global.ex.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.global.ex.mapper.UserMapper;
import edu.global.ex.vo.CustomUserDetailsVO;
import edu.global.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserMapper userMapper;
	
	// 인터페이스 두가지를 먼저 구현해 줘야하 한다.
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	//	UserDetails - 시큐리티가 가지고 잇다.
	// loadUserByUsername[무전기로] 사용법을 알려주는 개념이다.
		
		log.info("Load User By UserVO number" + username);
		
		UserVO user = userMapper.getUser(username);
		
		log.warn("queride by UserVO mapper : " + user);
		
		return user == null ? null : new CustomUserDetailsVO(user); // 5가지이 정보가 필요
	}

}
