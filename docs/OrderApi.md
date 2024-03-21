# OrderApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchCreateOrders**](OrderApi.md#batchCreateOrders) | **POST** /{partner}/orders/batch | Batch create orders |
| [**cancelOrderById**](OrderApi.md#cancelOrderById) | **POST** /{partner}/orders/{order_id}/cancel | Cancel an order |
| [**createNewOrder**](OrderApi.md#createNewOrder) | **POST** /{partner}/orders | Create an order |
| [**getById**](OrderApi.md#getById) | **GET** /{partner}/orders/{order_id} | Get an order |
| [**updateOrderDetails**](OrderApi.md#updateOrderDetails) | **POST** /{partner}/orders/{order_id} | Update an order |


<a name="batchCreateOrders"></a>
# **batchCreateOrders**
> OrderBatchCreateOrdersResponse batchCreateOrders(xSeelAPIKey, xSeelAPIVersion, partner, orderBatchCreateOrdersRequest).execute();

Batch create orders

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
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
    List<Order> orders = Arrays.asList(); // The list of orders.
    try {
      OrderBatchCreateOrdersResponse result = client
              .order
              .batchCreateOrders(xSeelAPIKey, xSeelAPIVersion, partner)
              .orders(orders)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrders());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#batchCreateOrders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrderBatchCreateOrdersResponse> response = client
              .order
              .batchCreateOrders(xSeelAPIKey, xSeelAPIVersion, partner)
              .orders(orders)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#batchCreateOrders");
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
| **orderBatchCreateOrdersRequest** | [**OrderBatchCreateOrdersRequest**](OrderBatchCreateOrdersRequest.md)|  | |

### Return type

[**OrderBatchCreateOrdersResponse**](OrderBatchCreateOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="cancelOrderById"></a>
# **cancelOrderById**
> Order cancelOrderById(orderId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Cancel an order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
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
    try {
      Order result = client
              .order
              .cancelOrderById(orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrderId());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getCartId());
      System.out.println(result.getMerchantId());
      System.out.println(result.getSessionId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getClientIp());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getCancelledTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getLineItems());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getFulfillments());
      System.out.println(result.getSeelServices());
      System.out.println(result.getRefunds());
      System.out.println(result.getCustomer());
      System.out.println(result.getExtraInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#cancelOrderById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .cancelOrderById(orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#cancelOrderById");
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

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createNewOrder"></a>
# **createNewOrder**
> Order createNewOrder(xSeelAPIKey, xSeelAPIVersion, partner, orderCreateNewOrderRequest).execute();

Create an order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String orderId = "orderId_example"; // The unique identifier for the order in the system.
    String orderNumber = "orderNumber_example"; // The reference number that is visible to the merchant and shopper. Use the order ID value if there is no separate order number.
    String sessionId = "sessionId_example"; // Shopping session ID of the order
    String createdTs = "createdTs_example"; // Order created timestamp in milliseconds
    List<Item> lineItems = Arrays.asList(); // The list of items included in the order.
    Address shippingAddress = new Address();
    Customer customer = new Customer();
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String cartId = "cartId_example"; // Cart ID of the order
    String merchantId = "merchantId_example"; // Merchant ID of the order
    String deviceId = "deviceId_example"; // The ID of the client device.
    String clientIp = "clientIp_example"; // The IP address of the client.
    List<OrderCreateNewOrderRequestSeelServicesInner> seelServices = Arrays.asList(); // The list of Seel services of the order.
    Object extraInfo = null; // Additional information for the order
    try {
      Order result = client
              .order
              .createNewOrder(orderId, orderNumber, sessionId, createdTs, lineItems, shippingAddress, customer, xSeelAPIKey, xSeelAPIVersion, partner)
              .cartId(cartId)
              .merchantId(merchantId)
              .deviceId(deviceId)
              .clientIp(clientIp)
              .seelServices(seelServices)
              .extraInfo(extraInfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrderId());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getCartId());
      System.out.println(result.getMerchantId());
      System.out.println(result.getSessionId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getClientIp());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getCancelledTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getLineItems());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getFulfillments());
      System.out.println(result.getSeelServices());
      System.out.println(result.getRefunds());
      System.out.println(result.getCustomer());
      System.out.println(result.getExtraInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createNewOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .createNewOrder(orderId, orderNumber, sessionId, createdTs, lineItems, shippingAddress, customer, xSeelAPIKey, xSeelAPIVersion, partner)
              .cartId(cartId)
              .merchantId(merchantId)
              .deviceId(deviceId)
              .clientIp(clientIp)
              .seelServices(seelServices)
              .extraInfo(extraInfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createNewOrder");
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
| **orderCreateNewOrderRequest** | [**OrderCreateNewOrderRequest**](OrderCreateNewOrderRequest.md)|  | |

### Return type

[**Order**](Order.md)

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
> Order getById(orderId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get an order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
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
    try {
      Order result = client
              .order
              .getById(orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrderId());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getCartId());
      System.out.println(result.getMerchantId());
      System.out.println(result.getSessionId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getClientIp());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getCancelledTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getLineItems());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getFulfillments());
      System.out.println(result.getSeelServices());
      System.out.println(result.getRefunds());
      System.out.println(result.getCustomer());
      System.out.println(result.getExtraInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .getById(orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getById");
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

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an order |  -  |

<a name="updateOrderDetails"></a>
# **updateOrderDetails**
> Order updateOrderDetails(orderId, xSeelAPIKey, xSeelAPIVersion, partner, orderUpdateOrderDetailsRequest).execute();

Update an order

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String updatedTs = "updatedTs_example"; // Order updated timestamp in milliseconds
    String orderId = "orderId_example"; // ID of the order
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    List<Item> lineItems = Arrays.asList(); // The list of items included in the order.
    Address shippingAddress = new Address();
    Customer customer = new Customer();
    Object extraInfo = null; // Additional information for the order
    try {
      Order result = client
              .order
              .updateOrderDetails(updatedTs, orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .lineItems(lineItems)
              .shippingAddress(shippingAddress)
              .customer(customer)
              .extraInfo(extraInfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrderId());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getCartId());
      System.out.println(result.getMerchantId());
      System.out.println(result.getSessionId());
      System.out.println(result.getDeviceId());
      System.out.println(result.getClientIp());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getCancelledTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getLineItems());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getFulfillments());
      System.out.println(result.getSeelServices());
      System.out.println(result.getRefunds());
      System.out.println(result.getCustomer());
      System.out.println(result.getExtraInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .updateOrderDetails(updatedTs, orderId, xSeelAPIKey, xSeelAPIVersion, partner)
              .lineItems(lineItems)
              .shippingAddress(shippingAddress)
              .customer(customer)
              .extraInfo(extraInfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrderDetails");
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
| **orderUpdateOrderDetailsRequest** | [**OrderUpdateOrderDetailsRequest**](OrderUpdateOrderDetailsRequest.md)|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

