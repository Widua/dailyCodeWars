import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day15 {

    public String remove(String str){
        return str.substring(1,str.length()-1) ;
    }

    @Test
    public void testRemoval() {
        assertEquals("loquen", remove("eloquent"));
        assertEquals("ountr", remove("country"));
        assertEquals("erso", remove("person"));
        assertEquals("lac", remove("place"));
    }


}
