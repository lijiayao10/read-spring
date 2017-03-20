/*
 * @author caojiayao 2017年3月17日 下午7:00:39
 */
package com.cjy.spring.core.aop;

import java.io.IOException;
import java.io.UncheckedIOException;

import org.springframework.aop.ThrowsAdvice;

/**
 * <p><P>
 * @author caojiayao 
 * @version $Id: CountingThrowsAdvice.java, v 0.1 2017年3月17日 下午7:00:39 caojiayao Exp $
 */
public class CountingThrowsAdvice extends MethodCounter implements ThrowsAdvice {
	
	public void afterThrowing(IOException ex) throws Throwable{
		count(IOException.class.getName());
	}
	
	public void afterThrowing(UncheckedIOException ex) throws Throwable{
		count(UncheckedIOException.class.getName());
	}
}
