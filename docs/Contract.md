

# Contract


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractId** | **String** | The unique identifier of the contract. |  [optional] |
|**orderId** | **String** | The identifier of the order associated with the contract. |  [optional] |
|**quoteId** | **String** | The identifier of the quote associated with the contract. |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**premium** | **Double** | The premium (i.e., cost) of the contract. |  [optional] |
|**premiumTax** | **Double** | The tax applied to the contract premium. |  [optional] |
|**currency** | **String** | The currency of the contract. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the contract (e.g., \&quot;active\&quot;, \&quot;cancelled\&quot;). |  [optional] |
|**cancelledTs** | **OffsetDateTime** | The timestamp in millisecond when the contract was cancelled (if applicable). |  [optional] |
|**createdTs** | **OffsetDateTime** | The timestamp in millisecond when the contract was created. |  [optional] |
|**updatedTs** | **OffsetDateTime** | The timestamp in millisecond when the contract was updated. |  [optional] |
|**coveredItems** | [**List&lt;ContractCoveredItemsInner&gt;**](ContractCoveredItemsInner.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| CANCELLED | &quot;cancelled&quot; |
| PENDING | &quot;pending&quot; |



