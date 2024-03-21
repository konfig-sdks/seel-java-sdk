

# ProductPlan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the protection plan. |  [optional] |
|**id** | **String** | ID of the protection plan. |  |
|**name** | **String** | Name of the protection plan. |  |
|**price** | **Double** | Price of the plan. |  |
|**currency** | **String** | The three-letter currency code (ISO 4217 format). |  |
|**imageUrl** | **URI** | The imageUrl for the warranty plan. Use this as the product image for the warranty plan SKU(s) in your store. |  [optional] |
|**url** | **URI** | A link to the extended warranty plan terms and information. Any offer display must include a “Learn More” or “See Plan Details” call-to-action that enables the customer to see exactly what the warranty plan covers. |  [optional] |
|**termLength** | **Integer** | The length of term in months. |  |
|**coverageStarts** | **String** | \&quot;immediate\&quot; - right after purchase \&quot;after\&quot; - coverage starts after the manufacturer&#39;s warranty has expired |  |
|**coverageIncludes** | **String** | \&quot;base”, which means the extended warranty is a base plan covering mechanical and electrical failures through normal use, or “adh”, which means the plan includes coverage for accidental damage (i.e. “Accidental Damage in Handling”) |  |
|**serviceType** | **String** | “replacement” (the damaged item is replaced by a new or refurbished equivalent), “repair_depot” (the customer mails the damaged item to a repair facility), or “repair_onsite” (a repair technician goes out to the customer’s home to repair the item) |  |
|**replacementType** | **String** | Indicates whether the damaged item will be replaced by a “new” or “refurbished” item. |  |
|**deductible** | **Double** | The amount of the deductible charged to the customer during a claim, if there is one. For most Extend protection plans, there is no deductible. |  |



