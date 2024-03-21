

# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceId** | **String** | The ID of the invoice. |  [optional] |
|**merchantId** | **String** | The ID of the merchant. |  [optional] |
|**billingCycle** | **Integer** | The number of the billing cycle. |  [optional] |
|**billingDate** | **String** | The date when the merchant was charged for contracts sold. |  [optional] |
|**billingStartDate** | **String** | The start date of the billing cycle. |  [optional] |
|**billingEndDate** | **String** | The end date of the billing cycle. |  [optional] |
|**currency** | **String** | The three-letter currency code (ISO 4217 format). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the invoice. |  [optional] |
|**invoiceAmount** | **Double** | The amount of the invoice. |  [optional] |
|**invoiceLink** | **String** | URL of the invoice |  [optional] |
|**invoiceItems** | [**List&lt;InvoiceInvoiceItemsInner&gt;**](InvoiceInvoiceItemsInner.md) | A list of contracts associated with this invoice. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNPAID | &quot;unpaid&quot; |
| PAID | &quot;paid&quot; |



