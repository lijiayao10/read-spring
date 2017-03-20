/*
 * @author caojiayao 2017年3月17日 下午6:21:45
 */
package com.cjy.spring.core.aop;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: MethodCounter.java, v 0.1 2017年3月17日 下午6:21:45 caojiayao Exp $
 */
public class MethodCounter implements Serializable {

	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	private int allCount;

	protected void count(Method method) {
		count(method.getName());
	}

	protected void count(String methodName) {
		Integer i = map.get(methodName);
		i = (i != null) ? Integer.valueOf(i.intValue() + 1) : Integer.valueOf(1);
		map.put(methodName, i);
		++allCount;
	}

	public int getCalls(String methodName) {
		Integer i = map.get(methodName);
		return (i != null ? i.intValue() : 0);
	}
	
	public int getCalls(){
		return allCount;
	}
	
	public boolean equals(Object other){
		return (other != null && other.getClass() == this.getClass());
	}
	
	public int hashCode(){
		return getClass().hashCode();
	}

}
