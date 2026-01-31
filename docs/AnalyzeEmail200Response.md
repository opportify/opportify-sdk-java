

# AnalyzeEmail200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | Normalized email address returned by the service (always lower-case). |  |
|**emailProvider** | **String** | Provider slug derived from the domain, or &#x60;unknown&#x60; when not classified. |  |
|**emailType** | **String** | Email classification based on provider and enrichment signals. Allowed values: &#x60;private&#x60;, &#x60;free&#x60;, &#x60;disposable&#x60;, &#x60;unknown&#x60;. Example: &#x60;free&#x60;.  |  |
|**isDeliverable** | **String** | Checks if the email address exists and is deliverable using SMTP handshake simulation. This involves connecting to the mail server and issuing commands to verify deliverability. The possible answers are &#x60;yes&#x60;, &#x60;no&#x60;, or &#x60;unknown&#x60;. We guarantee a high confidence level on this parameter since this is a real time verification. Allowed values: &#x60;yes&#x60;, &#x60;no&#x60;, &#x60;unknown&#x60;. Example: &#x60;yes&#x60;.  |  |
|**isCatchAll** | **Boolean** | Determines if the email domain is configured as a catch-all, which accepts emails for all addresses within the domain. This is verified through multiple email tests.  |  |
|**isMailboxFull** | **Boolean** | Determines if the mailbox associated with the email is full, in association with isDeliverable field, it can give a reason why the email is not deliverable.  |  |
|**isReachable** | **Boolean** | Confirms if the email domain has valid MX DNS records using DNS lookup. |  |
|**isFormatValid** | **Boolean** | Indicates if the email address meets syntax validation rules. |  |
|**emailCorrection** | **String** | The corrected email address when the system is highly confident about a typo or misspelling. Always present; empty string when no correction is needed.  - When &#x60;enableAutoCorrection&#x60; is &#x60;true&#x60; and correction applied: Contains the corrected email (same as &#x60;emailAddress&#x60;). The original input is available in &#x60;emailAutoCorrectedFrom&#x60;. - When &#x60;enableAutoCorrection&#x60; is &#x60;false&#x60;: Contains the suggested correction, but &#x60;emailAddress&#x60; and all analysis remain based on the original input. - When no correction is needed: Empty string.  |  |
|**emailAutoCorrectedFrom** | **String** | The original email address provided in the request, before auto-correction was applied. This field is only present when &#x60;enableAutoCorrection&#x60; is &#x60;true&#x60; AND the system automatically applied a correction.  When this field is present, it indicates that: - The user submitted this email address - The system detected a confident correction - &#x60;emailAddress&#x60; contains the corrected value used for analysis - &#x60;emailCorrection&#x60; contains the same corrected value  |  [optional] |
|**addressSignals** | [**AddressSignals**](AddressSignals.md) | Local-part parsing details for the analyzed address. Always present; fields default to empty strings when a signal is not applicable. |  |
|**emailDNS** | [**EmailDNS**](EmailDNS.md) |  |  |
|**riskReport** | [**RiskReportEmail**](RiskReportEmail.md) | AI-generated risk report detailing the evaluated risk bucket. Returned only when &#x60;enableAI&#x60; is true. |  [optional] |
|**domain** | [**EmailDomain**](EmailDomain.md) | Domain summary derived from enrichment providers. Omitted when enrichment is unavailable or &#x60;enableDomainEnrichment&#x60; is set to &#x60;false&#x60;. |  [optional] |



