import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://94.198.50.185:7081/api/users";

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        System.out.println(responseEntity);

        String sessionId = String.valueOf(responseEntity.getHeaders().getFirst("Set-Cookie"));

        System.out.println(sessionId);

//  ======================================================================================================================

        HttpHeaders headers = new HttpHeaders();
        headers.set("Set-Cookie", sessionId);

        Map<String, String> jsonForPOST = new HashMap<>();
        jsonForPOST.put("id", "3");
        jsonForPOST.put("name", "James");
        jsonForPOST.put("lastName", "Brown");
        jsonForPOST.put("age", "25");

        HttpEntity<Map<String, String>> request2 = new HttpEntity<>(jsonForPOST, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request2, String.class);

        System.out.println(response.getBody() + "KOD OT SERVAKA");

        System.out.println("======================================");
//         Первый пароль 5ebfeb

// =======================================================================================================================
//
        Map<String, String> jsonForUPDATE = new HashMap<>();
        jsonForUPDATE.put("id", "3");
        jsonForUPDATE.put("name", "Thomas");
        jsonForUPDATE.put("lastName", "Shelby");
        jsonForUPDATE.put("age", "20");

        HttpEntity<Map<String, String>> request3 = new HttpEntity<>(jsonForUPDATE, headers);

        ResponseEntity<String> response2 = restTemplate.exchange(url, HttpMethod.PUT, request3, String.class);

        System.out.println(response2.getBody());

        // Второй пароль cea2a2



// ===============================================================================================================================

//        HttpEntity<String> request4 = new HttpEntity<>(headers);
//
//        ResponseEntity<String> response4 = restTemplate.exchange(url + "/3", HttpMethod.DELETE, request4, String.class);
//
//        System.out.println(response4.getBody());












    }
}
