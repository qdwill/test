package lqas.automation;

import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void firstTest(){
		int a = 2;
		int b = 4;
		System.out.println("test 1");
		Assert.assertTrue(a + b == 6);
	}
	
	@Test
	public void secondTest(){
		int a = 2;
		int b = 4;
		System.out.println("test 2");
		Assert.assertTrue(b - a == 2);
	}

	/**
	 * 测试TimeOut
	 * 超时测试（应用场景，请求elk数据关于时长）
	 */
	@Test(timeOut = 1)
	public void testSub() {
		int i =0;
		while (i < 1000000000) {
			i++;
		}
	}

	/**
	 * 异常测试
	 * 异常测试用于测试方法是否有抛出异常，通过 @Test(expected=NullPointerException.class) 来指定方法必须抛出 NullPointerException，如果没有抛出异常或者抛出其他异常则测试失败。
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testNullPoint(){
		throw new NullPointerException();
	}
/**
 * 测试依赖
 */
@Test(dependsOnMethods = {"dependencyTest2","dependencyTest3"})
public void dependencyTest(){
	System.out.println("dependency  out....");
}
	@Test
	public void dependencyTest2(){
		System.out.println("dependencyTest2  out....");
	}
	@Test
	public void dependencyTest3(){
		System.out.println("dependencyTest3  out....");
	}

}
