import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//מחלקה שבודקת שהפורמט שחזר הוא MM-DD-YYYY
public class TestFormatDate {

    @Test
    public void testFormatDate() {
        try {
            //parse the date to the MM-dd-yyyy format
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            sdf.parse(DateAPI.getDateObj().getDate());
            System.out.println("date format is like expected MM-dd-yyyy");
        } catch(ParseException ex) {
            System.err.println("date format is not like expected");
        }
    }

}
