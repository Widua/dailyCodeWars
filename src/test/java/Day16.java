import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day16 {

    public List<Object> filterList(final List<Object> list){
        List<Object> toReturn = new ArrayList<>() ;
        for (Object o : list) {
            if (o instanceof Integer ){
                toReturn.add(o) ;
            }
        }
        return toReturn ;
    }


    @Test
    public void examples() {
        assertEquals(List.of(1, 2), filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }

}
