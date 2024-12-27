

# AnalyzeEmail200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | The validated email address. |  |
|**emailProvider** | **String** | The email provider or domain name. |  |
|**emailType** | **String** | Type of email address (e.g., free, disposable, corporate, unknown). |  |
|**isFormatValid** | **Boolean** | Indicates if the email address has a valid format. |  |
|**emailCorrection** | **String** | Suggested corrected email address, if applicable. |  |
|**isDeliverable** | **Boolean** | Checks if the email address exists and is deliverable using SMTP handshake simulation. This involves connecting to the mail server and issuing commands to verify deliverability.  |  |
|**isCatchAll** | **Boolean** | Determines if the email domain is configured as a catch-all, which accepts emails for all addresses within the domain. This is verified through multiple email tests.  |  |
|**isReachable** | **Boolean** | Confirms if the email domain has valid MX DNS records using DNS lookup. |  |
|**emailDNS** | [**EmailDNS**](EmailDNS.md) |  |  |
|**riskReport** | [**RiskReport**](RiskReport.md) |  |  |



