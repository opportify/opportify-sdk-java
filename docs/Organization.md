

# Organization

Organization details for an IP address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgId** | **String** | Organization ID. |  [optional] |
|**orgName** | **String** | Organization name. |  [optional] |
|**orgType** | **String** | Organization type. |  [optional] |
|**descr** | **List&lt;String&gt;** | Organization description. It might return different values based on the data source. Some provide ownership, address, others provide a more abstract description. Our system tries to sanitize removing visual blocks special characters (+++, ---, ...). |  [optional] |
|**address** | **List&lt;String&gt;** | Organization address details. No standard address format is guaranteed. |  [optional] |
|**country** | **String** | Country code of the organization with 2 digits. (ISO 3166-1 alpha-2) |  [optional] |
|**phone** | **List&lt;String&gt;** | Contact phone numbers. |  [optional] |
|**fax** | **List&lt;String&gt;** | Contact fax numbers. |  [optional] |
|**email** | **List&lt;String&gt;** | Previously sanitized and validated contact email addresses always in lower case. |  [optional] |



