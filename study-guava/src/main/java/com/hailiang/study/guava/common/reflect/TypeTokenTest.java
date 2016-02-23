package com.hailiang.study.guava.common.reflect;

import java.lang.reflect.GenericArrayType;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.reflect.TypeToken;

public class TypeTokenTest {

	/**
	 * 判断两个实例化对象，是否相等
	 * 		由于TypeToken方法已经重写了equal和hasCode
	 */
	@Test
	public void testValueEqualityNotInstanceEquality() {
		//实例a
		TypeToken<List<String>> a = new TypeToken<List<String>>() {
			private static final long serialVersionUID = 6185799231060980121L;
		};
		
		//实例b
		TypeToken<List<String>> b = new TypeToken<List<String>>() {
			private static final long serialVersionUID = -2078122521459935552L;
		};
		
		//实例a=实例b
		Assert.assertEquals(a, b);
	}
	
	
	/**
	 * 测试数组类型
	 */
	@Test
	public void testGenericArrayType() {
		TypeToken<List<String>[]> token = new TypeToken<List<String>[]>() {
			private static final long serialVersionUID = 1L;
		};
		
		Assert.assertEquals(List[].class, token.getRawType());
		Assert.assertThat(token.getType(), IsInstanceOf.instanceOf(GenericArrayType.class));
	}
	
	
	/**
	 * 测试类型是否正确
	 * RawType:原生类型
	 */
	@Test
	public void testRawTypeIsCorrect() {
		TypeToken<List<String>> a = new TypeToken<List<String>>() {
			private static final long serialVersionUID = 6185799231060980121L;
		};
		System.out.println(List.class == a.getRawType());
	}
	
	
	@Test
	public void testTypeIsCorrect() {
		TypeToken<List<String>> tt = new TypeToken<List<String>>() {
			private static final long serialVersionUID = 6185799231060980121L;
		};
		
		System.out.println(StringList.class.getGenericInterfaces()[0]);
		System.out.println(tt.getType());
	}
	
	private abstract static class StringList implements List<String> {}
}
