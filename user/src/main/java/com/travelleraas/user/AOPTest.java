package com.travelleraas.user;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AOPTest {
	@Before("execution(* com.travelleraas.user.controller.UserDetailsController.*(..))")
	public void beforeCheckAspect(JoinPoint joinpoint)
	{
		System.out.println("This is point Cut call");
	}

}
