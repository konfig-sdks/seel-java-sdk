

# Quote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quoteId** | **String** | The ID of the quote. |  [optional] |
|**cartId** | **String** | The ID of a cart. |  [optional] |
|**merchantId** | **String** | The unique identifier for the merchant within Seel&#39;s system. |  [optional] |
|**sessionId** | **String** | The ID of the session. |  [optional] |
|**deviceId** | **String** | The ID of the client device. |  [optional] |
|**clientIp** | **String** | The IP address of the client. |  [optional] |
|**type** | **String** | The type of the quote. |  [optional] |
|**price** | **Double** | The price of the quote. |  [optional] |
|**currency** | **String** | The three-letter currency code (ISO 4217 format), i.e. USD etc. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the quote. |  [optional] |
|**createdTs** | **OffsetDateTime** | Quote created timestamp in milliseconds |  [optional] |
|**lineItems** | [**List&lt;Item&gt;**](Item.md) | The list of items included in the quote. |  [optional] |
|**shippingAddress** | [**Address**](Address.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**extraInfo** | **Object** | Additional information for the order |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |



