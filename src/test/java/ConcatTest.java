

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConcatTest {
    @Test
    void testConcatenation() {
        // given
        String a = "ali";
        String b = "erfagh";
        Concat concat = new Concat();
        // when
        String results = concat.concatFLNames(a, b);
        // then
        assertEquals("ali,erfagh", results);
    }

//    @Test
    @ParameterizedTest(name = "{0} + {1} ={2}")// formatted String for showing in test name
    @CsvSource(
            {
                    "1.0,1.0,2.0"
            })
    void add(double first, double second, double expected) {
        //given

        //when


        Concat concat = new Concat();
        double res = concat.add(
                first,
                second
        );


        //then

        assertEquals(
                expected,
                res
//                () -> "failed " + first + "+" + second + " should be " + expected + " but had " + res
        );
    }
}