package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
이름        널?       유형           
--------- -------- ------------ 
USERNAME  NOT NULL VARCHAR2(50) 
AUTHORITY NOT NULL VARCHAR2(50)
*/

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthVO {
	private String username;
	private String authority;
}
