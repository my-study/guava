package com.hailiang.study.guava.common.base;

import org.junit.Test;

import com.google.common.base.CaseFormat;

/**
 * 大小写格式[CaseFormat]
 * 	我们CaseFormat在某些时候尤其有用，比如编写代码生成器的时候。
 */
public class CaseFormatTest {

	@Test
	public void testLowerCamel() {
		//将CONSTANT_NAME --> constantName
		String str01 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME");
		String str02 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "constant_name");
		System.out.println(str01); //输出：constantName
		System.out.println(str02); //输出：constantName
	}
	
	@Test
	public void testLowerHyphen() {
		//将CONSTANT_NAME --> constant-name
		String str01 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, "CONSTANT_NAME");
		System.out.println(str01); //输出：constant-name
	}
	
	@Test
	public void testLowerUnderscore() {
		//将CONSTANT-naME --> constant-name
		String str01 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_UNDERSCORE, "CONSTANT-naME");
		System.out.println(str01); //输出：constant-name
	}
	
	@Test
	public void testUpperCamel() {
		//将CONSTANT_NAME --> ConstantName
		String str01 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "CONSTANT_NAME");
		System.out.println(str01); //输出：ConstantName
	}
	
	@Test
	public void testUpperUnderscore() {
		//将ConstantName --> CONSTANT_NAME
		String str01 = CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, "ConstantName");
		String str02 = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, "ConstantName");
		System.out.println(str01); //输出：CONSTANT_NAME
		System.out.println(str02); //输出：constantName
	}
	
}
