# ClaimApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllClaims**](ClaimApi.md#getAllClaims) | **GET** /{partner}/claims | List claims |
| [**getById**](ClaimApi.md#getById) | **GET** /{partner}/claims/{claim_id} | Get a claim |


<a name="getAllClaims"></a>
# **getAllClaims**
> ClaimGetAllClaimsResponse getAllClaims(xSeelAPIKey, xSeelAPIVersion, partner).orderId(orderId).page(page).pageSize(pageSize).execute();

List claims

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClaimApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String orderId = "orderId_example"; // Query by order ID
    Integer page = 0; // Query by page, default 0
    Integer pageSize = 100; // Query by page_size, default 100
    try {
      ClaimGetAllClaimsResponse result = client
              .claim
              .getAllClaims(xSeelAPIKey, xSeelAPIVersion, partner)
              .orderId(orderId)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotal());
      System.out.println(result.getClaims());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimApi#getAllClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimGetAllClaimsResponse> response = client
              .claim
              .getAllClaims(xSeelAPIKey, xSeelAPIVersion, partner)
              .orderId(orderId)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimApi#getAllClaims");
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
| **orderId** | **String**| Query by order ID | [optional] |
| **page** | **Integer**| Query by page, default 0 | [optional] [default to 0] |
| **pageSize** | **Integer**| Query by page_size, default 100 | [optional] [default to 100] |

### Return type

[**ClaimGetAllClaimsResponse**](ClaimGetAllClaimsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> Claim getById(claimId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get a claim

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClaimApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String claimId = "claimId_example"; // ID of the claim
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Claim result = client
              .claim
              .getById(claimId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getClaimId());
      System.out.println(result.getOrderId());
      System.out.println(result.getContractId());
      System.out.println(result.getPayoutAmount());
      System.out.println(result.getStatus());
      System.out.println(result.getClaimType());
      System.out.println(result.getRejectReason());
      System.out.println(result.getClaimDetails());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getCreatedTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Claim> response = client
              .claim
              .getById(claimId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimApi#getById");
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
| **claimId** | **String**| ID of the claim | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Claim**](Claim.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

