

# AddressSignals

Local-part parsing insights produced during analysis. The service always returns this payload; when a specific signal is unavailable, the corresponding value falls back to `false` or an empty string.  When `isNoReply` is `true`, the risk engine enforces a minimum `high` risk level and appends `noreply-detected` to `riskReport.baseAnalysis`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tagDetected** | **Boolean** | Indicates whether the local-part contains &#x60;+tag&#x60; sub-addressing. |  |
|**tagValue** | **String** | Raw tag contents following the plus sign. Empty string when a tag is not present or has no suffix. |  |
|**normalizedAddress** | **String** | Email rebuilt without the tag. Always lower-case. |  |
|**isRoleAddress** | **Boolean** | True when the local-part maps to a catalogued role inbox (e.g., support, sales, billing). |  |
|**roleType** | **String** | Role category slug. Empty string when &#x60;isRoleAddress&#x60; is false. |  |
|**isNoReply** | **Boolean** | True when the local-part matches no-reply or do-not-reply patterns (multi-language aware). |  |
|**noReplyPattern** | **String** | Canonical pattern matched when &#x60;isNoReply&#x60; is true (for example &#x60;noreply&#x60;, &#x60;no-responder&#x60;, &#x60;mailer-daemon&#x60;). Empty string when no pattern applies. |  |



