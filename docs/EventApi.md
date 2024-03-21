# EventApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEvent**](EventApi.md#createNewEvent) | **POST** /{partner}/events | Create events |


<a name="createNewEvent"></a>
# **createNewEvent**
> Event createNewEvent(xSeelAPIKey, xSeelAPIVersion, partner, eventCreateNewEventRequest).execute();

Create events

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String sessionId = "sessionId_example"; // Session ID
    String customerId = "customerId_example"; // Customer ID
    String eventSource = "eventSource_example"; // Event source
    String eventType = "product_page_enter"; // Event type
    Object eventInfo = null; // Each event_type has its own unique schema. For specific details, please refer to the custom pixel guide.
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String eventTs = "eventTs_example"; // Event created timestamp in milliseconds
    String deviceId = "deviceId_example"; // Device ID
    String clientIp = "clientIp_example"; // Browser IP address
    try {
      Event result = client
              .event
              .createNewEvent(sessionId, customerId, eventSource, eventType, eventInfo, xSeelAPIKey, xSeelAPIVersion, partner)
              .eventTs(eventTs)
              .deviceId(deviceId)
              .clientIp(clientIp)
              .execute();
      System.out.println(result);
      System.out.println(result.getEventId());
      System.out.println(result.getSessionId());
      System.out.println(result.getEventTs());
      System.out.println(result.getCustomerId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getBrowserIp());
      System.out.println(result.getEventSource());
      System.out.println(result.getEventType());
      System.out.println(result.getEventInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createNewEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Event> response = client
              .event
              .createNewEvent(sessionId, customerId, eventSource, eventType, eventInfo, xSeelAPIKey, xSeelAPIVersion, partner)
              .eventTs(eventTs)
              .deviceId(deviceId)
              .clientIp(clientIp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createNewEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |
| **eventCreateNewEventRequest** | [**EventCreateNewEventRequest**](EventCreateNewEventRequest.md)|  | |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

