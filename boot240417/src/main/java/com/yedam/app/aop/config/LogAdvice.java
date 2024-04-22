package com.yedam.app.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	// 포인트컷 : 비즈니스 로직과 관련된 메소드 중에서 Advice(공통 코드)가 적용될 메소드
	@Pointcut("within(com.yedam.app.emp.service.impl.*)")
	public void allPointCut() {}
	
	// Weaving : 포인트컷 + Advice + 타이밍
	@Around("allPointCut()")
	public Object logger(ProceedingJoinPoint joinPoint) throws Throwable {
		// Aop가 적용되는 메서드의 이름
		String signatureStr = joinPoint.getSignature().toString();
		System.out.println("시작 : " + signatureStr);
		
		// 공통기능
		System.out.println("핵심 기능 전 실행 - 공통기능 : " + System.currentTimeMillis());
		
		try {
			// 비즈니스 메소드를 실행
			Object obj = joinPoint.proceed();
			return obj;
		}finally {
			System.out.println("핵심 기능 전 실행 - 공통기능 : " + System.currentTimeMillis());
			System.out.println("끝 : " + signatureStr);
		}
	}
	
	@Before("allPointCut()")
	public void beforeAdvice(JoinPoint joinPoint) {
		String signatureStr = joinPoint.getSignature().toString();
		System.out.println("시작 : " + signatureStr);
	}
}
