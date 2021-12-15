import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
//מחלקה שמנהלת את ה API
public class DateAPI {

    static String url = "http://date.jsontest.com/";

    public static DateJsonTest getDateObj() {
        try {
            //open url connection
            URLConnection connection = new URL(url).openConnection();
            connection.setRequestProperty("Content-Type", "application/json");
            if (connection instanceof HttpURLConnection) {
                //the connection is from http type
                HttpURLConnection httpConnection = (HttpURLConnection) connection;
                //the way to read the content
                BufferedReader br = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String s = br.readLine();
                while (s != null) {
                    //append each row in order to get the all string result
                    sb.append(s);
                    s = br.readLine();
                }
                //convert json to object
                DateJsonTest dateJsonTest = new Gson().fromJson(sb.toString(), DateJsonTest.class);
                dateJsonTest.setStatus(httpConnection.getResponseCode());
                return dateJsonTest;
            } else {
                System.err.println("error!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new DateJsonTest() {
        };
    }


}
