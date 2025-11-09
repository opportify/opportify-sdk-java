

# GetEmailBatchStatus200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | Unique identifier for the batch job. |  [optional] |
|**name** | **String** | Name of the batch job, if provided. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the batch job. |  [optional] |
|**statusDescription** | **String** | Description of the status, particularly useful when status is ERROR. |  [optional] |
|**progress** | **Integer** | Percentage of completion for the batch job (0-100). |  [optional] |
|**downloadUrls** | [**GetEmailBatchStatus200ResponseDownloadUrls**](GetEmailBatchStatus200ResponseDownloadUrls.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;QUEUED&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| ERROR | &quot;ERROR&quot; |



