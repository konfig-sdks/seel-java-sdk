

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Event ID |  [optional] |
|**sessionId** | **String** | Session ID |  [optional] |
|**eventTs** | **String** | Event created timestamp |  [optional] |
|**customerId** | **String** | Customer ID |  [optional] |
|**deviceId** | **String** | Device ID |  [optional] |
|**browserIp** | **String** | Browser IP address |  [optional] |
|**eventSource** | **String** | Event source |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Event type |  [optional] |
|**eventInfo** | **Object** |  |  [optional] |



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



