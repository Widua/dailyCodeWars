import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day12 {

    public String getOrder (String input){
        StringBuilder toReturn = new StringBuilder() ;

        Set<String> ingredientsSet = new LinkedHashSet<>();
        ingredientsSet.add("Burger");
        ingredientsSet.add("Fries") ;
        ingredientsSet.add("Chicken") ;
        ingredientsSet.add("Pizza");
        ingredientsSet.add("Sandwich") ;
        ingredientsSet.add("Onionrings") ;
        ingredientsSet.add("Milkshake") ;
        ingredientsSet.add("Coke") ;

        ingredientsSet.forEach(
                (v) ->
                {
                    Pattern pattern = Pattern.compile(v.toLowerCase());
                    Matcher matcher = pattern.matcher(input);
                    long howMany = matcher.results().count() ;
                    String toAppend = v + " " ;
                    toReturn.append(toAppend.repeat((int) howMany)) ;
                }

        );
        return toReturn.toString().substring(0, toReturn.length() - 1);
    }

    @Test
    public void test() {
        assertEquals("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
        assertEquals("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", getOrder("pizzachickenfriesburgercokemilkshakefriessandwich"));
    }

}
