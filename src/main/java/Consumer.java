import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {

        String sessionId = "Получите сессию запустив первый код и сессию вставьте вместо этого";

// =============================================================================================================

//        RestTemplate restTemplate = new RestTemplate();
//
//        String url = "http://94.198.50.185:7081/api/users";
//
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
//
//        System.out.println(responseEntity);

//  ======================================================================================================================

//        RestTemplate restTemplate2 = new RestTemplate();
//
//        Map<String, String> jsonForPOST = new HashMap<>();
//        jsonForPOST.put("id", "3");
//        jsonForPOST.put("name", "James");
//        jsonForPOST.put("lastName", "Brown");
//        jsonForPOST.put("age", "20");
//
//        HttpEntity<Map<String, String>> request2 = new HttpEntity<>(jsonForPOST);
//
//        String url2 = "http://94.198.50.185:7081/api/users";
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Cookie", sessionId);
//
//        System.out.println(restTemplate2.postForObject(url2, request2, String.class, jsonForPOST, headers));

//         Первый пароль 5ebfeb

// =======================================================================================================================
//
//        RestTemplate restTemplate3 = new RestTemplate();
//        String url3 = "http://94.198.50.185:7081/api/users";
//
//        HttpHeaders headers3 = new HttpHeaders();
//        headers3.setContentType(MediaType.APPLICATION_JSON);
//        headers3.add("Cookie", sessionId);
//
//        Map<String, String> jsonForUPDATE = new HashMap<>();
//        jsonForUPDATE.put("id", "3");
//        jsonForUPDATE.put("name", "Thomas");
//        jsonForUPDATE.put("lastName", "Shelby");
//        jsonForUPDATE.put("age", "20");
//
//        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonForUPDATE, headers3);
//
//        String response3 = restTemplate3.postForObject(url3, request, String.class);
//
//        System.out.println(response3);

        // Второй пароль cea2a2



// ===============================================================================================================================

//        RestTemplate restTemplate4 = new RestTemplate();
//        String url4 = "http://94.198.50.185:7081/api/users/2";
//
//        HttpHeaders headers4 = new HttpHeaders();
//        headers4.setContentType(MediaType.APPLICATION_JSON);
//        headers4.set("Cookie", sessionId);
//
//        HttpEntity<User> request4 = new HttpEntity<>(headers4);
//
//        ResponseEntity<String> response4 = restTemplate4.exchange(url4, HttpMethod.DELETE, request4, String.class);
//
//        System.out.println(response4.getBody());
//      Третий код bbd25d




        // КОД ЦЕЛИКОМ, раскомментируйте после получения сессии
//        System.out.println(restTemplate2.postForObject(url2, request2, String.class, jsonForPOST, headers) + response3
//        + response4.getBody());

        // Должен показать 3 кода по отдельности + снизу конкатенированную версию
        // 5ebfebcea2a2bbd25d



































    }
}
