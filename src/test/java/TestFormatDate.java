import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestFormatDate {

    @Test
    public void testFormatDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            sdf.parse(DateAPI.getDateObj().getDate());
            System.out.println("date format is like expected");
        } catch(ParseException ex) {
            System.err.println("date format is not like expected");
        }
    }

}
