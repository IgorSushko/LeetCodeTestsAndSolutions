package data_provider;

import org.testng.annotations.DataProvider;

public class ValuesForPowerOfTwo {
    @DataProvider(name = "data-provider-positive")
    static public Object[][] positive() {
        return new Object[][]{{4}, {8}, {16}, {256}, {1024}, {4096}, {1073741824}};
    }

    @DataProvider(name = "data-provider-negative")
    static public Object[][] negative() {
        return new Object[][]{{-4}, {9}, {100500}, {10000008}, {300}, {0}, {2147483647}};
    }
}
