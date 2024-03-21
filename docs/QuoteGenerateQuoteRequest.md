

# QuoteGenerateQuoteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cartId** | **String** | The ID of a cart. |  [optional] |
|**merchantId** | **String** | The unique identifier for the merchant within Seel&#39;s system. |  [optional] |
|**sessionId** | **String** | The ID of the shopping session. |  |
|**deviceId** | **String** | The ID of the client device. |  [optional] |
|**clientIp** | **String** | The IP address of the client. |  [optional] |
|**type** | **String** | The type of the quote. |  |
|**lineItems** | [**List&lt;Item&gt;**](Item.md) | The list of items included in the quote. |  |
|**shippingAddress** | [**Address**](Address.md) |  |  |
|**customer** | [**Customer**](Customer.md) |  |  |
|**extraInfo** | **Object** | Additional information for the quote |  [optional] |



