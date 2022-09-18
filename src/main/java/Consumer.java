import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

public class Consumer {
    public static void main(String[] args) {


        RestTemplate restTemplate = new RestTemplate();

        String url = "http://94.198.50.185:7081/api/users";

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        String sessionId = String.valueOf(responseEntity.getHeaders().getFirst("Set-Cookie"));

        HttpHeaders headers = new HttpHeaders();
        headers.set("Cookie", sessionId);

        System.out.println("MOYA SESSISA: " + sessionId);

// =============================================================================================================

        Map<String, String> jsonForPOST = new HashMap<>();
        jsonForPOST.put("id", "3");
        jsonForPOST.put("name", "James");
        jsonForPOST.put("lastName", "Brown");
        jsonForPOST.put("age", "20");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonForPOST, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);

        System.out.println("KOD " + response.getBody());

// =============================================================================================================

        Map<String, String> jsonForUPDATE = new HashMap<>();
        jsonForUPDATE.put("id", "3");
        jsonForUPDATE.put("name", "Thomas");
        jsonForUPDATE.put("lastName", "Shelby");
        jsonForUPDATE.put("age", "25");

        HttpEntity<Map<String, String>> request2 = new HttpEntity<>(jsonForUPDATE, headers);

        ResponseEntity<String> response2 = restTemplate.exchange(url, HttpMethod.PUT, request2, String.class);

        System.out.println("KOD " + response2.getBody());

// =============================================================================================================

        HttpEntity<String> request3 = new HttpEntity<>(headers);

        System.out.println("KOD " + restTemplate.exchange(url + "/3", HttpMethod.DELETE, request3, String.class).getBody());


    }


}
