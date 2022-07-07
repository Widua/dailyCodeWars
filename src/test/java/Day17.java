import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day17 {

    public int[] hexStringToRGB(String hex){
        // #------
        int[] rgb = new int[3] ;
        rgb[0] = convertToDecimal(hex.substring(1,3));
        rgb[1] = convertToDecimal(hex.substring(3,5));
        rgb[2] = convertToDecimal(hex.substring(5));

        return rgb ;
    }

    public static int convertToDecimal(String hex){
        return Integer.parseInt(hex,16);
    }


    @Test
    public void allOne() {
        assertArrayEquals(hexStringToRGB("#111111"), new int[] {17, 17, 17});
    }

    @Test public void allZero() {
        assertArrayEquals(hexStringToRGB("#000000"), new int[] {0, 0, 0});
    }

    @Test public void more() {
        assertArrayEquals(hexStringToRGB("#FF9933"), new int[] {255, 153, 51});
        assertArrayEquals(hexStringToRGB("#beaded"), new int[] {190, 173, 237});
        assertArrayEquals(hexStringToRGB("#Fa3456"), new int[] {250, 52, 86});
    }





}
