/*
 * @author caojiayao 2017年3月17日 下午6:53:11
 */
package com.cjy.spring.core.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * <p><P>
 * @author caojiayao 
 * @version $Id: CountingAfterReturningAdvice.java, v 0.1 2017年3月17日 下午6:53:11 caojiayao Exp $
 */
public class CountingAfterReturningAdvice extends MethodCounter implements AfterReturningAdvice {

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		count(method);
	}

}
