import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2 {

    public String makeComplement(String dna){
        List<String> dnaComponents = Arrays.asList( dna.split("") ) ;

        dnaComponents = dnaComponents.stream()
                .map( (element -> {
                    if (element.equals("T")){
                        return "A" ;
                    }
                    if (element.equals("A")){
                        return "T" ;
                    }
                    if (element.equals("C")){
                        return "G" ;
                    }
                    if (element.equals("G")){
                        return "C";
                    }
                    return element ;
                }) )
                .collect(Collectors.toList()) ;

        return dnaComponents.toString().replace("[","").replace("]","").replace(",","").replace(" ","") ;
    }


    @Test
    public void aShouldConvertToT () {
        assertEquals("TTTT" , makeComplement("AAAA")) ;
    }

    @Test
    public void tShouldConvertToA () {
        assertEquals("AAAA" , makeComplement("TTTT")) ;
    }

    @Test
    public void cShouldConvertToG () {
        assertEquals("CCCC" , makeComplement("GGGG") );
    }

    @Test
    public void GShouldConvertToC () {
        assertEquals("GGGG" , makeComplement("CCCC") );
    }

    @Test
    public void otherComponentsShouldNotChange(){
        assertEquals("ABBBCCCCCGGGGTTTTVCCCDHGH" , makeComplement("TBBBGGGGGCCCCAAAAVGGGDHCH"));
    }

    @Test
    public void emptyShouldReturnEmpty(){
        assertEquals("", makeComplement(""));
    }

}
