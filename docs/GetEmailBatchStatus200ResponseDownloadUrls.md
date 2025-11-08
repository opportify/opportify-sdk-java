

# GetEmailBatchStatus200ResponseDownloadUrls

Available download URLs for the batch job results. Only present when status is \"COMPLETED\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**csv** | **String** | Pre-signed URL to download results in CSV format. |  [optional] |
|**json** | **String** | Pre-signed URL to download results in JSON format. |  [optional] |
|**csvCompressed** | **String** | Pre-signed URL to download compressed results in CSV format (gzip). |  [optional] |
|**jsonCompressed** | **String** | Pre-signed URL to download compressed results in JSON format (gzip). |  [optional] |



