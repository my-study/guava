package com.hailiang.study.guava;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Joiner;

public class JoinerTest {
	
	private static List<String> lists = new ArrayList<String>();
	static {
		lists.add("AAA");
		lists.add(" ");
		lists.add("");
		lists.add(null);
		lists.add("BBB");
		lists.add("CCC");
	}

	
	@Test
	public void testJoiner01() {
		String result = Joiner.on(",").skipNulls().join(lists);
		System.out.println(result);
		Assert.assertEquals("AAA, ,,BBB,CCC", result);
	}
	
	@Test
	public void testJoiner02() {
		String result = Joiner.on(",").useForNull("no value").join(lists);
		System.out.println(result);
		Assert.assertEquals("AAA, ,,no value,BBB,CCC", result);
	}
	
	
	/**
	 * skipNulls与useForNull不能同时使用
	 */
	@Test
	public void testJoiner03() {
		Joiner joiner = Joiner.on(",").skipNulls();
		joiner.useForNull("missing");
		String result = joiner.join(lists);
		System.out.println(result);;
	}
	
	
	/**
	 * 与StringBuilder一起使用
	 */
	@Test
	public void testJoiner04() {
		Joiner joiner = Joiner.on(",").useForNull("missing");
		StringBuilder sb = new StringBuilder();
		joiner.appendTo(sb, lists);
		System.out.println(sb.toString());
		Assert.assertEquals("AAA, ,,missing,BBB,CCC", sb.toString());
	}
	
}
