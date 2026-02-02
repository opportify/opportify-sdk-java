

# BatchAnalyzeEmailsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emails** | **List&lt;String&gt;** | Array of email addresses to analyze. |  |
|**name** | **String** | Optional name for the batch job. |  [optional] |
|**enableAI** | **Boolean** | Enable AI-based analysis for insights. |  [optional] |
|**enableAutoCorrection** | **Boolean** | Controls email auto-correction behavior for batch processing. Default: &#x60;false&#x60;.  - When set to &#x60;true&#x60;: The system will automatically apply corrections when highly confident. The analysis will be performed on corrected email addresses. - When set to &#x60;false&#x60;: The system will still suggest corrections in the results, but the analysis will remain based on the original email addresses provided.  |  [optional] |



