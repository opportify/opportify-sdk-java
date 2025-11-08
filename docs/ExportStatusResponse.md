

# ExportStatusResponse

Response containing the status and details of an export job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **UUID** | The batch job identifier. |  |
|**exportId** | **UUID** | The unique identifier for the export job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the export job. |  |
|**format** | [**FormatEnum**](#FormatEnum) | The output format of the export. |  |
|**filters** | [**List&lt;ExportFilter&gt;**](ExportFilter.md) | List of filters applied to the export. |  [optional] |
|**columns** | **List&lt;String&gt;** | List of columns included in the export. |  [optional] |
|**requestedAt** | **OffsetDateTime** | Timestamp when the export was requested (ISO 8601 format). |  |
|**updatedAt** | **OffsetDateTime** | Timestamp when the export status was last updated (ISO 8601 format). |  |
|**downloadUrl** | **URI** | Pre-signed URL to download the export file. Only present when status is &#x60;COMPLETED&#x60;. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Expiration timestamp for the download URL (ISO 8601 format). Only present when status is &#x60;COMPLETED&#x60;. |  [optional] |
|**resultSizeBytes** | **Integer** | Size of the export file in bytes. Only present when status is &#x60;COMPLETED&#x60;. |  [optional] |
|**errorCode** | **String** | Error code if the export failed. Only present when status is &#x60;FAILED&#x60;. |  [optional] |
|**errorMessage** | **String** | Error message if the export failed. Only present when status is &#x60;FAILED&#x60;. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;QUEUED&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;csv&quot; |
| JSON | &quot;json&quot; |



