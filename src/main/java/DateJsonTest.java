import java.util.Date;
//מחלקה שמתארת את הגייסון כאוביקט
public class DateJsonTest {

    private int status;
    private String date;
    private String milliseconds_since_epoch;
    private String time;

    public String getDate() {
        return date;
    }

    public String getMilliseconds_since_epoch() {
        return milliseconds_since_epoch;
    }

    public String getTime() {
        return time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
