<div align="center">

[![Visit Seel](./header.png)](https://seel.com)

# [Seel](https://seel.com)

Seel API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Seel&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>seel-java-sdk</artifactId>
  <version>1.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:seel-java-sdk:1.3.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/seel-java-sdk-1.3.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api-test.seel.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClaimApi* | [**getAllClaims**](docs/ClaimApi.md#getAllClaims) | **GET** /{partner}/claims | List claims
*ClaimApi* | [**getById**](docs/ClaimApi.md#getById) | **GET** /{partner}/claims/{claim_id} | Get a claim
*ContractApi* | [**getById**](docs/ContractApi.md#getById) | **GET** /{partner}/contracts/{contract_id} | Get a contract
*ContractApi* | [**listContracts**](docs/ContractApi.md#listContracts) | **GET** /{partner}/contracts | List contracts
*EventApi* | [**createNewEvent**](docs/EventApi.md#createNewEvent) | **POST** /{partner}/events | Create events
*FulfillmentApi* | [**cancelFulfillment**](docs/FulfillmentApi.md#cancelFulfillment) | **POST** /{partner}/orders/{order_id}/fulfillments/{fulfillment_id}/cancel | Cancel a fulfillment
*FulfillmentApi* | [**createNewFulfillment**](docs/FulfillmentApi.md#createNewFulfillment) | **POST** /{partner}/orders/{order_id}/fulfillments | Create a fulfillment
*FulfillmentApi* | [**getDetails**](docs/FulfillmentApi.md#getDetails) | **GET** /{partner}/orders/{order_id}/fulfillments/{fulfillment_id} | Get a fulfillment
*FulfillmentApi* | [**listFulfillments**](docs/FulfillmentApi.md#listFulfillments) | **GET** /{partner}/orders/{order_id}/fulfillments | List fulfillments
*FulfillmentApi* | [**updateFulfillmentDetails**](docs/FulfillmentApi.md#updateFulfillmentDetails) | **POST** /{partner}/orders/{order_id}/fulfillments/{fulfillment_id} | Update a fulfillment
*InvoiceApi* | [**getInvoiceById**](docs/InvoiceApi.md#getInvoiceById) | **GET** /{partner}/invoices/{invoice_id} | Get an invoice
*InvoiceApi* | [**listInvoices**](docs/InvoiceApi.md#listInvoices) | **GET** /{partner}/invoices | List invoices
*MerchantApi* | [**createNewMerchant**](docs/MerchantApi.md#createNewMerchant) | **POST** /{partner}/merchants | Create a merchant
*MerchantApi* | [**getMerchantDetails**](docs/MerchantApi.md#getMerchantDetails) | **GET** /{partner}/merchants/{merchant_id} | Get a merchant
*MerchantApi* | [**listAllMerchants**](docs/MerchantApi.md#listAllMerchants) | **GET** /{partner}/merchants | List merchants
*MerchantApi* | [**updateMerchantDetails**](docs/MerchantApi.md#updateMerchantDetails) | **POST** /{partner}/merchants/{merchant_id} | Update a merchant
*OrderApi* | [**batchCreateOrders**](docs/OrderApi.md#batchCreateOrders) | **POST** /{partner}/orders/batch | Batch create orders
*OrderApi* | [**cancelOrderById**](docs/OrderApi.md#cancelOrderById) | **POST** /{partner}/orders/{order_id}/cancel | Cancel an order
*OrderApi* | [**createNewOrder**](docs/OrderApi.md#createNewOrder) | **POST** /{partner}/orders | Create an order
*OrderApi* | [**getById**](docs/OrderApi.md#getById) | **GET** /{partner}/orders/{order_id} | Get an order
*OrderApi* | [**updateOrderDetails**](docs/OrderApi.md#updateOrderDetails) | **POST** /{partner}/orders/{order_id} | Update an order
*ProductApi* | [**addNewProduct**](docs/ProductApi.md#addNewProduct) | **POST** /{partner}/products | Create a product
*ProductApi* | [**batchCreateProducts**](docs/ProductApi.md#batchCreateProducts) | **POST** /{partner}/products/batch | Batch create products
*ProductApi* | [**getProductById**](docs/ProductApi.md#getProductById) | **GET** /{partner}/products/{product_id} | Get a product
*ProductApi* | [**listPlans**](docs/ProductApi.md#listPlans) | **GET** /{partner}/products/{product_id}/plans | Get product plans
*ProductApi* | [**removeProductById**](docs/ProductApi.md#removeProductById) | **DELETE** /{partner}/products/{product_id} | Delete a product
*ProductApi* | [**updateProductDetails**](docs/ProductApi.md#updateProductDetails) | **POST** /{partner}/products/{product_id} | Update a product
*QuoteApi* | [**generateQuote**](docs/QuoteApi.md#generateQuote) | **POST** /{partner}/quotes | Create a quote
*QuoteApi* | [**getById**](docs/QuoteApi.md#getById) | **GET** /{partner}/quotes/{quote_id} | Get a quote


## Documentation for Models

 - [Address](docs/Address.md)
 - [Claim](docs/Claim.md)
 - [ClaimClaimDetailsInner](docs/ClaimClaimDetailsInner.md)
 - [ClaimClaimDetailsInnerClaimItemsInner](docs/ClaimClaimDetailsInnerClaimItemsInner.md)
 - [ClaimGetAllClaimsResponse](docs/ClaimGetAllClaimsResponse.md)
 - [Contract](docs/Contract.md)
 - [ContractCoveredItemsInner](docs/ContractCoveredItemsInner.md)
 - [ContractListContractsResponse](docs/ContractListContractsResponse.md)
 - [Customer](docs/Customer.md)
 - [Event](docs/Event.md)
 - [EventCreateNewEventRequest](docs/EventCreateNewEventRequest.md)
 - [EventInfo](docs/EventInfo.md)
 - [Fulfillment](docs/Fulfillment.md)
 - [FulfillmentLineItemsInner](docs/FulfillmentLineItemsInner.md)
 - [FulfillmentListFulfillmentsResponse](docs/FulfillmentListFulfillmentsResponse.md)
 - [FulfillmentUpdateFulfillmentDetailsRequest](docs/FulfillmentUpdateFulfillmentDetailsRequest.md)
 - [FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner](docs/FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceInvoiceItemsInner](docs/InvoiceInvoiceItemsInner.md)
 - [InvoiceListInvoicesResponse](docs/InvoiceListInvoicesResponse.md)
 - [Item](docs/Item.md)
 - [ItemShippingOrigin](docs/ItemShippingOrigin.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantCreateNewMerchantRequest](docs/MerchantCreateNewMerchantRequest.md)
 - [MerchantCreateNewMerchantRequestSeelServicesInner](docs/MerchantCreateNewMerchantRequestSeelServicesInner.md)
 - [MerchantListAllMerchantsResponse](docs/MerchantListAllMerchantsResponse.md)
 - [MerchantSeelServicesInner](docs/MerchantSeelServicesInner.md)
 - [MerchantUpdateMerchantDetailsRequest](docs/MerchantUpdateMerchantDetailsRequest.md)
 - [MerchantUpdateMerchantDetailsRequestSeelServicesInner](docs/MerchantUpdateMerchantDetailsRequestSeelServicesInner.md)
 - [Order](docs/Order.md)
 - [OrderBatchCreateOrdersRequest](docs/OrderBatchCreateOrdersRequest.md)
 - [OrderBatchCreateOrdersResponse](docs/OrderBatchCreateOrdersResponse.md)
 - [OrderCreateNewOrderRequest](docs/OrderCreateNewOrderRequest.md)
 - [OrderCreateNewOrderRequestSeelServicesInner](docs/OrderCreateNewOrderRequestSeelServicesInner.md)
 - [OrderRefund](docs/OrderRefund.md)
 - [OrderRefundLineItemsInner](docs/OrderRefundLineItemsInner.md)
 - [OrderUpdateOrderDetailsRequest](docs/OrderUpdateOrderDetailsRequest.md)
 - [Product](docs/Product.md)
 - [ProductAddNewProductRequest](docs/ProductAddNewProductRequest.md)
 - [ProductAddNewProductRequestDimensions](docs/ProductAddNewProductRequestDimensions.md)
 - [ProductAddNewProductRequestIdentifiers](docs/ProductAddNewProductRequestIdentifiers.md)
 - [ProductAddNewProductRequestManufacturerWarranty](docs/ProductAddNewProductRequestManufacturerWarranty.md)
 - [ProductAddNewProductRequestProductAttributes](docs/ProductAddNewProductRequestProductAttributes.md)
 - [ProductAddNewProductRequestWeight](docs/ProductAddNewProductRequestWeight.md)
 - [ProductAttributes](docs/ProductAttributes.md)
 - [ProductBatchCreateProductsRequest](docs/ProductBatchCreateProductsRequest.md)
 - [ProductBatchCreateProductsResponse](docs/ProductBatchCreateProductsResponse.md)
 - [ProductDimensions](docs/ProductDimensions.md)
 - [ProductEnabledServicesInner](docs/ProductEnabledServicesInner.md)
 - [ProductIdentifiers](docs/ProductIdentifiers.md)
 - [ProductManufacturerWarranty](docs/ProductManufacturerWarranty.md)
 - [ProductPlan](docs/ProductPlan.md)
 - [ProductProductAttributes](docs/ProductProductAttributes.md)
 - [ProductUpdateProductDetailsRequest](docs/ProductUpdateProductDetailsRequest.md)
 - [ProductUpdateProductDetailsRequestDimensions](docs/ProductUpdateProductDetailsRequestDimensions.md)
 - [ProductUpdateProductDetailsRequestIdentifiers](docs/ProductUpdateProductDetailsRequestIdentifiers.md)
 - [ProductUpdateProductDetailsRequestManufacturerWarranty](docs/ProductUpdateProductDetailsRequestManufacturerWarranty.md)
 - [ProductUpdateProductDetailsRequestProductAttributes](docs/ProductUpdateProductDetailsRequestProductAttributes.md)
 - [ProductUpdateProductDetailsRequestWeight](docs/ProductUpdateProductDetailsRequestWeight.md)
 - [ProductWeight](docs/ProductWeight.md)
 - [Quote](docs/Quote.md)
 - [QuoteGenerateQuoteRequest](docs/QuoteGenerateQuoteRequest.md)
 - [SeelService](docs/SeelService.md)
 - [SeelServiceCoveredItemsInner](docs/SeelServiceCoveredItemsInner.md)
 - [ShippingDetails](docs/ShippingDetails.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
