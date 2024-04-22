package com.yedam.app;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.yedam.app.aop.service.AaaService;

@SpringBootTest
class Boot240417ApplicationTests {

	/*
	 * @Autowired AaaService aaaService;
	 * 
	 * @Test public void aopTest() { aaaService.insert(); }
	 */
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Test
	public void testEncoder() {
		String password = "1234";
		
		String enPwd = passwordEncoder.encode(password);
		System.out.println("enPwd : " + enPwd);
		
		boolean matchResult = passwordEncoder.matches(password, enPwd);
		System.out.println("matchResult : " + matchResult);
	}
	
	@Autowired
	StringEncryptor jasyptStringEncryptor;
	
	@Test
	public void encryption() {
		String[] strs = {
				"net.sf.log4jdbc.sql.jdbcapi.DriverSpy",
				"jdbc:log4jdbc:oracle:thin:@127.0.0.1:1521:xe",
				"hr",
				"hr"
		};
		
		for(String str : strs) {
			String encStr = jasyptStringEncryptor.encrypt(str);
			System.out.println(encStr);		
		}
	}

}
