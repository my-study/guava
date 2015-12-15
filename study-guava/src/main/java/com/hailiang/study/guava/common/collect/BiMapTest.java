package com.hailiang.study.guava.common.collect;

import org.junit.Test;

import com.google.common.collect.EnumBiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;

public class BiMapTest {

	@Test
	public void testHashBiMap() {
		HashBiMap<String, Integer> map = HashBiMap.create();
		System.out.println(map);
	}
	
	@Test
	public void testImmutableBiMap() {
		ImmutableBiMap<String, Integer> map = ImmutableBiMap.of();
		System.out.println(map);
	}
	
	/**
	 * 输出结果：
	 * 		{SO=SO2, RA=RA2, RF=RF2}
	 */
	@Test
	public void testEnumBiMap() {
		EnumBiMap<OrderType, SlipType> map = EnumBiMap.create(OrderType.class, SlipType.class);
		map.put(OrderType.SO, SlipType.SO2);
		map.put(OrderType.RA, SlipType.RA2);
		map.put(OrderType.RF, SlipType.RF2);
		System.out.println(map);
	}
	
	/**
	 * 输出结果：
	 * 		{SO=SalesOrder, RA=Return, RF=Refund}
	 */
	@Test
	public void testEnumHashBiMap() {
		EnumHashBiMap<OrderType, String> map = EnumHashBiMap.create(OrderType.class);
		map.put(OrderType.SO, "SalesOrder");
		map.put(OrderType.RA, "Return");
		map.put(OrderType.RF, "Refund");
		System.out.println(map);
	}
	
	private enum OrderType {
		SO, RA, RF
	}
	
	private enum SlipType {
		SO2, RA2, RF2
	}
}
