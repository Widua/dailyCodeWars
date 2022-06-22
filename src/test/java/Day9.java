import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day9 {

    public String camelCase(String str){

        List<String> strings = Arrays.stream(str.split(" "))
                .filter( element -> element.length() >= 1 )
                .map((element) -> {
                    String first = String.valueOf(element.charAt(0)).toUpperCase() ;
                    return first + element.substring(1);
                }).toList();
        return strings.toString().replace("[","").replace("]","").replace(", ","") ;
    }

    @Test
    public void twoWordsTest(){
        assertEquals("CamelCase" , camelCase("camel case")) ;
    }

    @Test
    public void threeWordsTest(){
        assertEquals("CamelCaseTest",camelCase("camel case test"));
    }

    @Test
    public void startSpaceTest(){
        assertEquals("CamelCase",camelCase(" camel case"));
    }

}
