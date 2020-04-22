package lesson2209;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTDDTest {

    @ParameterizedTest
    @MethodSource("sourceAddElement")
    void one(int[] array,int element,int[] expectResult) {
        ExampleTDD example=new ExampleTDD();
        //assertTrue(par>0);
//        int[] arr={1,2,3};
//        int[] expectedResult={1,2,3,7};
        int[] factResult=example.addElement(array,element);
       assertArrayEquals(expectResult,factResult);
    }

    static Stream<Arguments> sourceAddElement(){
        return Stream.of(
                Arguments.arguments(new int[]{1,2,3},2,new int[] {1,2,3,2}),
                Arguments.arguments(new int[]{1,2,7,9},33,new int[] {1,2,7,9,33}),
                Arguments.arguments(new int[]{},2,new int[] {2})
        );
    }
@DisplayName("♡")
    @ParameterizedTest
    @CsvSource({
       "20,2",
       "59,2",
       "60,3",
       "61,3",
       "74,3",
       "75,4",
       "76,4",
       "89,4",
       "90,5",
       "91,5"
           })
    void testConvert(int ball,int resultExp){
       ExampleTDD example=new ExampleTDD();
       int factResult=example.convert(ball);
       assertEquals(resultExp,factResult);
    }


}