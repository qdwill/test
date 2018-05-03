package testng.parameter;

import lqas.automation.Bean;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by 01439090 on 2018/4/24.
 */
public class ParamTestWithDataProvider2 {
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { { new Bean("hi I am the bean", 111) } };
    }

    @Test(dataProvider = "test1")
    public void testMethod(Bean myBean) {
        System.out.println(myBean.getVal() + " " + myBean.getI());
    }
}
