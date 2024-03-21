

# OrderCreateNewOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The unique identifier for the order in the system. |  |
|**orderNumber** | **String** | The reference number that is visible to the merchant and shopper. Use the order ID value if there is no separate order number. |  |
|**sessionId** | **String** | Shopping session ID of the order |  |
|**cartId** | **String** | Cart ID of the order |  [optional] |
|**merchantId** | **String** | Merchant ID of the order |  [optional] |
|**deviceId** | **String** | The ID of the client device. |  [optional] |
|**clientIp** | **String** | The IP address of the client. |  [optional] |
|**createdTs** | **String** | Order created timestamp in milliseconds |  |
|**lineItems** | [**List&lt;Item&gt;**](Item.md) | The list of items included in the order. |  |
|**shippingAddress** | [**Address**](Address.md) |  |  |
|**customer** | [**Customer**](Customer.md) |  |  |
|**seelServices** | [**List&lt;OrderCreateNewOrderRequestSeelServicesInner&gt;**](OrderCreateNewOrderRequestSeelServicesInner.md) | The list of Seel services of the order. |  [optional] |
|**extraInfo** | **Object** | Additional information for the order |  [optional] |



