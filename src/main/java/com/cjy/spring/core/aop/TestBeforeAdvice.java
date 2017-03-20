/*
 * @author caojiayao 2017年3月17日 下午6:21:15
 */
package com.cjy.spring.core.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * <p><P>
 * @author caojiayao 
 * @version $Id: CountingBeforeAdvice.java, v 0.1 2017年3月17日 下午6:21:15 caojiayao Exp $
 */
public class TestBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("TestBeforeAdvice.before");
	}

	

}
