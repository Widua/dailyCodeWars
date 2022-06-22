import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day10 {

    public int[] parse(String data){
        List<String> instructions = Arrays.asList( data.split("") ) ;

        int value = 0;
        List<Integer> values = new ArrayList<>() ;

        for (String instruction : instructions) {
            switch (instruction){
                case "i" -> {
                    value += 1 ;
                }
                case "d" -> {
                    value -= 1 ;
                }
                case "s" -> {
                    value = value * value ;
                }
                case "o" -> {
                    values.add(value) ;
                }
            }
        }
        return values.stream().mapToInt(i -> i).toArray();
    }



    @Test
    public void simpleTest(){
        assertArrayEquals(new int[] {8, 64}, parse("iiisdoso"));
    }


}
