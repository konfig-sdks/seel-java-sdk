

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | The unique identifier for the order in the system. |  [optional] |
|**orderNumber** | **String** | The reference number that is visible to the merchant and shopper. Use the order ID value if there is no separate order number. |  [optional] |
|**cartId** | **String** | The ID of a cart. |  [optional] |
|**merchantId** | **String** | The unique identifier for the merchant within Seel&#39;s system. |  [optional] |
|**sessionId** | **String** | The ID of the session. |  [optional] |
|**deviceId** | **String** | The ID of the client device. |  [optional] |
|**clientIp** | **String** | The IP address of the client. |  [optional] |
|**createdTs** | **OffsetDateTime** | Order created timestamp in milliseconds |  [optional] |
|**cancelledTs** | **OffsetDateTime** | Order cancelled timestamp in milliseconds |  [optional] |
|**updatedTs** | **OffsetDateTime** | Order updated timestamp in milliseconds |  [optional] |
|**lineItems** | [**List&lt;Item&gt;**](Item.md) | The list of items included in the quote. |  [optional] |
|**shippingAddress** | [**Address**](Address.md) |  |  [optional] |
|**fulfillments** | [**List&lt;Fulfillment&gt;**](Fulfillment.md) | The list of fulfillments for the order. |  [optional] |
|**seelServices** | [**List&lt;SeelService&gt;**](SeelService.md) | The list of Seel services of the order. |  [optional] |
|**refunds** | [**List&lt;OrderRefund&gt;**](OrderRefund.md) | The list of refunds for the order. |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**extraInfo** | **Object** | Additional information for the order |  [optional] |



