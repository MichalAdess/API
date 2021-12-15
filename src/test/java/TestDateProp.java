import org.testng.annotations.Test;
//מחלקה שבודקת ששדה תאריך חזר
public class TestDateProp {

    @Test
    public void testRetObjContainsDateProp() {
        DateJsonTest dateObj = DateAPI.getDateObj();
        if (dateObj.getDate() != null) {
            System.out.println("return object contains date property::" + dateObj.getDate());
        } else {
            System.err.println("return object date property is null");
        }
    }

}
