package testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by 01439090 on 2018/4/24.
 */
public class ParameterizedTest1 {
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
    }
}
