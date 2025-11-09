

# ExportFilter

Describes a filter applied to an export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | The field path that was filtered (supports dot notation for nested fields). |  |
|**kind** | [**KindEnum**](#KindEnum) | The type of filter applied. |  |
|**values** | **List&lt;String&gt;** | Array of values for string filters. |  [optional] |
|**min** | **BigDecimal** | Minimum value for numeric range filters. |  [optional] |
|**max** | **BigDecimal** | Maximum value for numeric range filters. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| NUMBER_RANGE | &quot;number-range&quot; |
| NUMBER | &quot;number&quot; |



