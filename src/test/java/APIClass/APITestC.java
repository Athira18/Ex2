package APIClass;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class APITestC {

    public void getapi(String url) throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response1 = httpclient.execute(httpGet);

        System.out.println("GET Request Status Code : "+response1.getStatusLine());
        HttpEntity entity1 = response1.getEntity();
        String apiOutput = EntityUtils.toString(entity1);
        //Lets see what we got from API
//        System.out.println(apiOutput);
        response1.close();
    }

    public void postapi(String url) throws IOException{
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);

        JSONObject jsonobj = new JSONObject();
//        jsonobj.put("name","athira");
//        jsonobj.put("salary","100");
//        jsonobj.put("age","29");

        jsonobj.put("UserName", "simpleuser001");
        jsonobj.put("password", "pass");


        StringEntity entity = new StringEntity(jsonobj.toString());
        httpPost.setEntity(entity);
        //httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        CloseableHttpResponse response = client.execute(httpPost);
        String respons = response.toString();
        System.out.println("POST Request Status Code : "+respons);

        client.close();

    }


    }

