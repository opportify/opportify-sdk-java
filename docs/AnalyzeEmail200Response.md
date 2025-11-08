

# AnalyzeEmail200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | Normalized email address returned by the service (always lower-case). |  |
|**emailProvider** | **String** | Provider slug derived from the domain, or &#x60;unknown&#x60; when not classified. |  |
|**emailType** | [**EmailTypeEnum**](#EmailTypeEnum) | Email classification based on provider and enrichment signals. |  |
|**isDeliverable** | [**IsDeliverableEnum**](#IsDeliverableEnum) | Checks if the email address exists and is deliverable using SMTP handshake simulation. This involves connecting to the mail server and issuing commands to verify deliverability. The possible answers are &#x60;yes&#x60;, &#x60;no&#x60;, or &#x60;unknown&#x60;. We guarantee a high confidence level on this parameter since this is a real time verification.  |  |
|**isCatchAll** | **Boolean** | Determines if the email domain is configured as a catch-all, which accepts emails for all addresses within the domain. This is verified through multiple email tests.  |  |
|**isMailboxFull** | **Boolean** | Determines if the mailbox associated with the email is full, in association with isDeliverable field, it can give a reason why the email is not deliverable.  |  |
|**isReachable** | **Boolean** | Confirms if the email domain has valid MX DNS records using DNS lookup. |  |
|**isFormatValid** | **Boolean** | Indicates if the email address meets syntax validation rules. |  |
|**emailCorrection** | **String** | Suggested corrected email address when auto-correction is confident. Present only when &#x60;enableAutoCorrection&#x60; is true and a correction exists. |  [optional] |
|**addressSignals** | [**AddressSignals**](AddressSignals.md) | Local-part parsing details for the analyzed address. Always present; fields default to empty strings when a signal is not applicable. |  |
|**emailDNS** | [**EmailDNS**](EmailDNS.md) |  |  |
|**riskReport** | [**RiskReportEmail**](RiskReportEmail.md) | AI-generated risk report detailing the evaluated risk bucket. Returned only when &#x60;enableAI&#x60; is true. |  [optional] |
|**domain** | [**EmailDomain**](EmailDomain.md) | Domain summary derived from enrichment providers. Omitted when enrichment is unavailable or &#x60;enableDomainEnrichment&#x60; is set to &#x60;false&#x60;. |  [optional] |



## Enum: EmailTypeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| FREE | &quot;free&quot; |
| DISPOSABLE | &quot;disposable&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: IsDeliverableEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| UNKNOWN | &quot;unknown&quot; |



