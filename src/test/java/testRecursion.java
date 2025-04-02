import data_provider.ValuesForPowerOfTwo;
import org.testng.annotations.Test;
import recursion.LeetCodeRecursionExamples;

import static org.assertj.core.api.Assertions.assertThat;

public class testRecursion {

    @Test(dataProvider = "data-provider-positive", dataProviderClass = ValuesForPowerOfTwo.class)
    public void testRecursionIsPowerOfTwo_positive(int digit) {
        boolean actual = LeetCodeRecursionExamples.isPowerOfTwo(digit);
        assertThat(actual).isTrue();
    }

    @Test(dataProvider = "data-provider-negative", dataProviderClass = ValuesForPowerOfTwo.class)
    public void testRecursionIsPowerOfTwo_negative(int digit) {
        boolean actual = LeetCodeRecursionExamples.isPowerOfTwo(digit);
        assertThat(actual).isFalse();
    }
}
