package com.hailiang.study.guava.common.collect;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.TreeMultimap;

public class MultimapTest {
	
	@Test
	public void testArrayListMultimap() {
		ArrayListMultimap<String, Integer> map = ArrayListMultimap.create();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key2", 22);
		map.put("key3", 3);
		map.put("key4", 4);
		
		System.out.println(map);
		System.out.println(map.size());
		List<Integer> key2List = map.get("key2");
		System.out.println(key2List);
	}
	
	/**
	 * 输出结果：
	 * 		{k3=[3], k1=[1], k2=[222, 2, 22]}
	 * 		5
	 * 		[222, 2, 22]
	 */
	@Test
	public void testHashMultimap() {
		HashMultimap<String, Integer> map = HashMultimap.create();
		map.put("k1", 1);
		map.put("k2", 2);
		map.put("k2", 22);
		map.put("k2", 222);
		map.put("k2", 2);
		map.put("k3", 3);
		
		System.out.println(map);
		System.out.println(map.size());
		
		Set<Integer> sets = map.get("k2");
		System.out.println(sets);
	}
	
	
	@Test
	public void testTreeMultimap() {
		TreeMultimap<String, Integer> map = TreeMultimap.create();
		System.out.println(map);
	}
	
	
	@Test
	public void testLinkedListMultimap() {
		LinkedListMultimap<String, Integer> map = LinkedListMultimap.create();
		System.out.println(map);
	}
	
	@Test
	public void testLinkedHashMultimap() {
		LinkedHashMultimap<String, Integer> map = LinkedHashMultimap.create();
		System.out.println(map);
	}
	
	@Test
	public void testImmutableListMultimap() {
		ImmutableListMultimap<String, Integer> map = ImmutableListMultimap.of("k1", 1);
		System.out.println(map);
	}
	
	@Test
	public void testImmutableSetMultimap() {
		ImmutableSetMultimap<String, Integer> map = ImmutableSetMultimap.of("k1", 1);
		System.out.println(map);
	}
	
}
