package com.hailiang.study.guava.common.base;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.google.common.base.Charsets;

public class CharsetsTest {
	
	/**
	 * 正常情况先的使用
	 */
	@Test
	public void testNormal() {
		try {
			byte[] bytes = "test".getBytes("UTF-8");
			System.out.println(bytes);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 使用下面的方法替代testNormal的实现
	 */
	@Test
	public void testCharsets() {
		System.out.println("中国".getBytes(Charsets.UTF_8));
	}
	
}
