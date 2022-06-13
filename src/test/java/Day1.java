import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1 {

    /*
    In that algorithm, we must swap all elements in String except last four characters with '#'.
     */

    public String maskify(String str){
        if (!(str.length() < 4)) {
            String substr = str.substring(str.length() - 4);
            int how = str.length() - 4 ;
            String hash = "#".repeat(how) ;
            str = hash + substr ;
        }
        return str ;
    }


    @Test
    public void emptyShouldReturnEmpty() {
        assertEquals("",maskify(""));
    }

    @Test
    public void lessThanFourShouldReturnNotMasked(){
        assertEquals("1",maskify("1"));
    }

    @Test
    public void moreThanFourShouldReturnLastFourNotMasked(){
        assertEquals("##3456",maskify("123456"));
    }

    @Test
    public void longTextShouldWorkToo(){
        assertEquals( "#".repeat(54)+"ING!", maskify("I LIKE CODING SOOOO MUCH, I CAN SPEND MUCH TIME ON CODING!"));
    }

}
