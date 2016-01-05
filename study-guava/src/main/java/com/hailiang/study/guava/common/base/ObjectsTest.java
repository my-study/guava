package com.hailiang.study.guava.common.base;

import org.junit.Test;

import com.google.common.base.Objects;

public class ObjectsTest {

	/**
	 * equals
	 */
	@Test
	public void testEqual() {
		System.out.println("================Guava Objects===============");
		System.out.println(Objects.equal("a", "a")); // returns true
		System.out.println(Objects.equal(null, "b")); // returns true
		System.out.println(Objects.equal("a", null)); // returns true
		System.out.println(Objects.equal(null, null)); // returns true
		
		System.out.println("================JDK7 自带的Objects===============");
		System.out.println(java.util.Objects.equals("a", "a")); // returns true
		System.out.println(java.util.Objects.equals(null, "b")); // returns true
		System.out.println(java.util.Objects.equals("a", null)); // returns true
		System.out.println(java.util.Objects.equals(null, null)); // returns true
	}
	
	/**
	 * hashCode
	 */
	@Test
	public void testHashCode() {
		String field01 = "01-内容";
		String field02 = "02-content";
		int field03 = 3;
		System.out.println("================Guava Objects===============");
		System.out.println(Objects.hashCode(field01, field02, field03));
		System.out.println("================JDK7 自带的Objects===========");
		System.out.println(java.util.Objects.hash(field01, field02, field03));
	}
	
	
	/**
	 * toString
	 * 		Objects.toStringHelper已经被Deprecation了，使用MoreObjects#toStringHelper(Object)替代它
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testToString() {
		System.out.println("================Guava Objects===============");
		ObjectsTest ot = new ObjectsTest();
		// Returns "ClassName{x=1}"
		System.out.println(Objects.toStringHelper(ot).add("x", 1).toString()); //返回：“ObjectsTest{x=1}”
		// Returns "MyObject{x=1}"
		System.out.println(Objects.toStringHelper("MyObject").add("x", 1).add("test", "asdf").toString()); //返回：“MyObject{x=1, test=asdf}”
		System.out.println("================JDK7 自带的Objects===========");
	}
	
	/**
	 * firstNonNull
	 * 		Objects.firstNonNull已经被Deprecation了，使用MoreObjects#firstNonNull替代它
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testFirstNotNull() {
		String first = null;
		String second = "123";
		String second2 = "abc";
		System.out.println("================Guava Objects===============");
		System.out.println(Objects.firstNonNull(second2, second)); //当第一个参数不为空时，返回第一个值
		System.out.println(Objects.firstNonNull(first, second)); //当第一个参数为null时，第二个参数不为null时，则返回第二个参数值
		System.out.println(Objects.firstNonNull(first, first)); //当第一个参数、第二个参数均为null时，抛出空指针异常
		System.out.println("================JDK7 自带的Objects===========");
	}
	
	@Test
	public void testRequiredNotNull() {
		System.out.println("================Guava Objects===============");
		System.out.println("================JDK7 自带的Objects===========");
		//System.out.println(java.util.Objects.requireNonNull(null));
		System.out.println(java.util.Objects.requireNonNull(null, "空指针异常")); //抛出NullPointerException
	}
	
}
