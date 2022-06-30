import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day11 {

    public String dashatize(int num){
        String collect = Arrays.stream(String.valueOf(num).split(""))
                .map((number) -> {
                    if (number.equals("-")){
                        return "";
                    }
                    if (Integer.parseInt(number) % 2 != 0) {
                        return new String( "-"+number + "-");
                    } else {
                        return number;
                    }
                }).collect(Collectors.joining());

        if (collect.charAt(0) == '-'){
            collect = collect.replaceFirst("-","" );
        }
        if (collect.charAt(collect.length()-1) == '-'){
            collect = collect.substring(0,collect.length()-1) ;
        }
        return collect.replace("--","-") ;
    }


    @Test
    public void testBasic() {
        assertEquals("2-7-4", dashatize(274));
        assertEquals("5-3-1-1", dashatize(5311));
        assertEquals("86-3-20", dashatize(86320));
        assertEquals("9-7-4-3-02", dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", dashatize(0));
        assertEquals("1", dashatize(-1));
        assertEquals("28-3-6-9", dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", dashatize(-1111111111));
    }



}
