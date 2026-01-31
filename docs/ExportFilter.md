

# ExportFilter

Describes a filter applied to an export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | The field path that was filtered (supports dot notation for nested fields). |  |
|**kind** | **String** | The type of filter applied. Allowed values: &#x60;string&#x60;, &#x60;number-range&#x60;, &#x60;number&#x60;. Example: &#x60;number-range&#x60;.  |  |
|**values** | **List&lt;String&gt;** | Array of values for string filters. |  [optional] |
|**min** | **BigDecimal** | Minimum value for numeric range filters. |  [optional] |
|**max** | **BigDecimal** | Maximum value for numeric range filters. |  [optional] |



