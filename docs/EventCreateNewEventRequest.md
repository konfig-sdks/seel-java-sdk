

# EventCreateNewEventRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **String** | Session ID |  |
|**eventTs** | **String** | Event created timestamp in milliseconds |  [optional] |
|**customerId** | **String** | Customer ID |  |
|**deviceId** | **String** | Device ID |  [optional] |
|**clientIp** | **String** | Browser IP address |  [optional] |
|**eventSource** | **String** | Event source |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Event type |  |
|**eventInfo** | **Object** | Each event_type has its own unique schema. For specific details, please refer to the custom pixel guide. |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| PRODUCT_PAGE_ENTER | &quot;product_page_enter&quot; |
| PRODUCT_PAGE_EXIT | &quot;product_page_exit&quot; |
| PRODUCT_SHARE | &quot;product_share&quot; |
| FAVORITE_ADD | &quot;favorite_add&quot; |
| FAVORITE_REMOVE | &quot;favorite_remove&quot; |
| CART_ADD | &quot;cart_add&quot; |
| CART_REMOVE | &quot;cart_remove&quot; |
| RA_CHECKED | &quot;ra_checked&quot; |
| RA_UNCHECKED | &quot;ra_unchecked&quot; |
| CHECKOUT_BEGIN | &quot;checkout_begin&quot; |
| CHECKOUT_COMPLETE | &quot;checkout_complete&quot; |



