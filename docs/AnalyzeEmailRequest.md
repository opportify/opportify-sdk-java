

# AnalyzeEmailRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The email address to validate. |  |
|**enableAI** | **Boolean** | Enable AI-driven risk analysis. Optional; defaults to &#x60;true&#x60;.  |  [optional] |
|**enableAutoCorrection** | **Boolean** | Controls email auto-correction behavior. Default: &#x60;false&#x60;.  - When set to &#x60;true&#x60;: If the system is highly confident about a correction, it will automatically apply it. The analysis will be performed on the corrected email address. The response will include the corrected email in &#x60;emailAddress&#x60; and &#x60;emailCorrection&#x60;, with the original input preserved in &#x60;emailAutoCorrectedFrom&#x60;. - When set to &#x60;false&#x60;: The system will still identify and return potential corrections in the &#x60;emailCorrection&#x60; field when confident, but the analysis will remain based on the original email address provided in the input. The &#x60;emailAutoCorrectedFrom&#x60; field will not be present.  |  [optional] |
|**enableDomainEnrichment** | **Boolean** | Include domain-level enrichment details. Optional; defaults to &#x60;true&#x60;. Set to &#x60;false&#x60; to omit the &#x60;domain&#x60; block even when the data exists.  |  [optional] |



