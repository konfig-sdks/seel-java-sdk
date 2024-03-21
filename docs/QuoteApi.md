# QuoteApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateQuote**](QuoteApi.md#generateQuote) | **POST** /{partner}/quotes | Create a quote |
| [**getById**](QuoteApi.md#getById) | **GET** /{partner}/quotes/{quote_id} | Get a quote |


<a name="generateQuote"></a>
# **generateQuote**
> Quote generateQuote(partner, xSeelAPIKey, xSeelAPIVersion, quoteGenerateQuoteRequest).execute();

Create a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuoteApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String sessionId = "sessionId_example"; // The ID of the shopping session.
    String type = "type_example"; // The type of the quote.
    List<Item> lineItems = Arrays.asList(); // The list of items included in the quote.
    Address shippingAddress = new Address();
    Customer customer = new Customer();
    String partner = "seel"; // partner name
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String cartId = "cartId_example"; // The ID of a cart.
    String merchantId = "merchantId_example"; // The unique identifier for the merchant within Seel's system.
    String deviceId = "deviceId_example"; // The ID of the client device.
    String clientIp = "clientIp_example"; // The IP address of the client.
    Object extraInfo = null; // Additional information for the quote
    try {
      Quote result = client
              .quote
              .generateQuote(sessionId, type, lineItems, shippingAddress, customer, partner, xSeelAPIKey, xSeelAPIVersion)
              .cartId(cartId)
              .merchantId(merchantId)
              .deviceId(deviceId)
              .clientIp(clientIp)
              .extraInfo(extraInfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getQuoteId());
      System.out.println(result.getCartId());
      System.out.println(result.getMerchantId());
      System.out.println(result.getSessionId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getClientIp());
      System.out.println(result.getType());
      System.out.println(result.getPrice());
      System.out.println(result.getCurrency());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getLineItems());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getCustomer());
      System.out.println(result.getExtraInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#generateQuote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Quote> response = client
              .quote
              .generateQuote(sessionId, type, lineItems, shippingAddress, customer, partner, xSeelAPIKey, xSeelAPIVersion)
              .cartId(cartId)
              .merchantId(merchantId)
              .deviceId(deviceId)
              .clientIp(clientIp)
              .extraInfo(extraInfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#generateQuote");
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
| **partner** | **String**| partner name | [default to seel] |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **quoteGenerateQuoteRequest** | [**QuoteGenerateQuoteRequest**](QuoteGenerateQuoteRequest.md)|  | |

### Return type

[**Quote**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> Quote getById(quoteId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuoteApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String quoteId = "2023051501242226386401725266"; // ID of the quote
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Quote result = client
              .quote
              .getById(quoteId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getQuoteId());
      System.out.println(result.getCartId());
      System.out.println(result.getMerchantId());
      System.out.println(result.getSessionId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getClientIp());
      System.out.println(result.getType());
      System.out.println(result.getPrice());
      System.out.println(result.getCurrency());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getLineItems());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getCustomer());
      System.out.println(result.getExtraInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Quote> response = client
              .quote
              .getById(quoteId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getById");
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
| **quoteId** | **String**| ID of the quote | [default to 2023051501242226386401725266] |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Quote**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

