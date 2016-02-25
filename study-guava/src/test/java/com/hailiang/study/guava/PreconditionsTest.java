package com.hailiang.study.guava;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Preconditions;

public class PreconditionsTest {
	
	/**
	 * checkArgument(boolean)
	 * 		功能描述：检查boolean是否为真。 用作方法中检查参数
	 * 		失败时抛出的异常类型: IllegalArgumentException
	 */
	@Test
	public void test01() {
		int age = -1;
//		Preconditions.checkArgument(age > 0, "age 必须大于0");
		
		Preconditions.checkArgument(age > 0, "age=%s, 必须大于%s", age, "零"); //java.lang.IllegalArgumentException: age=-1, 必须大于零
	}
	
	/**
	 * checkNotNull(T)
	 * 		功能描述：检查value不为null， 直接返回value
	 * 		失败时抛出的异常类型：NullPointerException
	 */
	@Test
	public void test02() {
		Preconditions.checkNotNull("");
		Preconditions.checkNotNull("adfa");
	}
	
	
	/**
	 * checkState(boolean)
	 * 		功能描述：检查对象的一些状态，不依赖方法参数。 例如， Iterator可以用来next是否在remove之前被调用。
	 * 		失败时抛出的异常类型：IllegalStateException
	 */
	@Test
	public void test03() {
		List<String> lists = new ArrayList<String>();
		lists.add("abcdefg");
		
		int index = 2;
		Preconditions.checkState(lists.size() < index, "lists size 不能大于" + index);
	}
	
	
	/**
	 * checkPositionIndex(int index, int size)
	 * 		功能描述：检查index是否为在一个长度为size的list， string或array合法的范围。 index的范围区间是[0, size)(包含0不包含size)。无需直接传入list， string或array， 只需传入大小。返回index。   
	 * 		失败时抛出的异常类型：IndexOutOfBoundsException
	 */
	@Test
	public void test04() {
		List<String> lists = new ArrayList<String>();
		lists.add("abcdefg");
		int index = 1;
		Preconditions.checkPositionIndex(index, lists.size(), "index " + index + " 不在 list中， List size为：" + lists.size());
	}

	
	/**
	 * checkPositionIndexes(int start, int end, int size)：
	 * 		功能描述：				检查[start, end)是一个长度为size的list， string或array合法的范围子集。伴随着错误信息。
	 * 		失败时抛出的异常类型：	IndexOutOfBoundsException
	 */
	@Test
	public void test05() {
		List<String> lists = new ArrayList<String>();
		lists.add("abcdefg");
		lists.add("abcdefg");
		lists.add("abcdefg");
		lists.add("abcdefg");
		Preconditions.checkPositionIndexes(1, 5, lists.size());
	}
}
