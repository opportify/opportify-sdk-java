

# ExportRequest

Request body for creating a batch export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportType** | **String** | Output format for the export. If omitted, the server will use &#x60;csv&#x60; as the default format. Allowed values: &#x60;csv&#x60;, &#x60;json&#x60;. Example: &#x60;csv&#x60;.  |  [optional] |
|**filters** | **Map&lt;String, Object&gt;** | Field-level filters to apply to the export. Supports string filters (exact match, comma-separated, or arrays), numeric filters (exact values, arrays, or range objects with min/max), and nested field access using dot notation.  - Maximum 25 filters - Maximum 50 values per filter  |  [optional] |
|**columns** | **List&lt;String&gt;** | Array of field paths to include in the export. If omitted, all fields are included. Maximum 100 columns. |  [optional] |



