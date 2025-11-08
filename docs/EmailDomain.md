

# EmailDomain

Summary of the domain-level enrichment returned when enrichment is available and not opted out via `enableDomainEnrichment`.  The `ageYears` value is sourced from stored enrichment data to keep responses deterministic across subsequent calls. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Fully qualified domain name associated with the email. |  |
|**enrichmentAvailable** | **Boolean** | Indicates whether enrichment data was available at analysis time.  When this is &#x60;false&#x60;, all enrichment fields (except &#x60;name&#x60;) represent safe defaults and must not be used for decision-making. Only the &#x60;name&#x60; field (the queried domain) and the default values of boolean and enum fields are meaningful; all other fields should be treated as informational only and ignored for any logic or risk assessment.  |  |
|**creationDate** | **String** | Domain creation timestamp (ISO 8601). Returns an empty string when enrichment data is unavailable. |  |
|**expirationDate** | **String** | Domain expiration timestamp (ISO 8601). Returns an empty string when enrichment data is unavailable. |  |
|**updatedDate** | **String** | Last WHOIS update timestamp (ISO 8601). Returns an empty string when enrichment data is unavailable. |  |
|**ageYears** | **Integer** | Domain age in whole years based on stored enrichment data. Returns 0 for domains younger than one year. |  |
|**registrar** | **String** | Registrar recorded for the domain. |  |
|**isBlockListed** | **Boolean** | Indicates whether the domain appears in monitored blocklists. |  |
|**mtaStsStatus** | [**MtaStsStatusEnum**](#MtaStsStatusEnum) | Status of the domain&#39;s MTA-STS configuration. |  |
|**bimiStatus** | [**BimiStatusEnum**](#BimiStatusEnum) | BIMI (Brand Indicators for Message Identification) status. |  |
|**hasVMC** | **Boolean** | Indicates whether a Verified Mark Certificate is associated with the domain. |  |
|**aRecordValid** | **Boolean** | Indicates whether the domain has valid A records. |  |
|**aRecordReverseHost** | **String** | Reverse hostname observed for the A record when available. Empty string when no reverse mapping is returned. |  |
|**sslValid** | **Boolean** | Indicates whether the domain serves a valid SSL certificate on common endpoints. |  |



## Enum: MtaStsStatusEnum

| Name | Value |
|---- | -----|
| PRESENT | &quot;present&quot; |
| INVALID | &quot;invalid&quot; |
| ABSENT | &quot;absent&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: BimiStatusEnum

| Name | Value |
|---- | -----|
| PRESENT | &quot;present&quot; |
| PRESENT_NO_VMC | &quot;present-no-vmc&quot; |
| INVALID | &quot;invalid&quot; |
| ABSENT | &quot;absent&quot; |
| UNKNOWN | &quot;unknown&quot; |



