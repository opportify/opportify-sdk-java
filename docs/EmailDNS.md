

# EmailDNS

DNS details for an email address domain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mx** | **List&lt;String&gt;** | Mail exchange records for the domain formatted as \&quot;&lt;priority&gt; &lt;hostname&gt;\&quot;. Records are sorted ascending by numeric priority before responding. Default: empty array. Example: [\&quot;0 mx1.example.com\&quot;, \&quot;10 mx2.example.com\&quot;].  |  |
|**spfValid** | **Boolean** | Indicates whether SPF validation succeeded for the domain. Default: false. Example: true.  |  |
|**dkimConfigured** | **Boolean** | Indicates whether DKIM selectors are configured for the domain. Default: false. Example: true.  |  |
|**dmarcValid** | **Boolean** | Indicates whether a valid DMARC policy is present for the domain. Default: false. Example: false.  |  |
|**mxRelay** | **String** | Primary MX relay hostname identified during analysis. Default: empty string. Example: \&quot;mx1.example.com\&quot;.  |  |
|**mxRelayCategory** | **String** | Categorization of the MX relay (provider slug or classification when available). Default: empty string. Example: \&quot;google\&quot;.  |  |



