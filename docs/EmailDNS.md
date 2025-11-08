

# EmailDNS

DNS details for an email address domain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mx** | **List&lt;String&gt;** | Mail exchange records for the domain formatted as \&quot;&lt;priority&gt; &lt;hostname&gt;\&quot;. Records are sorted ascending by numeric priority before responding. |  |
|**spfValid** | **Boolean** | Indicates whether SPF validation succeeded for the domain. |  |
|**dkimConfigured** | **Boolean** | Indicates whether DKIM selectors are configured for the domain. |  |
|**dmarcValid** | **Boolean** | Indicates whether a valid DMARC policy is present for the domain. |  |
|**mxRelay** | **String** | Primary MX relay hostname identified during analysis. |  |
|**mxRelayCategory** | **String** | Categorization of the MX relay (provider slug or classification when available). |  |



