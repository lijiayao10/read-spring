/*
 * @author caojiayao 2017年3月20日 下午2:45:54
 */
package com.cjy.spring.core.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: TestAdvisor.java, v 0.1 2017年3月20日 下午2:45:54 caojiayao Exp $
 */
public class TestAdvisor extends DefaultPointcutAdvisor {

	/**
	 * 
	 */
	public TestAdvisor(Advice advice) {
		super(advice);
		System.out.println("TestAdvisor init");
	}
}
