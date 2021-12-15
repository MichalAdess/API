import org.testng.annotations.Test;

public class TestValidStatus {

    @Test
    public void testStatusCode() {
        DateJsonTest dateObj = DateAPI.getDateObj();
        if (dateObj.getStatus() == 200) {
            System.out.println("status code is correct::" + dateObj.getStatus());
        } else {
            System.err.println("status code should be 200 but it is " + dateObj.getStatus());
        }
    }
}
