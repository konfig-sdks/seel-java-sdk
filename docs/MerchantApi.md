# MerchantApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMerchant**](MerchantApi.md#createNewMerchant) | **POST** /{partner}/merchants | Create a merchant |
| [**getMerchantDetails**](MerchantApi.md#getMerchantDetails) | **GET** /{partner}/merchants/{merchant_id} | Get a merchant |
| [**listAllMerchants**](MerchantApi.md#listAllMerchants) | **GET** /{partner}/merchants | List merchants |
| [**updateMerchantDetails**](MerchantApi.md#updateMerchantDetails) | **POST** /{partner}/merchants/{merchant_id} | Update a merchant |


<a name="createNewMerchant"></a>
# **createNewMerchant**
> Merchant createNewMerchant(xSeelAPIKey, xSeelAPIVersion, partner, merchantCreateNewMerchantRequest).execute();

Create a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String shopId = "shopId_example"; // The identifier for the shop or store within the partner's platform.
    String adminDomain = "adminDomain_example"; // The original subdomain domain for the shop provided by the ecommerce platform, e.g. subdomain.myshopify.com
    String shopDomain = "shopDomain_example"; // The custom domain name assigned to the shop, e.g. www.myshop.com.
    String shopPlatform = "shopPlatform_example"; // The source ecommerce platform for the shop, e.g. Shopify, BigCommerce.
    String shopCurrency = "shopCurrency_example"; // 3-letter ISO 4217 currency code for the primary currency used in the shop, e.g. USD, EUR.
    String shopName = "shopName_example"; // The registered business name for the shop.
    String contactName = "contactName_example"; // The registered business name for the merchant.
    String contactEmail = "contactEmail_example"; // The contact email address on file for the merchant.
    List<MerchantCreateNewMerchantRequestSeelServicesInner> seelServices = Arrays.asList();
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String contactPhoneNumber = "contactPhoneNumber_example"; // The phone number on file for the merchant.
    try {
      Merchant result = client
              .merchant
              .createNewMerchant(shopId, adminDomain, shopDomain, shopPlatform, shopCurrency, shopName, contactName, contactEmail, seelServices, xSeelAPIKey, xSeelAPIVersion, partner)
              .contactPhoneNumber(contactPhoneNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getShopId());
      System.out.println(result.getAdminDomain());
      System.out.println(result.getShopDomain());
      System.out.println(result.getShopPlatform());
      System.out.println(result.getShopCurrency());
      System.out.println(result.getShopName());
      System.out.println(result.getContactName());
      System.out.println(result.getContactEmail());
      System.out.println(result.getContactPhoneNumber());
      System.out.println(result.getSeelServices());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#createNewMerchant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Merchant> response = client
              .merchant
              .createNewMerchant(shopId, adminDomain, shopDomain, shopPlatform, shopCurrency, shopName, contactName, contactEmail, seelServices, xSeelAPIKey, xSeelAPIVersion, partner)
              .contactPhoneNumber(contactPhoneNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#createNewMerchant");
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
| **merchantCreateNewMerchantRequest** | [**MerchantCreateNewMerchantRequest**](MerchantCreateNewMerchantRequest.md)|  | |

### Return type

[**Merchant**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getMerchantDetails"></a>
# **getMerchantDetails**
> Merchant getMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String merchantId = "merchantId_example"; // ID of the merchant
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Merchant result = client
              .merchant
              .getMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getShopId());
      System.out.println(result.getAdminDomain());
      System.out.println(result.getShopDomain());
      System.out.println(result.getShopPlatform());
      System.out.println(result.getShopCurrency());
      System.out.println(result.getShopName());
      System.out.println(result.getContactName());
      System.out.println(result.getContactEmail());
      System.out.println(result.getContactPhoneNumber());
      System.out.println(result.getSeelServices());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Merchant> response = client
              .merchant
              .getMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantDetails");
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
| **merchantId** | **String**| ID of the merchant | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Merchant**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAllMerchants"></a>
# **listAllMerchants**
> MerchantListAllMerchantsResponse listAllMerchants(xSeelAPIKey, xSeelAPIVersion, partner).page(page).pageSize(pageSize).execute();

List merchants

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantApi;
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
    Integer page = 0; // Query by page, default 0
    Integer pageSize = 100; // Query by page_size, default 100
    try {
      MerchantListAllMerchantsResponse result = client
              .merchant
              .listAllMerchants(xSeelAPIKey, xSeelAPIVersion, partner)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPage());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotal());
      System.out.println(result.getMerchants());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#listAllMerchants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantListAllMerchantsResponse> response = client
              .merchant
              .listAllMerchants(xSeelAPIKey, xSeelAPIVersion, partner)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#listAllMerchants");
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
| **page** | **Integer**| Query by page, default 0 | [optional] [default to 0] |
| **pageSize** | **Integer**| Query by page_size, default 100 | [optional] [default to 100] |

### Return type

[**MerchantListAllMerchantsResponse**](MerchantListAllMerchantsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateMerchantDetails"></a>
# **updateMerchantDetails**
> Merchant updateMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner, merchantUpdateMerchantDetailsRequest).execute();

Update a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String merchantId = "merchantId_example"; // ID of the merchant
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    String shopId = "shopId_example"; // The identifier for the shop or store within the partner's platform.
    String adminDomain = "adminDomain_example"; // The original subdomain domain for the shop provided by the ecommerce platform, e.g. subdomain.myshopify.com
    String shopDomain = "shopDomain_example"; // The custom domain name assigned to the shop, e.g. www.myshop.com.
    String shopPlatform = "shopPlatform_example"; // The source ecommerce platform for the shop, e.g. Shopify, BigCommerce.
    String shopCurrency = "shopCurrency_example"; // 3-letter ISO 4217 currency code for the primary currency used in the shop, e.g. USD, EUR.
    String shopName = "shopName_example"; // The registered business name for the shop.
    String contactName = "contactName_example"; // The registered business name for the merchant.
    String contactEmail = "contactEmail_example"; // The contact email address on file for the merchant.
    String contactPhoneNumber = "contactPhoneNumber_example"; // The phone number on file for the merchant.
    List<MerchantUpdateMerchantDetailsRequestSeelServicesInner> seelServices = Arrays.asList();
    try {
      Merchant result = client
              .merchant
              .updateMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner)
              .shopId(shopId)
              .adminDomain(adminDomain)
              .shopDomain(shopDomain)
              .shopPlatform(shopPlatform)
              .shopCurrency(shopCurrency)
              .shopName(shopName)
              .contactName(contactName)
              .contactEmail(contactEmail)
              .contactPhoneNumber(contactPhoneNumber)
              .seelServices(seelServices)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getShopId());
      System.out.println(result.getAdminDomain());
      System.out.println(result.getShopDomain());
      System.out.println(result.getShopPlatform());
      System.out.println(result.getShopCurrency());
      System.out.println(result.getShopName());
      System.out.println(result.getContactName());
      System.out.println(result.getContactEmail());
      System.out.println(result.getContactPhoneNumber());
      System.out.println(result.getSeelServices());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#updateMerchantDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Merchant> response = client
              .merchant
              .updateMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner)
              .shopId(shopId)
              .adminDomain(adminDomain)
              .shopDomain(shopDomain)
              .shopPlatform(shopPlatform)
              .shopCurrency(shopCurrency)
              .shopName(shopName)
              .contactName(contactName)
              .contactEmail(contactEmail)
              .contactPhoneNumber(contactPhoneNumber)
              .seelServices(seelServices)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#updateMerchantDetails");
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
| **merchantId** | **String**| ID of the merchant | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |
| **merchantUpdateMerchantDetailsRequest** | [**MerchantUpdateMerchantDetailsRequest**](MerchantUpdateMerchantDetailsRequest.md)|  | |

### Return type

[**Merchant**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

