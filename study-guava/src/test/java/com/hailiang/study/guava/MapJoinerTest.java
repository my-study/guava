package com.hailiang.study.guava;

import java.util.Map;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

public class MapJoinerTest {

	@Test
	public void testMapJoiner() {
		String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys"; 
		Map<String,String> testMap = Maps.newLinkedHashMap();
		testMap.put("Washington D.C", "Redskins");
		testMap.put("New York City", "Giants");
		testMap.put("Philadelphia", "Eagles");
		testMap.put("Dallas", "Cowboys");
		String returnedString = Joiner.on("#"). withKeyValueSeparator("=").join(testMap); 
		System.out.println(returnedString);
		Assert.assertThat(returnedString, Is.is(expectedString));
	}
	
}
