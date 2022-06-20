import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day7 {

    public String expandedForm(int num){
        String fullNumber = String.valueOf(num) ;
        String[] elements = fullNumber.split("(?=[1-9])");
        StringBuilder fin = new StringBuilder();

        int fullLength = fullNumber.length() ;
        int actualLength = 0 ;

        for (int i = 0 ; i < fullLength ; i++ ){
            if (actualLength == fullLength){
                break;
            }
            actualLength += elements[i].length() ;

            fin.append(" + ").append(Integer.parseInt(elements[i]) * (int) Math.pow (10,fullLength - actualLength));
        }


        return fin.toString().substring(3);
    }




    @Test
    public void basicNumbersTest(){
        assertEquals("10 + 2" , expandedForm(12)) ;
        assertEquals("40 + 2" , expandedForm(42));
    }

    @Test
    public void moreComplicatedNumbers(){
        assertEquals("400000 + 300 + 1" , expandedForm(400301));
    }

}
