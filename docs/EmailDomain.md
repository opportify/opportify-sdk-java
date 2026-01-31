

# EmailDomain

Summary of the domain-level enrichment returned when enrichment is available and not opted out via `enableDomainEnrichment`.  The `ageYears` value is sourced from stored enrichment data to keep responses deterministic across subsequent calls. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Fully qualified domain name associated with the email. Default: empty string. Example: \&quot;company.com\&quot;.  |  |
|**enrichmentAvailable** | **Boolean** | Indicates whether enrichment data was available at analysis time.  When this is &#x60;false&#x60;, all enrichment fields (except &#x60;name&#x60;) represent safe defaults and must not be used for decision-making. Only the &#x60;name&#x60; field (the queried domain) and the default values of boolean and enum fields are meaningful; all other fields should be treated as informational only and ignored for any logic or risk assessment. Default: false. Example: true.  |  |
|**creationDate** | **String** | Domain creation timestamp (ISO 8601). Returns an empty string when enrichment data is unavailable. Format: date-time. Example: \&quot;2014-05-12T00:00:00Z\&quot;.  |  |
|**expirationDate** | **String** | Domain expiration timestamp (ISO 8601). Returns an empty string when enrichment data is unavailable. Format: date-time. Example: \&quot;2026-05-11T23:59:59Z\&quot;.  |  |
|**updatedDate** | **String** | Last WHOIS update timestamp (ISO 8601). Returns an empty string when enrichment data is unavailable. Format: date-time. Example: \&quot;2024-11-01T08:30:00Z\&quot;.  |  |
|**ageYears** | **Integer** | Domain age in whole years based on stored enrichment data. Returns 0 for domains younger than one year. Default: 0. Example: 11.  |  |
|**registrar** | **String** | Registrar recorded for the domain. Default: empty string. Example: \&quot;Namecheap, Inc.\&quot;.  |  |
|**isBlockListed** | **Boolean** | Indicates whether the domain appears in monitored blocklists. Default: false. Example: false.  |  |
|**mtaStsStatus** | **String** | Status of the domain&#39;s MTA-STS configuration. Allowed values: &#x60;present&#x60;, &#x60;invalid&#x60;, &#x60;absent&#x60;, &#x60;unknown&#x60;. Default: &#x60;unknown&#x60;. Example: &#x60;present&#x60;.  |  |
|**bimiStatus** | **String** | BIMI (Brand Indicators for Message Identification) status. Allowed values: &#x60;present&#x60;, &#x60;present-no-vmc&#x60;, &#x60;invalid&#x60;, &#x60;absent&#x60;, &#x60;unknown&#x60;. Default: &#x60;unknown&#x60;. Example: &#x60;present-no-vmc&#x60;.  |  |
|**hasVMC** | **Boolean** | Indicates whether a Verified Mark Certificate is associated with the domain. Default: false. Example: false.  |  |
|**aRecordValid** | **Boolean** | Indicates whether the domain has valid A records. Default: false. Example: true.  |  |
|**aRecordReverseHost** | **String** | Reverse hostname observed for the A record when available. Empty string when no reverse mapping is returned. Default: empty string. Example: \&quot;reverse.company.com\&quot;.  |  |
|**sslValid** | **Boolean** | Indicates whether the domain serves a valid SSL certificate on common endpoints. Default: false. Example: true.  |  |



