

# Product


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The unique identifier for the merchant within Seel&#39;s system. |  [optional] |
|**variantId** | **String** | Variant id, the unique identifier of a product SKU. Use &#39;product_id&#39; if the product doesn&#39;t have any variants. |  [optional] |
|**productId** | **String** | Product id. |  |
|**productTitle** | **String** | Name of the product. |  |
|**variantTitle** | **String** | Title of the variant. |  [optional] |
|**brandName** | **String** | The Product Brand or Vendor. |  |
|**manufacturer** | **String** | Manufacturer of the item. |  [optional] |
|**category1** | **String** | Main product category. |  [optional] |
|**category2** | **String** | Secondary product category. |  [optional] |
|**category3** | **String** | Tertiary product category. |  [optional] |
|**category4** | **String** | Fourth level product category. |  [optional] |
|**productDescription** | **String** | Text description of the product. |  [optional] |
|**imageUrl** | **URI** | URL of the product image. |  [optional] |
|**price** | **Double** | List price of the product. |  |
|**currency** | **String** | Currency of the price (e.g. USD, EUR). |  |
|**requiresShipping** | **Boolean** | Whether the product requires shipping. |  [optional] |
|**modelNumber** | **String** | Manufacturer model number. |  [optional] |
|**condition** | **String** | Condition - new, used, refurbished. |  [optional] |
|**sku** | **String** | Stock keeping unit. |  [optional] |
|**identifiers** | [**ProductIdentifiers**](ProductIdentifiers.md) |  |  [optional] |
|**manufacturerWarranty** | [**ProductManufacturerWarranty**](ProductManufacturerWarranty.md) |  |  [optional] |
|**dimensions** | [**ProductDimensions**](ProductDimensions.md) |  |  [optional] |
|**weight** | [**ProductWeight**](ProductWeight.md) |  |  [optional] |
|**productAttributes** | [**ProductProductAttributes**](ProductProductAttributes.md) |  |  [optional] |
|**createdTs** | **OffsetDateTime** | Timestamp when the product was created. |  [optional] |
|**updatedTs** | **OffsetDateTime** | Timestamp when the product was updated. |  [optional] |
|**enabledServices** | [**List&lt;ProductEnabledServicesInner&gt;**](ProductEnabledServicesInner.md) |  |  [optional] |



