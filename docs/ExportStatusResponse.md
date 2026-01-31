

# ExportStatusResponse

Response containing the status and details of an export job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | The batch job identifier. Format: uuid. Example: \&quot;84d22c8b-2cb6-4606-bfb1-361244a097e4\&quot;.  |  |
|**exportId** | **String** | The unique identifier for the export job. Format: uuid. Example: \&quot;6f8d88ef-0896-4f69-90cd-7cc6ce5e6ddf\&quot;.  |  |
|**status** | **String** | Current status of the export job. Allowed values: &#x60;QUEUED&#x60;, &#x60;PROCESSING&#x60;, &#x60;COMPLETED&#x60;, &#x60;FAILED&#x60;. Example: &#x60;COMPLETED&#x60;.  |  |
|**format** | **String** | The output format of the export. Allowed values: &#x60;csv&#x60;, &#x60;json&#x60;. Example: &#x60;csv&#x60;.  |  |
|**filters** | [**List&lt;ExportFilter&gt;**](ExportFilter.md) | List of filters applied to the export. |  [optional] |
|**columns** | **List&lt;String&gt;** | List of columns included in the export. |  [optional] |
|**requestedAt** | **String** | Timestamp when the export was requested (ISO 8601 format). Format: date-time. Example: \&quot;2025-11-07T10:30:00.000Z\&quot;.  |  |
|**updatedAt** | **String** | Timestamp when the export status was last updated (ISO 8601 format). Format: date-time. Example: \&quot;2025-11-07T10:32:15.000Z\&quot;.  |  |
|**downloadUrl** | **String** | Pre-signed URL to download the export file. Only present when status is &#x60;COMPLETED&#x60;. Format: uri. Example: \&quot;https://opportify-batch-analysis.s3.amazonaws.com/...\&quot;.  |  [optional] |
|**expiresAt** | **String** | Expiration timestamp for the download URL (ISO 8601 format). Only present when status is &#x60;COMPLETED&#x60;. Format: date-time. Example: \&quot;2025-11-07T14:32:15.000Z\&quot;.  |  [optional] |
|**resultSizeBytes** | **Integer** | Size of the export file in bytes. Only present when status is &#x60;COMPLETED&#x60;. |  [optional] |
|**errorCode** | **String** | Error code if the export failed. Only present when status is &#x60;FAILED&#x60;. |  [optional] |
|**errorMessage** | **String** | Error message if the export failed. Only present when status is &#x60;FAILED&#x60;. |  [optional] |



