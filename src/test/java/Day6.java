import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6 {

    public String printerError(String s){
        Pattern pattern = Pattern.compile("[a-m]*") ;
        Matcher match = pattern.matcher(s) ;
        String notCorrect = match.replaceAll("");
        return notCorrect.length() + "/"+ s.length();
    }


    @Test
    public void allCorrectShouldReturn0n(){
        assertEquals("0/5" , printerError("aaaab")) ;
    }

    @Test
    public void shouldCountErrors(){
        assertEquals("3/5" , printerError("zzzaa"));
    }

    @Test
    public void emptyShouldGive00(){
        assertEquals("0/0", printerError(""));
    }


}
