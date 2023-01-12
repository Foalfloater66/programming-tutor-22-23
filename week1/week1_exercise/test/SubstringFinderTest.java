import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SubstringFinderTest {
    @ParameterizedTest
    @CsvSource({
            "a, a",
            "abgbeahj, gbeahj",
            "abababiabababa, abi",
            "abcdeffedcbaz, fedcbaz"
    })
    public void simpleSubstring(String string, String substring){
        assertEquals(SubstringFinder.getUnrepeatingSubstring(string), substring);
    }
}
