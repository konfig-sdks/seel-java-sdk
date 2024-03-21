

# Claim


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**claimId** | **String** | The unique identifier of the claim. |  [optional] |
|**orderId** | **String** | The identifier of the order associated with the claim. |  [optional] |
|**contractId** | **String** | The identifier of the contract associated with the claim. |  [optional] |
|**payoutAmount** | **Double** | The settled amount of the claim. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the claim. |  [optional] |
|**claimType** | [**ClaimTypeEnum**](#ClaimTypeEnum) | The status of the claim. |  [optional] |
|**rejectReason** | **String** | The reject reason of the claim. |  [optional] |
|**claimDetails** | [**List&lt;ClaimClaimDetailsInner&gt;**](ClaimClaimDetailsInner.md) | Items related to the claim |  [optional] |
|**updatedTs** | **OffsetDateTime** | The timestamp in milliseconds when the contract was cancelled (if applicable). |  [optional] |
|**createdTs** | **OffsetDateTime** | The timestamp in milliseconds when the contract was created. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |



## Enum: ClaimTypeEnum

| Name | Value |
|---- | -----|
| RETURN | &quot;return&quot; |
| LOSS | &quot;loss&quot; |
| DAMAGE | &quot;damage&quot; |
| DELAY | &quot;delay&quot; |
| THEFT | &quot;theft&quot; |



