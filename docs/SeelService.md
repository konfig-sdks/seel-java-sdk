

# SeelService


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractId** | **String** | Cover ID |  [optional] |
|**quoteId** | **String** | The identifier of the quote associated with the contract. |  [optional] |
|**createdTs** | **OffsetDateTime** | Service created timestamp in milliseconds |  [optional] |
|**type** | **String** | Cover type of the service |  [optional] |
|**price** | **Double** | Price of the service |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the service |  [optional] |
|**coveredItems** | [**List&lt;SeelServiceCoveredItemsInner&gt;**](SeelServiceCoveredItemsInner.md) | The covered items |  [optional] |
|**extraInfo** | **Object** | Additional information for the service |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| CANCELLED | &quot;cancelled&quot; |
| PENDING | &quot;pending&quot; |



