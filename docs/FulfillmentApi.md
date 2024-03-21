# FulfillmentApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelFulfillment**](FulfillmentApi.md#cancelFulfillment) | **POST** /{partner}/orders/{order_id}/fulfillments/{fulfillment_id}/cancel | Cancel a fulfillment |
| [**createNewFulfillment**](FulfillmentApi.md#createNewFulfillment) | **POST** /{partner}/orders/{order_id}/fulfillments | Create a fulfillment |
| [**getDetails**](FulfillmentApi.md#getDetails) | **GET** /{partner}/orders/{order_id}/fulfillments/{fulfillment_id} | Get a fulfillment |
| [**listFulfillments**](FulfillmentApi.md#listFulfillments) | **GET** /{partner}/orders/{order_id}/fulfillments | List fulfillments |
| [**updateFulfillmentDetails**](FulfillmentApi.md#updateFulfillmentDetails) | **POST** /{partner}/orders/{order_id}/fulfillments/{fulfillment_id} | Update a fulfillment |


<a name="cancelFulfillment"></a>
# **cancelFulfillment**
> Fulfillment cancelFulfillment(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Cancel a fulfillment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FulfillmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String orderId = "orderId_example"; // ID of the order
    String fulfillmentId = "fulfillmentId_example"; // ID of the fulfillment
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Fulfillment result = client
              .fulfillment
              .cancelFulfillment(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getFulfillmentId());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getLineItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#cancelFulfillment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Fulfillment> response = client
              .fulfillment
              .cancelFulfillment(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#cancelFulfillment");
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
| **orderId** | **String**| ID of the order | |
| **fulfillmentId** | **String**| ID of the fulfillment | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Fulfillment**](Fulfillment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createNewFulfillment"></a>
# **createNewFulfillment**
> Fulfillment createNewFulfillment(orderId, xSeelAPIKey, xSeelAPIVersion, partner, fulfillment).execute();

Create a fulfillment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FulfillmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String fulfillmentId = "fulfillmentId_example"; // Fulfillment ID
    OffsetDateTime createdTs = OffsetDateTime.now(); // Fulfillment created timestamp in milliseconds
    OffsetDateTime updatedTs = OffsetDateTime.now(); // Fulfillment updated timestamp in milliseconds
    String trackingNumber = "trackingNumber_example"; // The tracking number of the fulfillment
    String carrier = "carrier_example"; // The shipping carrier of the fulfillment
    String shipmentStatus = "shipped"; // The shipping status of the fulfillment
    List<FulfillmentLineItemsInner> lineItems = Arrays.asList(); // The list of items included in the fulfillment.
    String orderId = "orderId_example"; // ID of the order
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String trackingUrl = "trackingUrl_example"; // The tracking url of the fulfillment
    try {
      Fulfillment result = client
              .fulfillment
              .createNewFulfillment(fulfillmentId, createdTs, updatedTs, trackingNumber, carrier, shipmentStatus, lineItems, orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .trackingUrl(trackingUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getFulfillmentId());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getLineItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#createNewFulfillment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Fulfillment> response = client
              .fulfillment
              .createNewFulfillment(fulfillmentId, createdTs, updatedTs, trackingNumber, carrier, shipmentStatus, lineItems, orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .trackingUrl(trackingUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#createNewFulfillment");
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
| **orderId** | **String**| ID of the order | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |
| **fulfillment** | [**Fulfillment**](Fulfillment.md)|  | |

### Return type

[**Fulfillment**](Fulfillment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDetails"></a>
# **getDetails**
> Fulfillment getDetails(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get a fulfillment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FulfillmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String orderId = "orderId_example"; // ID of the order
    String fulfillmentId = "fulfillmentId_example"; // ID of the fulfillment
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Fulfillment result = client
              .fulfillment
              .getDetails(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getFulfillmentId());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getLineItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Fulfillment> response = client
              .fulfillment
              .getDetails(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#getDetails");
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
| **orderId** | **String**| ID of the order | |
| **fulfillmentId** | **String**| ID of the fulfillment | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Fulfillment**](Fulfillment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listFulfillments"></a>
# **listFulfillments**
> FulfillmentListFulfillmentsResponse listFulfillments(orderId, xSeelAPIKey, xSeelAPIVersion, partner).page(page).pageSize(pageSize).execute();

List fulfillments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FulfillmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String orderId = "orderId_example"; // ID of the order
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    Integer page = 0; // Query by page, default 0
    Integer pageSize = 100; // Query by page_size, default 100
    try {
      FulfillmentListFulfillmentsResponse result = client
              .fulfillment
              .listFulfillments(orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotal());
      System.out.println(result.getFulfillments());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#listFulfillments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FulfillmentListFulfillmentsResponse> response = client
              .fulfillment
              .listFulfillments(orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#listFulfillments");
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
| **orderId** | **String**| ID of the order | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |
| **page** | **Integer**| Query by page, default 0 | [optional] [default to 0] |
| **pageSize** | **Integer**| Query by page_size, default 100 | [optional] [default to 100] |

### Return type

[**FulfillmentListFulfillmentsResponse**](FulfillmentListFulfillmentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFulfillmentDetails"></a>
# **updateFulfillmentDetails**
> Fulfillment updateFulfillmentDetails(orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner, fulfillmentUpdateFulfillmentDetailsRequest).execute();

Update a fulfillment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FulfillmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    OffsetDateTime updatedTs = OffsetDateTime.now(); // Fulfillment updated timestamp in milliseconds
    String trackingNumber = "trackingNumber_example"; // The tracking number of the fulfillment
    String carrier = "carrier_example"; // The shipping carrier of the fulfillment
    String shipmentStatus = "shipped"; // The shipping status of the fulfillment
    List<FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner> lineItems = Arrays.asList(); // The list of items included in the fulfillment.
    String orderId = "orderId_example"; // ID of the order
    String fulfillmentId = "fulfillmentId_example"; // ID of the fulfillment
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String trackingUrl = "trackingUrl_example"; // The tracking url of the fulfillment
    try {
      Fulfillment result = client
              .fulfillment
              .updateFulfillmentDetails(updatedTs, trackingNumber, carrier, shipmentStatus, lineItems, orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner)
              .trackingUrl(trackingUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getFulfillmentId());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getLineItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#updateFulfillmentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Fulfillment> response = client
              .fulfillment
              .updateFulfillmentDetails(updatedTs, trackingNumber, carrier, shipmentStatus, lineItems, orderId, fulfillmentId, xSeelAPIKey, xSeelAPIVersion, partner)
              .trackingUrl(trackingUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FulfillmentApi#updateFulfillmentDetails");
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
| **orderId** | **String**| ID of the order | |
| **fulfillmentId** | **String**| ID of the fulfillment | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |
| **fulfillmentUpdateFulfillmentDetailsRequest** | [**FulfillmentUpdateFulfillmentDetailsRequest**](FulfillmentUpdateFulfillmentDetailsRequest.md)|  | |

### Return type

[**Fulfillment**](Fulfillment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

