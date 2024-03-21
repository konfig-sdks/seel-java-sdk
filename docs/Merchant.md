

# Merchant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The unique identifier for the merchant within Seel&#39;s system. |  [optional] |
|**shopId** | **String** | The identifier for the shop or store within the partner&#39;s platform. |  [optional] |
|**adminDomain** | **String** | The original subdomain domain for the shop provided by the ecommerce platform, e.g. subdomain.myshopify.com |  [optional] |
|**shopDomain** | **String** | The custom domain name assigned to the shop, e.g. www.myshop.com. |  [optional] |
|**shopPlatform** | **String** | The source ecommerce platform for the shop, e.g. Shopify, BigCommerce. |  [optional] |
|**shopCurrency** | **String** | 3-letter ISO 4217 currency code for the primary currency used in the shop, e.g. USD, EUR. |  [optional] |
|**shopName** | **String** | The registered business name for the shop. |  [optional] |
|**contactName** | **String** | The registered business name for the merchant. |  [optional] |
|**contactEmail** | **String** | The contact email address on file for the merchant. |  [optional] |
|**contactPhoneNumber** | **String** | The phone number on file for the merchant. |  [optional] |
|**seelServices** | [**List&lt;MerchantSeelServicesInner&gt;**](MerchantSeelServicesInner.md) |  |  [optional] |
|**createdTs** | **OffsetDateTime** | The timestamp when the merchant was created. |  [optional] |
|**updatedTs** | **OffsetDateTime** | The timestamp when the merchant was last updated. |  [optional] |



