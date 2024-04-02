package com.yedam.spring.annotation;

import org.springframework.stereotype.Component;

@Component	//@Component("cf")로 했을때 안되는 이유 : applicationContext에 id값으로 cf가 사용됐기 때문.
public class Chef {
	public void cooking() {
		System.out.println("annotation 방식");
	}
}
