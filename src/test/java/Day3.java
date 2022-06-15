import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3 {

    public int getSum(int a , int b){
        int high ;
        int low ;
        if (a == b){
            return a;
        }

        if (a > b){
            high = a ;
            low = b ;
        } else{
            high = b ;
            low = a ;
        }
        int sum = 0;

        for ( int i = low ; i < high+1 ; i++  ){
            sum += i ;
        }
        return sum ;
    }

    @Test
    public void sumShouldWork(){
        assertEquals(1 , getSum(1, 0));
        assertEquals(3, getSum(1,2));
        assertEquals(2,getSum(-1,2));
    }








}
