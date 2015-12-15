package com.hailiang.study.guava.common.base;

import org.junit.Test;

import com.google.common.base.MoreObjects;

public class MoreObjectsTest {
	
	@Test
	public void testToString() {
		MoreObjectsTest mot = new MoreObjectsTest();
		System.out.println(MoreObjects.toStringHelper(mot).add("username", "hailiang").add("pass", "abcd1234"));
	}
	
	@Test
	public void testFirstNotNull() {
		String first = null;
		String second = "123";
		String second2 = "abc";
		System.out.println("================Guava Objects===============");
		System.out.println(MoreObjects.firstNonNull(second2, second)); //当第一个参数不为空时，返回第一个值
		System.out.println(MoreObjects.firstNonNull(first, second)); //当第一个参数为null时，第二个参数不为null时，则返回第二个参数值
		System.out.println(MoreObjects.firstNonNull(first, first)); //当第一个参数、第二个参数均为null时，抛出空指针异常
		System.out.println("================JDK7 自带的Objects===========");
	}
	
}
