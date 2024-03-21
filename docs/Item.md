

# Item


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lineItemId** | **String** | The ID of the item. |  |
|**productId** | **String** | The ID of the product. |  |
|**productTitle** | **String** | The title of the product. |  |
|**productDescription** | **String** | The description of the product. |  [optional] |
|**variantId** | **String** | The ID of the product variant. |  [optional] |
|**variantTitle** | **String** | The title of the product variant. |  [optional] |
|**sku** | **String** | The sku of the product variant. |  [optional] |
|**sellerId** | **String** | The ID of the seller. |  [optional] |
|**sellerName** | **String** | The name of the seller. |  [optional] |
|**brandName** | **String** | The brand name of the product. |  [optional] |
|**quantity** | **Integer** | The quantity of the product. |  |
|**price** | **Double** | The price of the product. |  |
|**allocatedDiscounts** | **Double** | The allocated discounts of the product. |  |
|**salesTax** | **Double** | The sales tax of the product. |  |
|**retailPrice** | **Double** | The retail price of the product. |  [optional] |
|**finalPrice** | **Double** | The final price of the product. |  |
|**currency** | **String** | The currency of the price. |  |
|**requiresShipping** | **Boolean** | Whether the item requires shipping or not. |  |
|**productUrl** | **String** | The URL of the product. |  [optional] |
|**imageUrl** | **String** | The URL of the product image. |  [optional] |
|**category1** | **String** | The main category of the product. |  |
|**category2** | **String** | The sub category of the product. |  |
|**category3** | **String** | The sub category of the product. |  [optional] |
|**category4** | **String** | The sub category of the product. |  [optional] |
|**isFinalSale** | **Boolean** | Whether the item is final sale or not. |  |
|**condition** | [**ConditionEnum**](#ConditionEnum) | The physical condition of the item (e.g. new, used, refurbished) |  |
|**productAttributes** | [**ProductAttributes**](ProductAttributes.md) |  |  [optional] |
|**shippingOrigin** | [**ItemShippingOrigin**](ItemShippingOrigin.md) |  |  [optional] |
|**extraInfo** | **Object** | Extra information about the product. |  [optional] |



## Enum: ConditionEnum

| Name | Value |
|---- | -----|
| NEW | &quot;new&quot; |
| USED | &quot;used&quot; |
| REFURBISHED | &quot;refurbished&quot; |



