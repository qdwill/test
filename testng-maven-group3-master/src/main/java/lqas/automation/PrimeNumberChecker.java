package lqas.automation;

/**
 * Created by 01439090 on 2018/4/24.
 */

/**
 * 创建一个java类PrimeNumberChecker.java。这个类检查，如果是素数
 */
public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
