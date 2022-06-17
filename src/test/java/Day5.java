import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Day5 {

    public boolean getXO(String str){
        str = str.toLowerCase() ;
        List<String> characters = Arrays.stream(str.split("")).toList();

        List<String> listOfX = characters.stream()
                .filter((element) -> {
                    return element.equals("x");
                }).toList();

        List<String> listOfO = characters.stream()
                .filter((element) -> {
                    return element.equals("o");
                }).toList();

        return listOfO.size() == listOfX.size() ;
    }

    @Test
    public void ifNoXandOShouldBeTrue(){
        assertTrue(getXO("asdadadadas"));
    }

    @Test
    public void unequalNumberOfXandOShouldBeFalse(){
        assertFalse(getXO("xxxxxxo"));
    }

    @Test
    public void caseShouldNotInterfere(){
        assertTrue(getXO("XXXxoooO"));
    }




}
