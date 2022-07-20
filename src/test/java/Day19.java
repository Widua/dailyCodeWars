import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day19 {

    public static int wordsSimilarity(String str1 , String str2){
        int similarity = 0 ;
        List<String> letters = new java.util.ArrayList<>(List.of(str2.split("")));

        for (String s : str1.split("")) {
            if (letters.contains(s)){
                similarity += 1 ;
                letters.remove(s) ;
            }
        }
        return similarity ;
    }

    public static boolean scramble(String str1, String str2) {
        return wordsSimilarity(str1,str2) == str2.length() ;
    }

    @Test
    public void doesAnagramWork(){
        // Given
        String word1 = "world" ;
        String word2 = "rldwo" ;
        // When
        boolean isTrue = scramble(word1 , word2) ;
        // Then
        assertTrue(isTrue) ;
    }

    @Test
    public void doesAnagramButWithAdditionalLettersWork(){
        // Given
        String word1 = "rkldwoxxyyzz" ;
        String word2 = "world";
        // When
        boolean isTrue = scramble(word1,word2) ;
        // Then
        assertTrue(isTrue);
    }

    @Test
    public void thisShouldNotWork(){
        // Given
        String word1 = "xyz" ;
        String word2 = "xxxyyyyzzzz" ;
        // When
        boolean isFalse = scramble(word1,word2) ;
        // Then
        assertFalse(isFalse);
    }


}
