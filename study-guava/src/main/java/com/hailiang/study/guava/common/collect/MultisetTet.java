package com.hailiang.study.guava.common.collect;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

public class MultisetTet {

	@Test
	public void testHashMultiset() {
		Multiset<String> ms = HashMultiset.create();
		ms.add("a");
		ms.add("a");
		ms.add("b");
		ms.add("a");
		System.out.println(ms.toString());
		
		System.out.println("=========entrySet============");
		Set<Multiset.Entry<String>> sets = ms.entrySet();
		for (Multiset.Entry<String> entry : sets) {
			System.out.println(entry.getElement() + " = " + entry.getCount());
		}
		
		System.out.println("=========elementSet============");
		Set<String> strSets = ms.elementSet();
		for (String str : strSets) {
			System.out.println(str);
		}
		
		System.out.println("=========iterator============");
		Iterator<String> it = ms.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testTreeMultiset() {
		Multiset<String> ms = TreeMultiset.create();
		ms.add("a");
		ms.add("a");
		ms.add("b");
		ms.add("a");
		System.out.println(ms.toString());
		
		System.out.println("=========entrySet============");
		Set<Multiset.Entry<String>> sets = ms.entrySet();
		for (Multiset.Entry<String> entry : sets) {
			System.out.println(entry.getElement() + " = " + entry.getCount());
		}
		
		System.out.println("=========elementSet============");
		Set<String> strSets = ms.elementSet();
		for (String str : strSets) {
			System.out.println(str);
		}
		
		System.out.println("=========iterator============");
		Iterator<String> it = ms.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
