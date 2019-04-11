package DemoWeather;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22";
        URL objUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)objUrl.openConnection();
        System.out.println("response code: "+conn.getResponseCode()+"--"+conn.getResponseMessage());

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );
        String response = new String();
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null){
            response += inputLine;
        }
        System.out.println("response XML: "+response);
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
        NodeList nodeList = doc.getElementsByTagName("current");
        if(nodeList.getLength() > 0){
            Element current = (Element) nodeList.item(0);
            Element city = (Element) current.getElementsByTagName("city").item(0);
            System.out.println("City: "+city.getAttribute("name"));
            Element temp = (Element)current.getElementsByTagName("temparature").item(0);
            System.out.println("Temp:"+temp.getAttribute("value"));
            System.out.println("Min:"+temp.getAttribute("min"));
            System.out.println("Max:"+temp.getAttribute("max"));
        }

    }

    public static void mainPost() throws Exception{
        String POST_URL="http://s07e.fptaptechcompetition.com/api/postAPI";
        URL objUrl = new URL(POST_URL);
        HttpURLConnection conn = (HttpURLConnection)objUrl.openConnection();
        //ONLY POST METHOD
        conn.setRequestMethod("POST");
        //POST WITH PARAMS
        String PARAMS ="city=Hanoi&temp=22";
        conn.setDoOutput(true);
        OutputStream outputStream = conn.getOutputStream();
        outputStream.write(PARAMS.getBytes());
        outputStream.flush();
        outputStream.close();
        //END
        System.out.println(conn.getResponseCode());


    }

    public static void mainJson(String[] args) throws Exception {
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22";
        URL objUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)objUrl.openConnection();
        System.out.println("response code: "+conn.getResponseCode()+"--"+conn.getResponseMessage());

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );
        String response = new String();
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null){
            response += inputLine;
        }
        System.out.println("response: "+response);
        Object object = JSONValue.parse(response);
        JSONObject jsonObject = (JSONObject)object;
        String cityName = (String)jsonObject.get("name");
        System.out.println("city: "+cityName);
        JSONObject mainObject = (JSONObject)jsonObject.get("main");
        Double temp = (Double)mainObject.get("temp");
        Double minTemp = (Double)mainObject.get("temp_min");
        Double maxTemp = (Double)mainObject.get("temp_max");
        System.out.println(cityName +"--"+temp+"--"+minTemp+"--"+maxTemp);

    }
}
