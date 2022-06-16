import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day4 {

    public int countPassengers(ArrayList<int[]> stops){

        List<Integer> arrivals = stops.stream()
                .map((stop) -> {
                    return stop[0];
                }).toList();

        List<Integer> departures = stops.stream()
                .map( (stop) -> {return stop[1] ;} )
                .toList() ;

        int sumArrivals = arrivals.stream()
                .mapToInt( (element) -> {return element ;} ).sum() ;

        int sumDepartures = departures.stream()
                .mapToInt( (element) -> {
                    return element;
                } ).sum() ;
        return sumArrivals - sumDepartures ;
    }

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, countPassengers(list));
    }
}


