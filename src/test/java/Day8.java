import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day8 {

    public String[] towerBuilder(int nFloors){
        if (nFloors <= 0 ){
            return new String[0];
        }
        String[] tower = new String[nFloors] ;
        tower[0] =" ".repeat(nFloors-1) +  "*" + " ".repeat(nFloors - 1);
        int prevsize = 1 ;
        int spaces = nFloors - 2 ;
        for (int i= 1 ; i < nFloors ; i++){
            tower[i] = " ".repeat(spaces)+"*".repeat(prevsize + 2) + " ".repeat(spaces) ;
            spaces-- ;
            prevsize += 2 ;
        }
        return tower ;
    }

    @Test
    public void nEqualOneShouldReturnOneStar(){
        assertEquals(String.join(",", "*"), String.join(",", towerBuilder(1)));
    }

    @Test
    public void towerShouldWork(){
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", towerBuilder(3)));
    }

}
