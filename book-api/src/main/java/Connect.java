import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connect {
    private static HttpURLConnection httpConnection;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        String line;
        StringBuffer buffer = new StringBuffer();
        Json json = new Json();
        URL url = new URL("https://akai-recruitment.herokuapp.com/book");
        httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.setRequestMethod("GET");
        if (httpConnection.getResponseCode()==200){
            bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            while((line = bufferedReader.readLine()) != null){
                buffer.append(line);
            }
            bufferedReader.close();
        }
        else{
            bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()));
            while((line = bufferedReader.readLine()) != null){
                buffer.append(line);
            }
            bufferedReader.close();
        }
        json.parseAndGet(buffer.toString());
        httpConnection.disconnect();
    }
}