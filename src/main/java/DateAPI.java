import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class DateAPI {

    static String url = "http://date.jsontest.com/";
    static String charset = "UTF-8";

    public static DateJsonTest getDateObj() {
        try {
            URLConnection connection = new URL(url).openConnection();
            connection.setRequestProperty("Accept-Charset", charset);
            connection.setRequestProperty("Content-Type", "application/json");
            if (connection instanceof HttpURLConnection) {
                HttpURLConnection httpConnection = (HttpURLConnection) connection;
                httpConnection.setRequestMethod("GET");
                BufferedReader br = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String s = br.readLine();
                while (s != null) {
                    sb.append(s);
                    s = br.readLine();
                }
//                System.out.println(sb);
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
