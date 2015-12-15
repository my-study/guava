package com.hailiang.study.guava.common.collect;

import org.junit.Test;

public class ComparisonChainTest {

	/**
	 * compareTo
	 */
	@Test
	public void testCompare() {
		Person p1 = new Person("zs", "zhang", 20001);
		Person p2 = new Person("zs", "zhang", 20002);
		Person p3 = new Person("ls", "zhang", 20002);
		
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.compareTo(p3));
		System.out.println(p2.compareTo(p3));
	}
	
}
