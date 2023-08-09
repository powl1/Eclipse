package edu.global.ex.vo;

import lombok.Data;

@Data // <-- lombok 때문에 자동으로 Getter, Setter, toString, setString 까지 모두 알아서 생성이 된다.
// @Getter - 겟터
// @Setter - 셋터
// @ToString - 투스트링
// @NoArgsConstructor - 
// @AllArgsConstructor - 
public class MemberVO {
	
	private String id;
	private String pw;

}