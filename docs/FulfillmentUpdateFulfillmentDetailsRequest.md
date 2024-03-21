

# FulfillmentUpdateFulfillmentDetailsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedTs** | **OffsetDateTime** | Fulfillment updated timestamp in milliseconds |  |
|**trackingNumber** | **String** | The tracking number of the fulfillment |  |
|**carrier** | **String** | The shipping carrier of the fulfillment |  |
|**trackingUrl** | **String** | The tracking url of the fulfillment |  [optional] |
|**shipmentStatus** | [**ShipmentStatusEnum**](#ShipmentStatusEnum) | The shipping status of the fulfillment |  |
|**lineItems** | [**List&lt;FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner&gt;**](FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner.md) | The list of items included in the fulfillment. |  |



## Enum: ShipmentStatusEnum

| Name | Value |
|---- | -----|
| SHIPPED | &quot;shipped&quot; |
| DELIVERED | &quot;delivered&quot; |



