import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day18 {

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(
                        (word) -> {
                            Pattern pattern = Pattern.compile("[A-z]+");
                            Matcher match = pattern.matcher(word);
                            if (match.matches()) {
                                return word.substring(1) + word.charAt(0) + "ay";
                            }
                            return word;
                        }
                ).collect(Collectors.joining(" "));
    }

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", pigIt("This is my string"));
    }





}
