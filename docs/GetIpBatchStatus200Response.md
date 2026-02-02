

# GetIpBatchStatus200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | Unique identifier for the batch job. |  [optional] |
|**name** | **String** | Name of the batch job, if provided. |  [optional] |
|**status** | **String** | Current status of the batch job. Allowed values: &#x60;QUEUED&#x60;, &#x60;PROCESSING&#x60;, &#x60;COMPLETED&#x60;, &#x60;ERROR&#x60;. Example: &#x60;COMPLETED&#x60;.  |  [optional] |
|**statusDescription** | **String** | Description of the status, particularly useful when status is ERROR. |  [optional] |
|**progress** | **Integer** | Percentage of completion for the batch job (0-100). |  [optional] |
|**downloadUrls** | [**GetEmailBatchStatus200ResponseDownloadUrls**](GetEmailBatchStatus200ResponseDownloadUrls.md) |  |  [optional] |



