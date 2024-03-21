# ProductApi

All URIs are relative to *https://api-test.seel.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewProduct**](ProductApi.md#addNewProduct) | **POST** /{partner}/products | Create a product |
| [**batchCreateProducts**](ProductApi.md#batchCreateProducts) | **POST** /{partner}/products/batch | Batch create products |
| [**getProductById**](ProductApi.md#getProductById) | **GET** /{partner}/products/{product_id} | Get a product |
| [**listPlans**](ProductApi.md#listPlans) | **GET** /{partner}/products/{product_id}/plans | Get product plans |
| [**removeProductById**](ProductApi.md#removeProductById) | **DELETE** /{partner}/products/{product_id} | Delete a product |
| [**updateProductDetails**](ProductApi.md#updateProductDetails) | **POST** /{partner}/products/{product_id} | Update a product |


<a name="addNewProduct"></a>
# **addNewProduct**
> Product addNewProduct(partner, xSeelAPIKey, xSeelAPIVersion, productAddNewProductRequest).execute();

Create a product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String productId = "productId_example"; // Product id.
    String productTitle = "productTitle_example"; // Name of the product.
    String brandName = "brandName_example"; // The Product Brand or Vendor.
    Double price = 3.4D; // List price of the product.
    String currency = "currency_example"; // Currency of the price (e.g. USD, EUR).
    String partner = "seel"; // partner name
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String merchantId = "merchantId_example"; // The unique identifier for the merchant within Seel's system.
    String variantId = "variantId_example"; // Variant id, the unique identifier of a product SKU. Use 'product_id' if the product doesn't have any variants.
    String variantTitle = "variantTitle_example"; // Title of the variant.
    String manufacturer = "manufacturer_example"; // Manufacturer of the item.
    String category1 = "category1_example"; // Main product category.
    String category2 = "category2_example"; // Secondary product category.
    String category3 = "category3_example"; // Tertiary product category.
    String category4 = "category4_example"; // Fourth level product category.
    String productDescription = "productDescription_example"; // Text description of the product.
    URI imageUrl = new URI(); // URL of the product image.
    Boolean requiresShipping = true; // Whether the product requires shipping.
    String modelNumber = "modelNumber_example"; // Manufacturer model number.
    String condition = "condition_example"; // Condition - new, used, refurbished.
    String sku = "sku_example"; // Stock keeping unit.
    ProductAddNewProductRequestIdentifiers identifiers = new ProductAddNewProductRequestIdentifiers();
    ProductAddNewProductRequestManufacturerWarranty manufacturerWarranty = new ProductAddNewProductRequestManufacturerWarranty();
    ProductAddNewProductRequestDimensions dimensions = new ProductAddNewProductRequestDimensions();
    ProductAddNewProductRequestWeight weight = new ProductAddNewProductRequestWeight();
    ProductAddNewProductRequestProductAttributes productAttributes = new ProductAddNewProductRequestProductAttributes();
    OffsetDateTime createdTs = OffsetDateTime.now(); // Timestamp when the product was created.
    OffsetDateTime updatedTs = OffsetDateTime.now(); // Timestamp when the product was updated.
    try {
      Product result = client
              .product
              .addNewProduct(productId, productTitle, brandName, price, currency, partner, xSeelAPIKey, xSeelAPIVersion)
              .merchantId(merchantId)
              .variantId(variantId)
              .variantTitle(variantTitle)
              .manufacturer(manufacturer)
              .category1(category1)
              .category2(category2)
              .category3(category3)
              .category4(category4)
              .productDescription(productDescription)
              .imageUrl(imageUrl)
              .requiresShipping(requiresShipping)
              .modelNumber(modelNumber)
              .condition(condition)
              .sku(sku)
              .identifiers(identifiers)
              .manufacturerWarranty(manufacturerWarranty)
              .dimensions(dimensions)
              .weight(weight)
              .productAttributes(productAttributes)
              .createdTs(createdTs)
              .updatedTs(updatedTs)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getVariantId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getVariantTitle());
      System.out.println(result.getBrandName());
      System.out.println(result.getManufacturer());
      System.out.println(result.getCategory1());
      System.out.println(result.getCategory2());
      System.out.println(result.getCategory3());
      System.out.println(result.getCategory4());
      System.out.println(result.getProductDescription());
      System.out.println(result.getImageUrl());
      System.out.println(result.getPrice());
      System.out.println(result.getCurrency());
      System.out.println(result.getRequiresShipping());
      System.out.println(result.getModelNumber());
      System.out.println(result.getCondition());
      System.out.println(result.getSku());
      System.out.println(result.getIdentifiers());
      System.out.println(result.getManufacturerWarranty());
      System.out.println(result.getDimensions());
      System.out.println(result.getWeight());
      System.out.println(result.getProductAttributes());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getEnabledServices());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addNewProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Product> response = client
              .product
              .addNewProduct(productId, productTitle, brandName, price, currency, partner, xSeelAPIKey, xSeelAPIVersion)
              .merchantId(merchantId)
              .variantId(variantId)
              .variantTitle(variantTitle)
              .manufacturer(manufacturer)
              .category1(category1)
              .category2(category2)
              .category3(category3)
              .category4(category4)
              .productDescription(productDescription)
              .imageUrl(imageUrl)
              .requiresShipping(requiresShipping)
              .modelNumber(modelNumber)
              .condition(condition)
              .sku(sku)
              .identifiers(identifiers)
              .manufacturerWarranty(manufacturerWarranty)
              .dimensions(dimensions)
              .weight(weight)
              .productAttributes(productAttributes)
              .createdTs(createdTs)
              .updatedTs(updatedTs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#addNewProduct");
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
| **productAddNewProductRequest** | [**ProductAddNewProductRequest**](ProductAddNewProductRequest.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="batchCreateProducts"></a>
# **batchCreateProducts**
> ProductBatchCreateProductsResponse batchCreateProducts(xSeelAPIKey, xSeelAPIVersion, partner, productBatchCreateProductsRequest).execute();

Batch create products

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
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
    List<Product> products = Arrays.asList(); // The list of products.
    try {
      ProductBatchCreateProductsResponse result = client
              .product
              .batchCreateProducts(xSeelAPIKey, xSeelAPIVersion, partner)
              .products(products)
              .execute();
      System.out.println(result);
      System.out.println(result.getProducts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#batchCreateProducts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductBatchCreateProductsResponse> response = client
              .product
              .batchCreateProducts(xSeelAPIKey, xSeelAPIVersion, partner)
              .products(products)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#batchCreateProducts");
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
| **productBatchCreateProductsRequest** | [**ProductBatchCreateProductsRequest**](ProductBatchCreateProductsRequest.md)|  | |

### Return type

[**ProductBatchCreateProductsResponse**](ProductBatchCreateProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductById"></a>
# **getProductById**
> Product getProductById(productId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get a product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String productId = "2023051501242226386401725266"; // ID of the product
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Product result = client
              .product
              .getProductById(productId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getVariantId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getVariantTitle());
      System.out.println(result.getBrandName());
      System.out.println(result.getManufacturer());
      System.out.println(result.getCategory1());
      System.out.println(result.getCategory2());
      System.out.println(result.getCategory3());
      System.out.println(result.getCategory4());
      System.out.println(result.getProductDescription());
      System.out.println(result.getImageUrl());
      System.out.println(result.getPrice());
      System.out.println(result.getCurrency());
      System.out.println(result.getRequiresShipping());
      System.out.println(result.getModelNumber());
      System.out.println(result.getCondition());
      System.out.println(result.getSku());
      System.out.println(result.getIdentifiers());
      System.out.println(result.getManufacturerWarranty());
      System.out.println(result.getDimensions());
      System.out.println(result.getWeight());
      System.out.println(result.getProductAttributes());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getEnabledServices());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Product> response = client
              .product
              .getProductById(productId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductById");
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
| **productId** | **String**| ID of the product | [default to 2023051501242226386401725266] |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listPlans"></a>
# **listPlans**
> List&lt;ProductPlan&gt; listPlans(productId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Get product plans

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String productId = "2023051501242226386401725266"; // ID of the product
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      List<ProductPlan> result = client
              .product
              .listPlans(productId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listPlans");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProductPlan>> response = client
              .product
              .listPlans(productId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#listPlans");
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
| **productId** | **String**| ID of the product | [default to 2023051501242226386401725266] |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**List&lt;ProductPlan&gt;**](ProductPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeProductById"></a>
# **removeProductById**
> Product removeProductById(productId, xSeelAPIKey, xSeelAPIVersion, partner).execute();

Delete a product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String productId = "productId_example"; // ID of the product
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String partner = "seel"; // partner name
    try {
      Product result = client
              .product
              .removeProductById(productId, xSeelAPIKey, xSeelAPIVersion, partner)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getVariantId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getVariantTitle());
      System.out.println(result.getBrandName());
      System.out.println(result.getManufacturer());
      System.out.println(result.getCategory1());
      System.out.println(result.getCategory2());
      System.out.println(result.getCategory3());
      System.out.println(result.getCategory4());
      System.out.println(result.getProductDescription());
      System.out.println(result.getImageUrl());
      System.out.println(result.getPrice());
      System.out.println(result.getCurrency());
      System.out.println(result.getRequiresShipping());
      System.out.println(result.getModelNumber());
      System.out.println(result.getCondition());
      System.out.println(result.getSku());
      System.out.println(result.getIdentifiers());
      System.out.println(result.getManufacturerWarranty());
      System.out.println(result.getDimensions());
      System.out.println(result.getWeight());
      System.out.println(result.getProductAttributes());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getEnabledServices());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#removeProductById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Product> response = client
              .product
              .removeProductById(productId, xSeelAPIKey, xSeelAPIVersion, partner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#removeProductById");
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
| **productId** | **String**| ID of the product | |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **partner** | **String**| partner name | [default to seel] |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductDetails"></a>
# **updateProductDetails**
> Product updateProductDetails(productId, partner, xSeelAPIKey, xSeelAPIVersion, productUpdateProductDetailsRequest).execute();

Update a product

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Seel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.seel.com/v1";
    Seel client = new Seel(configuration);
    String productId = "productId_example"; // Product id.
    String productTitle = "productTitle_example"; // Name of the product.
    String brandName = "brandName_example"; // The Product Brand or Vendor.
    Double price = 3.4D; // List price of the product.
    String currency = "currency_example"; // Currency of the price (e.g. USD, EUR).
    String productId = "2023051501242226386401725266"; // ID of the product
    String partner = "seel"; // partner name
    String xSeelAPIKey = "e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6"; // Your Seel API key
    String xSeelAPIVersion = "1.3.0"; // Version of the Seel API to use
    String merchantId = "merchantId_example"; // The unique identifier for the merchant within Seel's system.
    String variantId = "variantId_example"; // Variant id, the unique identifier of a product SKU. Use 'product_id' if the product doesn't have any variants.
    String variantTitle = "variantTitle_example"; // Title of the variant.
    String manufacturer = "manufacturer_example"; // Manufacturer of the item.
    String category1 = "category1_example"; // Main product category.
    String category2 = "category2_example"; // Secondary product category.
    String category3 = "category3_example"; // Tertiary product category.
    String category4 = "category4_example"; // Fourth level product category.
    String productDescription = "productDescription_example"; // Text description of the product.
    URI imageUrl = new URI(); // URL of the product image.
    Boolean requiresShipping = true; // Whether the product requires shipping.
    String modelNumber = "modelNumber_example"; // Manufacturer model number.
    String condition = "condition_example"; // Condition - new, used, refurbished.
    String sku = "sku_example"; // Stock keeping unit.
    ProductUpdateProductDetailsRequestIdentifiers identifiers = new ProductUpdateProductDetailsRequestIdentifiers();
    ProductUpdateProductDetailsRequestManufacturerWarranty manufacturerWarranty = new ProductUpdateProductDetailsRequestManufacturerWarranty();
    ProductUpdateProductDetailsRequestDimensions dimensions = new ProductUpdateProductDetailsRequestDimensions();
    ProductUpdateProductDetailsRequestWeight weight = new ProductUpdateProductDetailsRequestWeight();
    ProductUpdateProductDetailsRequestProductAttributes productAttributes = new ProductUpdateProductDetailsRequestProductAttributes();
    OffsetDateTime createdTs = OffsetDateTime.now(); // Timestamp when the product was created.
    OffsetDateTime updatedTs = OffsetDateTime.now(); // Timestamp when the product was updated.
    try {
      Product result = client
              .product
              .updateProductDetails(productId, productTitle, brandName, price, currency, productId, partner, xSeelAPIKey, xSeelAPIVersion)
              .merchantId(merchantId)
              .variantId(variantId)
              .variantTitle(variantTitle)
              .manufacturer(manufacturer)
              .category1(category1)
              .category2(category2)
              .category3(category3)
              .category4(category4)
              .productDescription(productDescription)
              .imageUrl(imageUrl)
              .requiresShipping(requiresShipping)
              .modelNumber(modelNumber)
              .condition(condition)
              .sku(sku)
              .identifiers(identifiers)
              .manufacturerWarranty(manufacturerWarranty)
              .dimensions(dimensions)
              .weight(weight)
              .productAttributes(productAttributes)
              .createdTs(createdTs)
              .updatedTs(updatedTs)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantId());
      System.out.println(result.getVariantId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getVariantTitle());
      System.out.println(result.getBrandName());
      System.out.println(result.getManufacturer());
      System.out.println(result.getCategory1());
      System.out.println(result.getCategory2());
      System.out.println(result.getCategory3());
      System.out.println(result.getCategory4());
      System.out.println(result.getProductDescription());
      System.out.println(result.getImageUrl());
      System.out.println(result.getPrice());
      System.out.println(result.getCurrency());
      System.out.println(result.getRequiresShipping());
      System.out.println(result.getModelNumber());
      System.out.println(result.getCondition());
      System.out.println(result.getSku());
      System.out.println(result.getIdentifiers());
      System.out.println(result.getManufacturerWarranty());
      System.out.println(result.getDimensions());
      System.out.println(result.getWeight());
      System.out.println(result.getProductAttributes());
      System.out.println(result.getCreatedTs());
      System.out.println(result.getUpdatedTs());
      System.out.println(result.getEnabledServices());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProductDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Product> response = client
              .product
              .updateProductDetails(productId, productTitle, brandName, price, currency, productId, partner, xSeelAPIKey, xSeelAPIVersion)
              .merchantId(merchantId)
              .variantId(variantId)
              .variantTitle(variantTitle)
              .manufacturer(manufacturer)
              .category1(category1)
              .category2(category2)
              .category3(category3)
              .category4(category4)
              .productDescription(productDescription)
              .imageUrl(imageUrl)
              .requiresShipping(requiresShipping)
              .modelNumber(modelNumber)
              .condition(condition)
              .sku(sku)
              .identifiers(identifiers)
              .manufacturerWarranty(manufacturerWarranty)
              .dimensions(dimensions)
              .weight(weight)
              .productAttributes(productAttributes)
              .createdTs(createdTs)
              .updatedTs(updatedTs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#updateProductDetails");
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
| **productId** | **String**| ID of the product | [default to 2023051501242226386401725266] |
| **partner** | **String**| partner name | [default to seel] |
| **xSeelAPIKey** | **String**| Your Seel API key | [default to e2b4f9c8d3a7e6d2f5b0c4a1d8e9b6] |
| **xSeelAPIVersion** | **String**| Version of the Seel API to use | [default to 1.3.0] |
| **productUpdateProductDetailsRequest** | [**ProductUpdateProductDetailsRequest**](ProductUpdateProductDetailsRequest.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

