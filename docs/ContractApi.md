# ContractApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](ContractApi.md#getById) | **GET** /{partner}/contracts/{contract_id} | Get a contract |
| [**listContracts**](ContractApi.md#listContracts) | **GET** /{partner}/contracts | List contracts |


<a name="getById"></a>
# **getById**
> Contract getById(contractId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get a contract

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String contractId = "contractId_example"; // ID of the contract
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Contract result = client
              .contract
              .getById(contractId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getContractId());
      System.out.println(result.getOrderId());
      System.out.println(result.getQuoteId());
      System.out.println(result.getCustomer());
      System.out.println(result.getPremium());
      System.out.println(result.getPremiumTax());
      System.out.println(result.getCurrency());
      System.out.println(result.getStatus());
      System.out.println(result.getCancelledTs());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getCoveredItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contract> response = client
              .contract
              .getById(contractId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractApi#getById");
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
| **contractId** | **String**| ID of the contract | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Contract**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listContracts"></a>
# **listContracts**
> ContractListContractsResponse listContracts(xSeelAPIKey, xSeelAPIVersion, partner).orderId(orderId).page(page).pageSize(pageSize).execute();

List contracts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractApi;
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
      ContractListContractsResponse result = client
              .contract
              .listContracts(xSeelAPIKey, xSeelAPIVersion, partner)
              .orderId(orderId)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotal());
      System.out.println(result.getContracts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractApi#listContracts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractListContractsResponse> response = client
              .contract
              .listContracts(xSeelAPIKey, xSeelAPIVersion, partner)
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
      System.err.println("Exception when calling ContractApi#listContracts");
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

[**ContractListContractsResponse**](ContractListContractsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

