

# Whois

### WHOIS Details This object provides sanitized and normalized WHOIS information for an IP address, including details about the Regional Internet Registry (RIR), Autonomous System Number (ASN), organization, and contact information.  #### Key Features: - **RIR Details**: Identify the Regional Internet Registry managing the IP address. - **ASN Information**: Obtain the Autonomous System Number details, including the ASN identifier, name, and description. - **Organization Data**: Retrieve organization details, such as the ID, name, type, description, address, country, and contact information. - **Contact Information**: Access contact details for abuse, admin, and tech issues, including the contact ID, type, name, address, phone, fax, and email.  ---  ### Response Elements 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rir** | **String** | Regional Internet Registry managing the IP. |  [optional] |
|**asn** | [**Asn**](Asn.md) |  |  [optional] |
|**organization** | [**Organization**](Organization.md) |  |  [optional] |
|**abuseContact** | [**AbuseContact**](AbuseContact.md) |  |  [optional] |
|**adminContact** | [**AdminContact**](AdminContact.md) |  |  [optional] |
|**techContact** | [**TechContact**](TechContact.md) |  |  [optional] |



