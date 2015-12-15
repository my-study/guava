package com.hailiang.study.guava.common.collect;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;

public class TableTest {
	
	@Test
	public void testHashBasedTable() {
		HashBasedTable<Integer, Integer, String> table = HashBasedTable.create();
		
		for (int row = 0; row < 5; row ++) {
			for (int column = 0; column < 10; column ++) {
				table.put(row, column, row + "_" + column);
			}
		}
		
		System.out.println(table.rowMap().toString());
	}
}
