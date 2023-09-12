package edu.global.ex.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
class SecurityControllerTest {
	@Autowired
	private MockMvc mockMvc;
   
   // 로그인 테스트 
   @Test
   @WithMockUser(username = "admin", password = "admin")
   void testBoards_write() throws Exception {
      
      mockMvc.perform(get("/login"))
      .andDo(print())
      .andExpect(status().isOk());
   }
   // 권한 테스트 
   @Test
   @WithMockUser(username = "carrotpay", password = "ww1235", authorities = "ROLE_USER")
   public void userPageTest() throws Exception {      
      
      // 마이페이지
  mockMvc.perform(MockMvcRequestBuilders.get("/user/userHome"))
         .andExpect(MockMvcResultMatchers.status().isOk());
            
   }

}