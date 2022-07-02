import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day13 {

    public String makeReadable(int seconds) {
        String hours = String.valueOf(seconds / 3600);
        seconds = seconds - (Integer.parseInt(hours) * 3600);
        String minutes = String.valueOf((seconds) / 60);
        seconds = seconds - (Integer.parseInt(minutes) * 60) ;
        String strSeconds = String.valueOf(seconds);

        if (hours.length() == 1){
            hours = "0"+hours ;
        }
        if (minutes.length() == 1){
            minutes = "0"+minutes ;
        }
        if (strSeconds.length() == 1){
            strSeconds = "0"+ strSeconds ;
        }

        return hours + ":" + minutes + ":" + strSeconds;
    }

    @Test
    public void Tests() {
        assertEquals( "00:00:00", makeReadable(0));
        assertEquals( "00:00:05", makeReadable(5));
        assertEquals( "00:01:00", makeReadable(60));
        assertEquals("23:59:59", makeReadable(86399));
        assertEquals("99:59:59", makeReadable(359999));
    }
}
