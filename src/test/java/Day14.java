import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day14 {

    public String extractFileName (String dirtyFileName){
        Pattern pattern = Pattern.compile("_[\\dA-z_-]*[.][\\dA-z-]*") ;
        Matcher matcher = pattern.matcher(dirtyFileName) ;
        List<MatchResult> collect = matcher.results().toList();
        return collect.get(0).group().substring(1);
    }

    @Test
    public void testSample() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        );
        assertEquals(
                "FILE_NAME.EXTENSION",
                extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        );
    }


}
